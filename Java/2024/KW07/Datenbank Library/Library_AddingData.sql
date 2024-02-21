
\copy language(language_id, language_name) FROM 'C:/Projects/BLJ2023YaCor/Java/2024/KW07/Datenbank Library/language.csv' DELIMITER ';' ENCODING 'UTF-8' CSV HEADER;

\copy book(isbn_id, title, id_author, pages, id_language, publisher, status, genre, publication_year ) FROM 'C:/Projects/BLJ2023YaCor/Java/2024/KW07/Datenbank Library/books.csv' DELIMITER ';' ENCODING 'UTF-8' CSV HEADER;


	


ALTER TABLE book DROP CONSTRAINT positive_integer;

ALTER TABLE book ALTER COLUMN isbn_id TYPE BIGINT;
