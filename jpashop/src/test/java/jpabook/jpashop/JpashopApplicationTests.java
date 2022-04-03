package jpabook.jpashop;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class JpashopApplicationTests {

    @PersistenceUnit
    private EntityManagerFactory emf;

    @PersistenceContext
    private EntityManager em;

    @PersistenceContext
    private EntityManager em9;

    @Test
    public void 엔티티매니저_호출시마다_새로운인스턴스리턴() {
        EntityManager em1 = emf.createEntityManager();
        EntityManager em2 = emf.createEntityManager();
        EntityManager em3 = emf.createEntityManager();

        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);
        System.out.println(em);
        System.out.println(em9);

        assertThat(em1, is(not(sameInstance(em2))));
        assertThat(em1, is(not(sameInstance(em3))));
        assertThat(em, is(not(sameInstance(em1))));
        assertThat(em, is(not(sameInstance(em2))));
        assertThat(em, is(not(sameInstance(em3))));
    }


}
