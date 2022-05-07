package co.simplon.p25.restcountries.services;

import java.util.List;

import co.simplon.p25.restcountries.dtos.CountryCard;
import co.simplon.p25.restcountries.dtos.CountryName;
import co.simplon.p25.restcountries.dtos.CountryTableItem;

public interface CountryService {

    List<CountryName> findNames();

    List<CountryTableItem> findTableItems();

    List<CountryCard> findCards();
}
