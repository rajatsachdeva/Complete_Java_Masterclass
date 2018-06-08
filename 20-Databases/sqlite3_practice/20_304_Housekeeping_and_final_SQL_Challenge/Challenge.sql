/* 
	304 Challenge 
*/

/*	
	1. Select the titles of all the songs on the album "Forbidden"
*/
SELECT title FROM songs 
	INNER JOIN albums ON songs.album = albums._id
	WHERE albums.name = "Forbidden";

/*
	2. Repeat the previous query but this time display the songs in 
	track order. You may want to include the track number in the output
	that it worked ok
*/
SELECT track , title FROM songs 
	INNER JOIN albums ON songs.album = albums._id
	WHERE albums.name = "Forbidden"
	ORDER BY track;

/*
	3. Display all songs fot the band "Deep Purple"
*/
SELECT albums.name AS ALBUM, songs.track AS track , songs.title  AS TITLE FROM songs 
	INNER JOIN albums ON songs.album = albums._id
	INNER JOIN artists ON artists._id = albums.artist
	WHERE artists.name = "Deep Purple"
	ORDER BY albums.name , songs.track;

/* Alternate Query */
SELECT * FROM artist_list WHERE artist = "Deep Purple";

/*
	4. Rename the band "Mehitabel" to "One Kitten".
	Note that this is an exception to the advice to always 
	fully qualify your column names. SET artists.name won't work,
	you just need to specify name.
*/
UPDATE artists SET name = "One Kitten" WHERE artists.name = "Mehitabel";


/*
	5. Check if the record was updated correctly or not in 4.
*/
SELECT * FROM artists WHERE artists.name = "One Kitten";

/*
	6. Select the titles of all the songs by AeroSmith in alphabetic order.
		include only the title in output.
*/
SELECT songs.title from songs
	INNER JOIN albums ON albums._id = songs.album
	INNER JOIN artists ON artists._id = albums.artist
	WHERE artists.name = "Aerosmith"
	ORDER BY songs.title;

SELECT title from artist_list WHERE artist = "Aerosmith" ORDER BY title;

/* 
	7. Replace the column that you have used in previous answer
	with count(title) to get just a count of the number of songs.
*/
SELECT count(songs.title) from songs
	INNER JOIN albums ON albums._id = songs.album
	INNER JOIN artists ON artists._id = albums.artist
	WHERE artists.name = "Aerosmith"
	ORDER BY songs.title;

/*
	8. Search the internet to find out how to get a list of the songs 
	from step 6 without any duplicates. 
*/
SELECT DISTINCT songs.title from songs
	INNER JOIN albums ON albums._id = songs.album
	INNER JOIN artists ON artists._id = albums.artist
	WHERE artists.name = "Aerosmith"
	ORDER BY songs.title;

SELECT DISTINCT title from artist_list WHERE artist = "Aerosmith" ORDER BY title;

/*
	9. Search the internet again to find out how to get a count of the songs without
	duplicates. Hint: it uses the same keyword as Step 8 but the syntax may not be obvious.
*/
SELECT count(DISTINCT title) from artist_list WHERE artist = "Aerosmith" ORDER BY title;

/*
	10. Repreat the previous query to find the number of artists (which, obviously,
	should be one) and the number of albums
*/

SELECT count(DISTINCT title), count(DISTINCT artist), count(DISTINCT album) from artist_list WHERE artist = "Aerosmith" ORDER BY title;