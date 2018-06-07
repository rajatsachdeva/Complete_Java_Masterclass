/*
 * Use .read <filename.sql> to run following 
 */

/*
 * Create a View of artist list
 */
CREATE VIEW artist_list AS 
	SELECT artists.name, albums.name, songs.track, songs.title From songs
	INNER JOIN albums ON songs.album = albums._id
	INNER JOIN artists ON albums.artist = artists._id
	ORDER BY artists.name, albums.name, songs.track;

/* 
 * Now display the data of the view 
 * same as we do in tables
 */
SELECT * FROM artist_list;

/*
 * Filtering specific data in 
 */
 SELECT * FROM artist_list WHERE name LIKE "jefferson%";

 /* we can create views in a single table  so that we can restrict some data to specfic users */

SELECT * FROM albums ORDER BY name;

/* Create a new from a single albums table */

CREATE VIEW album_list AS
	SELECT name FROM albums
	ORDER BY name;

SELECT * FROM album_list;

DROP VIEW album_list;

/* same for deleting the table DROP TABLE */

/* collate nocase used to make case insenstive */
CREATE VIEW album_list AS
	SELECT name FROM albums
	ORDER BY name collate nocase;

SELECT * FROM album_list;

DROP VIEW artist_list;

CREATE VIEW artist_list AS 
	SELECT artists.name AS artist , 
	albums.name AS album , 
	songs.track AS track, 
	songs.title AS title From songs
	INNER JOIN albums ON songs.album = albums._id
	INNER JOIN artists ON albums.artist = artists._id
	ORDER BY artists.name, albums.name, songs.track;

SELECT * FROM artist_list WHERE artist LIKE "jefferson%";

