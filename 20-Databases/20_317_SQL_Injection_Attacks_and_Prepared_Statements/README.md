# Lecture 317 - SQL Injection Attacks and Prepared Statements


**SQL Injection attack**<br/>
If User inputs following, then due to second condition which is always true we will get output of 
all the entries in the view

`
Enter the song title: Go Your Own Way" or 1=1 or"
SQL : SELECT artist, album, track FROM artists_list WHERE title = "Go Your Own Way" or 1=1 or""`

Due to above sensitive/other private information can be retrieved, which is not good