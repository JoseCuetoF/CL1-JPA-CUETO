package pe.edu.i202221113.Entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="country")
public class Country {
    @Id
    @JoinColumn(name = "Code")
    private String code;
    private String name;
    private String continent;
    private String region;
    private double surfacearea;
    private int indepyear;
    private int population;
    private double lifeexpectancy;
    private double gnp;
    private double gnpold;
    private String  localname;
    private String governmentform;
    private String headofstate;
    private int capital;
    private String code2;


    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    private List<CountryLanguage> languages;

    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    private List<City> cities;

    public Country() {
    }

    public Country(String code, String name, String continent, String region, double surfacearea,
                   int indepyear, int population, double lifeexpectancy, double gnp, double gnpold,
                   String localname, String government, String headofstate, int capital, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfacearea = surfacearea;
        this.indepyear = indepyear;
        this.population = population;
        this.lifeexpectancy = lifeexpectancy;
        this.gnp = gnp;
        this.gnpold = gnpold;
        this.localname = localname;
        this.governmentform = government;
        this.headofstate = headofstate;
        this.capital = capital;
        this.code2 = code2;
    }


    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public void setLanguages(List<CountryLanguage> languages) {
        this.languages = languages;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public double getSurfacearea() {
        return surfacearea;
    }

    public int getIndepyear() {
        return indepyear;
    }

    public int getPopulation() {
        return population;
    }

    public double getLifeexpectancy() {
        return lifeexpectancy;
    }

    public double getGnp() {
        return gnp;
    }

    public double getGnpold() {
        return gnpold;
    }

    public String getLocalname() {
        return localname;
    }

    public String getGovernmentform() {
        return governmentform;
    }

    public String getHeadofstate() {
        return headofstate;
    }

    public int getCapital() {
        return capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSurfacearea(double surfacearea) {
        this.surfacearea = surfacearea;
    }

    public void setIndepyear(int indepyear) {
        this.indepyear = indepyear;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLifeexpectancy(double lifeexpectancy) {
        this.lifeexpectancy = lifeexpectancy;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public void setGnpold(double gnpold) {
        this.gnpold = gnpold;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }

    public void setGovernmentform(String government) {
        this.governmentform = government;
    }

    public void setHeadofstate(String headofstate) {
        this.headofstate = headofstate;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfacearea=" + surfacearea +
                ", indepyear=" + indepyear +
                ", population=" + population +
                ", lifeexpectancy=" + lifeexpectancy +
                ", gnp=" + gnp +
                ", gnpold=" + gnpold +
                ", localname='" + localname + '\'' +
                ", governmentform='" + governmentform + '\'' +
                ", headofstate='" + headofstate + '\'' +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                // Evitar imprimir las listas completas
                ", cities=" + (cities != null ? cities.size() + " cities" : "null") +
                '}';
    }
}
