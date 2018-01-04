# Lecture 100 - Binary Search

[_Collection Interface_](https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html)

Core Collection is interface encapsulate different types of collections. <br />
These interfaces allow collections to be manipulated independently of the details of their representation. <br /> 
Core collection interfaces are the foundation of the Java Collections Framework. <br />
 
A collection represents a group of objects, known as its <i>elements</i>.  Some collections allow duplicate elements 
and others do not.  Some are ordered and others unordered.  The JDK does not provide any <i>direct</i> 
implementations of this interface: it provides implementations of more specific sub-interfaces like <tt>Set</tt> and 
<tt>List</tt>.  This interface is typically used to pass collections around and manipulate them where maximum 
generality is desired.