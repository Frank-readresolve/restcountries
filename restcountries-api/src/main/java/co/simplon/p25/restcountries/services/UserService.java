package co.simplon.p25.restcountries.services;

import co.simplon.p25.restcountries.dtos.UserCreate;
import co.simplon.p25.restcountries.dtos.UserSignIn;
import co.simplon.p25.restcountries.security.Jwt;

public interface UserService {

    void create(UserCreate inputs);

    Jwt signIn(UserSignIn inputs);
}
