select * from albums where artist = 8;
select albums.name from albums inner join artists on albums.artist = artists._id where artists.name = "Iron Maiden" order by albums.name collate nocase asc;
select * from albums where artist = 130;
select albums.name from albums inner join artists on albums.artist = artists._id where artists.name = "Pink Floyd" order by albums.name collate nocase asc;
select albums.name from albums inner join artists on albums.artist = artists._id where artists.name = "Carol King" order by albums.name collate nocase asc;