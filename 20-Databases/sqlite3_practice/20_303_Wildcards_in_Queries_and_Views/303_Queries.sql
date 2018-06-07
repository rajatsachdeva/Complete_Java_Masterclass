SELECT artists.name, albums.name, songs.track, songs.title from songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON artists._id = albums.artist
WHERE albums.name = "Doolittle"
ORDER BY artists.name, albums.name, songs.track