# Lec**ture 100 - Binary Search

[_Collection Interface_](https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html)

Core Collection is interface encapsulate different types of collections. <br />
These interfaces allow collections to be manipulated independently of the details of their representation. <br /> 
Core collection interfaces are the foundation of the Java Collections Framework. <br />
 
A collection represents a group of objects, known as its <i>elements</i>.  Some collections allow duplicate elements 
and others do not.  Some are ordered and others unordered.  The JDK does not provide any <i>direct</i> 
implementations of this interface: it provides implementations of more specific sub-interfaces like <tt>Set</tt> and 
<tt>List</tt>.  This interface is typically used to pass collections around and manipulate them where maximum 
generality is desired.

### Binary Search 
It significantly faster and efficient than the general brute-force algorithm where element to be search in a list/ 
dataset is actually compared with each element with worst case scenario being `O(n)`

This algorithm requires that the input data set is present in a sorted order for integers in ascending/ descending 
order and in case of word list it should be in lexicographic order ( either ascending or descending)

It's worst case complexity is `O(log2(n))` <br />
Like in current example we had 96 number of seats so, to find the last seat in the list we would require ~ 6 
comparisons `log2(96) = 6.584`, whereas with classic linear search it would take about `96` comparisons
