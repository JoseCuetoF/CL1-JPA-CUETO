package pe.edu.i202221113.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202221113.Entity.Country;

public class JPAFind {

    public static void main(String[] args) {


        // Crear un EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // Consultar el país con código "PER"
        Country country = em.find(Country.class, "IMG");
        System.out.println(country.toString());
/*
        if (peru != null) {
            // Filtrar las ciudades con población > 700k
            List<City> cities = peru.getCities().stream()
                    .filter(city -> city.getPopulation() > 700000)
                    .collect(Collectors.toList());

            // Imprimir las ciudades encontradas
            cities.forEach(city -> System.out.println("Ciudad: " + city.getName() + ", Población: " + city.getPopulation()));
        }
*/

    }
}
