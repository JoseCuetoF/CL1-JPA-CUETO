package pe.edu.i202221113.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import pe.edu.i202221113.Entity.City;
import pe.edu.i202221113.Entity.Country;
import pe.edu.i202221113.Entity.CountryLanguage;
import pe.edu.i202221113.Entity.CountryLanguagePk;

import java.util.List;

public class JPAPersist {


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();


        Country paisImaginario = new Country();
        paisImaginario.setCode("FNT");
        paisImaginario.setName("FANTASIA");
        paisImaginario.setContinent("Africa");
        paisImaginario.setRegion("Northern Africa");
        paisImaginario.setSurfacearea(9000.00);
        paisImaginario.setIndepyear(1985);
        paisImaginario.setPopulation(10000000);
        paisImaginario.setLifeexpectancy(78.0);
        paisImaginario.setGnp(120.0);
        paisImaginario.setGnpold(110.0);
        paisImaginario.setLocalname("Fantasia");
        paisImaginario.setGovernmentform("Federation");
        paisImaginario.setHeadofstate("LORD FANT");
        paisImaginario.setCapital(1);
        paisImaginario.setCode2("F");

        City cA = new City("CiudadAlfa",paisImaginario, "DistritoUno", 50000);
        City cB = new City("CiudadBeta", paisImaginario, "DistritoDos", 250000);
        City cC = new City("CiudadGamma", paisImaginario, "DistritoTres", 150000);


        CountryLanguage idiPrimario = new CountryLanguage(new CountryLanguagePk("FNT", "Fantasiano"), "R", 75.0, paisImaginario);
        CountryLanguage idiSecundario = new CountryLanguage(new CountryLanguagePk("FNT", "Antiguo"), "F", 25.0, paisImaginario);

        paisImaginario.setCities(List.of(cA, cB, cC));
        paisImaginario.setLanguages(List.of(idiPrimario, idiSecundario));


        em.getTransaction().commit();
        em.close();
    }
}