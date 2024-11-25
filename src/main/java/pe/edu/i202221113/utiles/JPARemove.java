package pe.edu.i202221113.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import jakarta.persistence.Persistence;
import pe.edu.i202221113.Entity.Country;

public class JPARemove {
    public static void main(String[] args) {



        // Crear un EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Country country = em.find(Country.class, "FNT");

        em.remove(country);
        em.getTransaction().commit();
        em.close();





    }
}
