
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {

    private EntityManager manager;

    public JpaTest(EntityManager manager) {
        this.manager = manager;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        EntityManagerFactory factory =   
              Persistence.createEntityManagerFactory("example");
        EntityManager manager = factory.createEntityManager();
        JpaTest test = new JpaTest(manager);

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            test.createReunion();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();

        test.listReunion();
            
        manager.close();
        System.out.println(".. done");
    }

    private void createReunion() {
        int numOfReunion = manager.createQuery("Select r From Reunion r", Reunion.class).getResultList().size();
    }

    private void listReunion() {
        List<Reunion> resultList = manager.createQuery("Select r From Reunion r", Reunion.class).getResultList();
        System.out.println("num of reunions:" + resultList.size());
        for (Reunion next : resultList) {
            System.out.println("next r: " + next);
        }
    }
}
