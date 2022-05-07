package co.simplon.p25.restcountries.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.restcountries.dtos.CountryCard;
import co.simplon.p25.restcountries.dtos.CountryName;
import co.simplon.p25.restcountries.dtos.CountryTableItem;
import co.simplon.p25.restcountries.services.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
	this.service = service;
    }

    @GetMapping("/names")
    public List<CountryName> names() {
	return service.findNames();
    }

    @GetMapping("/table-items")
    public List<CountryTableItem> tableItems() {
	return service.findTableItems();
    }

    @GetMapping("/cards")
    public List<CountryCard> cards() {
	return service.findCards();
    }
}
