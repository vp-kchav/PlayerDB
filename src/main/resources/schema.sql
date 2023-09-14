DROP TABLE IF EXISTS PLAYERS;

-- Create a table from the csv
CREATE TABLE PLAYERS AS SELECT * FROM CSVREAD('Player.csv');

-- Create a table from scratch
-- CREATE TABLE PLAYERSTABLE (
--                                id INT AUTO_INCREMENT  PRIMARY KEY,
--                                player_id VARCHAR(250) NOT NULL,
--                                birth_year INT NOT NULL,
--                                birth_month INT NOT NULL,
--                                birth_day INT NOT NULL,
--                                birth_country VARCHAR(250) NOT NULL,
--                                birth_state VARCHAR(250) NOT NULL,
--                                birth_city VARCHAR(250) DEFAULT NULL,
--                                death_year INT DEFAULT NULL,
--                                death_month INT DEFAULT NULL,
--                                death_day INT DEFAULT NULL,
--                                death_country VARCHAR(250) DEFAULT NULL,
--                                death_state VARCHAR(250) DEFAULT NULL,
--                                death_city VARCHAR(250) DEFAULT NULL,
--                                first_name VARCHAR(250) NOT NULL,
--                                last_name VARCHAR(250) NOT NULL,
--                                given_name VARCHAR(250) NOT NULL,
--                                weight INT DEFAULT NULL,
--                                height INT DEFAULT NULL,
--                                bats INT DEFAULT NULL,
--                                throws INT DEFAULT NULL,
--                                debut DATE NOT NULL,
--                                final_game DATE NOT NULL,
--                                retro_id VARCHAR(250) NOT NULL,
--                                bbref_id VARCHAR(250) NOT NULL
-- );