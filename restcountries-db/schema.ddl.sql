DROP TABLE IF EXISTS countries;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS roles;

CREATE TABLE countries (  
	id SERIAL PRIMARY KEY, 
	iso_code CHAR(2) UNIQUE NOT NULL,
	name VARCHAR(200) NOT NULL,
	area DECIMAL NOT NULL,
	population INTEGER NOT NULL,
	capital VARCHAR(200) NOT NULL,
	capital_lat DECIMAL NOT NULL,
	capital_lng DECIMAL NOT NULL,
	flag_url VARCHAR(200) NOT NULL,
	open_street_map_url VARCHAR(200) NOT NULL
);

CREATE TABLE roles (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username VARCHAR(255) UNIQUE NOT NULL,
	password CHAR(60) NOT NULL,
	role_id INTEGER,
	CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES roles(id)
);
