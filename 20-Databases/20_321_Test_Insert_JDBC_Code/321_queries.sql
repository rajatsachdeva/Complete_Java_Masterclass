select * from songs where title = "Heartless";
select * from albums where _id = 308;
select * from artists where _id = 39;

select * from songs where title = "She's On Fire";
select * from albums where _id = 248;
select * from artists where _id = 152;

select * from songs where title = "Go Your Own Way"
select * from albums where _id = 416;
select * from artists where _id = 92;

select artists.name, albums.name, songs.track from  songs
inner join albums on songs.album = albums._id
inner join artists on albums.artist = artists._id
where songs.title= "Go Your Own Way"
order by artists.name, albums.name collate nocase asc;

CREATE VIEW IF NOT EXISTS artists_list AS SELECT artists.name AS artist, albums.name AS album,
	songs.track , songs.title FROM songs
	INNER JOIN albums ON songs.album = albums._id
	INNER JOIN artists ON albums.artist = artists._id
	ORDER BY artists.name, albums.name, songs.track;

SELECT * FROM artists_list;

SELECT artist, album, track FROM artists_list WHERE title = "Go Your Own Way";

