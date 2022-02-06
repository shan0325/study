package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            /*Member member = new Member();
            member.setId(2L);
            member.setName("HelloB");
            em.persist(member);*/

            /*Member findMember = em.find(Member.class, 1L);
            findMember.setName("HelloJPA");*/

            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                                    .setFirstResult(0)
                                    .setMaxResults(8)
                                    .getResultList();

            for (Member member : result) {
                System.out.println("member : " + member.getName());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();

    }
}
