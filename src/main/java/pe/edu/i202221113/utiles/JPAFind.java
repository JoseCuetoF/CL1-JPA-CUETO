package pe.edu.i202221113.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202221113.Entity.Country;

public class JPAFind {

    public static void main(String[] args) {


        // Crear un EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        // Buscar el país por su código (en este caso, 'PER')
        Country country = em.find(Country.class, "PER");

        if (country != null) {
            System.out.println("Se encontraron las siguientes ciudades de Perú:");

            // forEach para iterar sobre las ciudades y aplicar una lambda
            country.getCities().forEach(city -> {
                System.out.println("Ciudad: " + city.getName() + ", Población: " + city.getPopulation());
                if (city.getPopulation() > 700000) {
                    System.out.println("Ciudad filtrada: " + city.getName());
                }
            });
        }

    }
}
