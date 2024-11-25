package pe.edu.i202221113.crud;

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
        // Buscar el país por su código (en este caso, 'PER')
        Country country = em.find(Country.class, "PER");  // Suponiendo que 'PER' es el código del país





        em.remove(country);
        em.getTransaction().commit(); // Confirmar la transacción
        em.close();







    }
}
