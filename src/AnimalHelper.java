import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

public class AnimalHelper {
    EntityManagerFactory managerFactory;
    EntityManager entityManager;

    public AnimalHelper(){
        managerFactory = Persistence.createEntityManagerFactory("moh");
        entityManager = managerFactory.createEntityManager();
    }

    public AnimalJPA getById(int id){
        entityManager.getTransaction().begin();
        AnimalJPA animalJPA = entityManager.find(AnimalJPA.class, id);
        entityManager.getTransaction().commit();
        managerFactory.close();
        return animalJPA;
    }

    public void add(AnimalJPA animalJPA){
        entityManager.getTransaction().begin();
        entityManager.merge(animalJPA);
        entityManager.getTransaction().commit();
        managerFactory.close();
    }
    public void remove(AnimalJPA animalJPA){
        entityManager.getTransaction().begin();
        entityManager.remove(animalJPA);
        entityManager.getTransaction().commit();
        managerFactory.close();
    }
    @SuppressWarnings("uncheked")
    public List<AnimalJPA> getAll(){
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select animaljpa from AnimalJPA animaljpa");
        List<AnimalJPA> result = query.getResultList();
        entityManager.getTransaction().commit();
        managerFactory.close();
        return result;
    }
}
