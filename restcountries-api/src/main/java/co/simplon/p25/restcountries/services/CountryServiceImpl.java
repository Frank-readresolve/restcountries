package co.simplon.p25.restcountries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.restcountries.dtos.CountryCard;
import co.simplon.p25.restcountries.dtos.CountryName;
import co.simplon.p25.restcountries.dtos.CountryTableItem;
import co.simplon.p25.restcountries.repositories.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<CountryName> findNames() {
	return repository.findAllProjectedByOrderByName(CountryName.class);
    }

    @Override
    public List<CountryTableItem> findTableItems() {
	return repository.findAllProjectedByOrderByName(CountryTableItem.class);
    }

    @Override
    public List<CountryCard> findCards() {
	return repository.findAllProjectedByOrderByName(CountryCard.class);
    }
}
