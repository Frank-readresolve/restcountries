DELETE FROM countries;
DELETE FROM users;
DELETE FROM roles;

INSERT INTO countries (iso_code, name, area, population, capital, capital_lat, capital_lng, flag_url, open_street_map_url) VALUES
	('FR', 'French Republic', 551695, 67391582, 'Paris', 48.87, 2.33, 'https://flagcdn.com/w320/fr.png', 'https://www.openstreetmap.org/relation/1403916'),
	('GB', 'United Kingdom of Great Britain and Northern Ireland', 242900, 67215293, 'London', 51.5, -0.08, 'https://flagcdn.com/w320/gb.png', 'https://www.openstreetmap.org/relation/62149');

INSERT INTO roles (name) 
	VALUES ('ROLE_ADMIN');

-- Password for both users = Pass123*
-- Not admin:
INSERT INTO users (username, password) VALUES
	('user@domain.com', '$2a$10$VW7m87qff9qOuGhW6JSe3.oUbkm4IAfPA9EpnfMDuf/qiCChoCbii');
-- Admin:
INSERT INTO users (username, password, role_id) VALUES
	('admin@domain.com', '$2a$10$46os1NR5tys95REMoVyfVuMO11vWWlFP9ObcQgtaLIpZqW8l8v8PC', (SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));
