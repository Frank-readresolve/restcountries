package co.simplon.p25.restcountries.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "iso_code")
    private String isoCode;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private double area;

    @Column(name = "population")
    private int population;

    @Column(name = "capital")
    private String capital;

    @Column(name = "capital_lat")
    private double capitalLatitude;

    @Column(name = "capital_lng")
    private double capitalLongitude;

    @Column(name = "flag_url")
    private String flagUrl;

    @Column(name = "open_street_map_url")
    private String openStreetMapUrl;

    public Country() {
	// Default no-arg constructor
    }

    public Long getId() {
	return id;
    }

    public String getIsoCode() {
	return isoCode;
    }

    public void setIsoCode(String isoCode) {
	this.isoCode = isoCode;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getArea() {
	return area;
    }

    public void setArea(double area) {
	this.area = area;
    }

    public int getPopulation() {
	return population;
    }

    public void setPopulation(int population) {
	this.population = population;
    }

    public String getCapital() {
	return capital;
    }

    public void setCapital(String capital) {
	this.capital = capital;
    }

    public double getCapitalLatitude() {
	return capitalLatitude;
    }

    public void setCapitalLatitude(double capitalLatitude) {
	this.capitalLatitude = capitalLatitude;
    }

    public double getCapitalLongitude() {
	return capitalLongitude;
    }

    public void setCapitalLongitude(double capitalLongitude) {
	this.capitalLongitude = capitalLongitude;
    }

    public String getFlagUrl() {
	return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
	this.flagUrl = flagUrl;
    }

    public String getOpenStreetMapUrl() {
	return openStreetMapUrl;
    }

    public void setOpenStreetMapUrl(String openStreetMapUrl) {
	this.openStreetMapUrl = openStreetMapUrl;
    }

    @Override
    public String toString() {
	return String.format(
		"{id=%s, isoCode=%s, name=%s, area=%s, population=%s, capital=%s, capitalLatitude=%s, capitalLongitude=%s, flagUrl=%s, openStreetMapUrl=%s}",
		id, isoCode, name, area, population, capital, capitalLatitude,
		capitalLongitude, flagUrl, openStreetMapUrl);
    }
}
