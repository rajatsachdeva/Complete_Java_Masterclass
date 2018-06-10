# Lecture 307 - JDBC Insert, Update, Delete

http://sqlitebrowser.org/

https://bitbucket.org/xerial/sqlite-jdbc

JDBC stands for JAVA DATABASE CONNECTIVITY. 
Using JDBC, we cannot only work with databases, but also spreadsheets and flat files.

JDBC acts as a middleman between a Java application and a data source. To use a particular data source from an application, we need the JDBC driver for the data source. For example, to access sqlite database from an application, we need sqlite JDBC server.

The driver is simply a Java library containing classes that implement the JDBC API. Because all JDBC drivers have to implement the same interfaces, it's not difficult to change the data source an application uses.

For example, if an application uses an sqlite database, and then we decide later that we want to use a MySQL database, all we have to do is use the MySQL JDBC driver, instead of the sqlite one (in addition to migrating the data to a MySQL DB, of course).

In reality, it's not that simple. Nothing is ever 100% portable. But if we write our JDBC code with the thought in mind that we may want to change the data source later, we can make our lives easier by avoiding the use of the database-specific SQL and behaviours wherever possible.

If we wanted to work with a spreadsheet or a flat file, that's fine, as long as there's a JDBC driver that works with spreadsheet or file format. We always write the JDBC driver ourseleves, if necessary.

The JDBC driver has to be written in java, but it can consist of a thin java layer that calls code written in other languages. The current version of the JDBC API is JDBC 4.2. For backwards compatibility, it contains all the methods that were in previous versions.

JDBC required will be atleast 4.0.

JDBC consists of two packages: java.sql (core JDBC) and javax.sql (optional JDBC).
The APIs in the javax.sql package are required when working with database servers.

All teh popular databases provide JDBC drivers. The JDK ships with a database called derby, which can be used for desktop applications, or when prototyping. The derby JDBC driver is also included in the JDK.
