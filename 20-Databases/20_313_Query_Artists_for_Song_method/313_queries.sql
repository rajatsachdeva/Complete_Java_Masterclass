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
order by artists.name, albums.name collate nocase asc