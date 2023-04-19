
DROP table IF EXISTS users;
DROP table IF EXISTS videogames;
DROP table IF EXISTS parties;
DROP table IF EXISTS messages;


CREATE TABLE users(
  id int NOT NULL AUTO_INCREMENT,
  username varchar(250) DEFAULT NULL,
  email varchar(250) DEFAULT NULL,
  steamProfile varchar(250) DEFAULT NULL,
  date_signin date DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE videogames(
  id int NOT NULL AUTO_INCREMENT,
  vname varchar(250) DEFAULT NULL,
  steamurl varchar(250) DEFAULT NULL,
  photo varchar(250),
  PRIMARY KEY (id)
);

CREATE TABLE parties(
  id int NOT NULL AUTO_INCREMENT,
  pname varchar(250) DEFAULT NULL,
  videogame_id int DEFAULT NULL,
  user_id int DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (videogame_id) REFERENCES videogames(id) on update cascade on delete cascade,
  FOREIGN KEY (user_id) REFERENCES users(id) on update cascade on delete cascade
);

CREATE TABLE messages(
  id int NOT NULL AUTO_INCREMENT,
  message varchar(250) DEFAULT NULL,
  party_id int DEFAULT NULL,
  user_id int DEFAULT NULL,
  date date DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (party_id) REFERENCES parties (id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);

/*Insert data base */
/* USERS */
INSERT INTO users(username, email, steamprofile, date_signin) VALUES ('pippin', 'pippin@email.com', 'pippin', NOW());
INSERT INTO users(username, email, steamprofile, date_signin) VALUES ('anam', 'anam@email.com', 'anam', NOW());
INSERT INTO users(username, email, steamprofile, date_signin) VALUES ('mayter', 'mayter@email.com', 'mayter',NOW());
INSERT INTO users(username, email, steamprofile, date_signin) VALUES ('josem', 'josem@email.com', 'josem', NOW());
INSERT INTO users(username, email, steamprofile, date_signin) VALUES ('tomb', 'tomb@email.com', 'tomb', NOW());
/* VIDEOGAMES */
INSERT INTO videogames (vname, steamurl, photo) VALUES ('Dota2', 'https://store.steampowered.com/app/570/Dota_2/', 'https://cdn.akamai.steamstatic.com/steam/apps/570/header.jpg?t=1678300512');
INSERT INTO videogames (vname, steamurl, photo) VALUES ('Albion online', 'https://store.steampowered.com/app/761890/Albion_Online/', 'https://cdn.akamai.steamstatic.com/steam/apps/761890/header.jpg?t=1676293188');
INSERT INTO videogames (vname, steamurl, photo) VALUES ('Fabledom', 'https://store.steampowered.com/app/1651560/Fabledom/', 'https://cdn.akamai.steamstatic.com/steam/apps/1651560/header.jpg?t=1681739403');
INSERT INTO videogames (vname, steamurl, photo) VALUES ('FinalFantasy vii', 'https://store.steampowered.com/app/39140/FINAL_FANTASY_VII/', 'https://cdn.akamai.steamstatic.com/steam/apps/39140/header.jpg?t=1655449322');
/* PARTIES */
INSERT INTO parties (pname, videogame_id, user_id) VALUES ('dota_players02', 1, 3);
INSERT INTO parties (pname, videogame_id, user_id) VALUES ('dota_players01', 1, 2);
INSERT INTO parties (pname, videogame_id, user_id) VALUES ('descansitos', 3, 4);
INSERT INTO parties (pname, videogame_id, user_id) VALUES ('albiones', 2, 2);
/*MESSAGES*/
INSERT INTO messages (message, party_id, user_id, date) VALUES ('Hola, ¿estás ahí?', 1, 1, NOW());
INSERT INTO messages (message, party_id, user_id, date) VALUES ('si, estoy, echamos una partida?', 1, 4, NOW());
INSERT INTO messages (message, party_id, user_id, date) VALUES ('mi usuario es pippin', 3, 1, NOW());
INSERT INTO messages (message, party_id, user_id, date) VALUES ('ok, te invito el mio es tomb', 2, 4, NOW());