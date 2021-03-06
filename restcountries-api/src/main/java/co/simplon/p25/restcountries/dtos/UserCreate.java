package co.simplon.p25.restcountries.dtos;

public class UserCreate {

    private String username;

    private String password;

    public UserCreate() {
	// Default no-arg constructor
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    @Override
    public String toString() {
	return String.format("{username=%s, password=%s}", username,
		"[PROTECTED]");
    }
}
