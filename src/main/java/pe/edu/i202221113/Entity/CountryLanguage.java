package pe.edu.i202221113.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="countrylanguage")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguagePk countryLanguagePk;
    private String isofficial;
    private double percentage;


    @ManyToOne()
    @JoinColumn(name="CountryCode")
    @MapsId("countrycode")
    private Country country;


    public CountryLanguage() {
    }

    public CountryLanguage(CountryLanguagePk countryLanguagePk, String isofficial, double percentage, Country country) {
        this.countryLanguagePk = countryLanguagePk;
        this.isofficial = isofficial;
        this.percentage = percentage;
        this.country = country;
    }

    public CountryLanguagePk getCountryLanguagePk() {
        return countryLanguagePk;
    }

    public void setCountryLanguagePk(CountryLanguagePk countryLanguagePk) {
        this.countryLanguagePk = countryLanguagePk;
    }

    public String getIsofficial() {
        return isofficial;
    }

    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

}
