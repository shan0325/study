package hellojpa;

import sun.nio.cs.ext.IBM037;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            member.setName("HelloB");
            member.setCreateBy("kim");
            member.setCreateDate(LocalDateTime.now());
            em.persist(member);

            /*Member findMember = em.find(Member.class, 2L);
            findMember.setName("HelloJPA");*/

            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                                    .setFirstResult(0)
                                    .setMaxResults(8)
                                    .getResultList();

            for (Member m : result) {
                System.out.println("member : " + m.getName());
            }

            Book book = new Book();
            book.setName("jpa 강좌");
            book.setPrice(10000);
            book.setAuthor("홍길동");
            book.setIsbn("1234");
            em.persist(book);

            Movie movie = new Movie();
            movie.setName("바람과함께사라지다");
            movie.setPrice(20000);
            movie.setDirector("디렉터");
            movie.setActor("테스트");
            em.persist(movie);

            em.flush();
            em.clear();

            Item findBook = em.find(Item.class, book.getId());
            System.out.println("findBook = " + findBook);

            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();

    }
}
