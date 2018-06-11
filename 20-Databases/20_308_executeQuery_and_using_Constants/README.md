# Lecture 308 - .executeQuery() and using Constants

Basic CRUD operations using JDBC

C = Create <br/>
R = Read <br/>
U = Update<br/>
D = Delete<br/>

Easy way to perform the queries and get the results, we will use executeQuery method <br/>
It's bad practice to access table columns in code using column names rather than column indices (position), <br/> 
as name may change in future. Hard coded values can lead to Sql Injection attack. <br/>
To Solve this issue we can make use of CONSTANTS, constants will contain the strings containing the Queries related <br/>
strings.