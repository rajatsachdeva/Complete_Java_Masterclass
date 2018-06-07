/*
	Use .read <filename.sql> to run following 
*/

/*
 * Display all information with album name equal to Doolittle
 */
SELECT artists.name, albums.name, songs.track, songs.title from songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON artists._id = albums.artist
WHERE albums.name = "Doolittle"
ORDER BY artists.name, albums.name, songs.track;

/*  Find songs that have name with doctor in it
 *	showng Wildcards in Queries
 */
SELECT artists.name, albums.name, songs.track, songs.title from songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON artists._id = albums.artist
WHERE songs.title LIKE "%doctor%"
ORDER BY artists.name, albums.name, songs.track;

/*  Find songs/albums for artist who have name  starting with "jefferson"
 *	showng Wildcards in Queries
 */
SELECT artists.name, albums.name, songs.track, songs.title from songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON artists._id = albums.artist
WHERE artists.name LIKE "jefferson%"
ORDER BY artists.name, albums.name, songs.track;