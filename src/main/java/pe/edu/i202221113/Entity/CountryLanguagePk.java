package pe.edu.i202221113.Entity;

import jakarta.persistence.Embeddable;

import jakarta.persistence.Table;

@Embeddable
@Table(name="countrylanguage")
public class CountryLanguagePk {


    private String countrycode;
    private String language;

    public CountryLanguagePk() {
    }

    public CountryLanguagePk(String countrycode, String language) {
        this.countrycode = countrycode;
        this.language = language;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "CountryLanguagePk{" +
                "countrycode='" + countrycode + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
