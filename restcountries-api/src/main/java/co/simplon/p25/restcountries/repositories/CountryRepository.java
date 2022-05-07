package co.simplon.p25.restcountries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.restcountries.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    <T> List<T> findAllProjectedByOrderByName(Class<T> type);
}
