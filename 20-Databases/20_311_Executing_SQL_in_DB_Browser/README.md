# Lecture 311 - Executing SQL in DB Browser

Getters using column name are not very efficient as it will do column name 
comparison (string comparison) which is not efficient (in case of large tables)

It's better and efficient to use Column indices, as integer comparison is fast 
