/*
 * .read <filename.sql> to run the queries
 */

/*
 * Delete all songs that have track number greater than 50
 */
DELETE FROM songs WHERE track < 50;

SELECT * FROM songs;
/*
 * Display data from views
 */
SELECT * FROM artist_list; 

/*
 * Select/Display song where track != 71
 */
 SELECT * FROM songs WHERE track <> 71;
 
/*
 * Display count of rows in each table
 */
 SELECT count(*) AS SONGS FROM songs;
 SELECT count(*) AS ALBUMS FROM albums;
 SELECT count(*) AS ARTISTS FROM artists;