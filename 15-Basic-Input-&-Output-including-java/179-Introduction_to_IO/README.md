# Lecture 179 - Introduction to I/O

Java I/O package has different I/O methods, useful ways of getting data into and out of programs

Java nio package introduced in Java 7

Input: Involves reading data from source 
Output: Involves writing data to destination

Now Source/Destination can be files on the computer's disk drives but they can also be network connections and pipes 
as well the computer's keyboard and screen.

I/O can be performed by either byte or character data and the methods used are 
pretty much the same its just the actual classes used that will vary so when reading and
writing character data, the data is in a readable format and you can open the files if it is files that have been 
read or written in a text editor and you can make sense of it, but binary data on the other hand involves writing 
bytes that will not look very meaningful when you read the file.

Serial, Sequential and Random access of files

Serial/ Sequential access can be thought of as a stream of data that arrives 
at your program or sent out of your program in a defined order with each piece of data 
following in sequence 

Random Access on the other hand, only really applies to files and allows you 
to jump about the file or within the file retrieving or overwriting any data in any location 
within that file similar to how a database program works. 