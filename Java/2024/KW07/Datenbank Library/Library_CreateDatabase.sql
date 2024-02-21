
set search_path to library;

CREATE TABLE book (
	isbn_id int PRIMARY KEY,
	id_author VARCHAR(90),
	pages int NOT NULL,
	id_language VARCHAR(3) NOT NULL,
	publisher VARCHAR(30) NOT NULL,
	publication_date DATE NOT NULL,
	status VARCHAR(15) NOT NULL,
	description VARCHAR(200),
	CONSTRAINT positive_integer CHECK (isbn_id >= 0 AND isbn_id < 10^13 - 1)
);

CREATE TABLE author (
	author_id VARCHAR(90) PRIMARY KEY,
	birthyear smallint check(birthyear between 0 and EXTRACT(year from current_date)),
	id_nationality VARCHAR(3)
);

ALTER TABLE book ADD FOREIGN KEY (id_author) REFERENCES author(author_id);

CREATE TABLE language (
	language_id VARCHAR(3) PRIMARY KEY,
	language_name VARCHAR(25)
);

ALTER TABLE book ADD FOREIGN KEY (id_language) REFERENCES language(language_id);

CREATE TABLE nationality(
	nationality_id VARCHAR(3) PRIMARY KEY,
	nationality_name VARCHAR(30)
);

ALTER TABLE author ADD FOREIGN KEY (id_nationality) REFERENCES nationality(nationality_id);

CREATE DOMAIN email AS TEXT CHECK (VALUE ~* '^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+[.][A-Za-z]+$');

CREATE TABLE member(
	member_id SERIAL PRIMARY KEY,
	first_name VARCHAR(45) NOT NULL,
	last_name VARCHAR(45) NOT NULL,
	email email NOT NULL,
	password VARCHAR(8) NOT NULL,
	id_role_user INT
);

CREATE TABLE userborrowsbooks(
	id_isbn int,
	id_member SERIAL,
	borrow_date DATE NOT NULL DEFAULT CURRENT_DATE,
	return_date DATE NOT NULL DEFAULT (CURRENT_DATE + INTERVAL '21 DAY'),
	FOREIGN KEY (id_member) REFERENCES "member"(member_id),
	FOREIGN KEY (id_isbn) REFERENCES book(isbn_id),
	PRIMARY KEY (id_isbn, id_member)
);

CREATE TABLE user_role(
	role_user_id INT PRIMARY KEY,
	role_name VARCHAR(25)
);

ALTER TABLE member ADD FOREIGN KEY (id_role_user) REFERENCES user_role(role_user_id);




