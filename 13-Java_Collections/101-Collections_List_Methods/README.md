# Lecture 100 - Collections List Methods

Binary Search requires that input list is sorted. For that we can use Collections sort method.
Which interestingly uses very efficient merge sort.

Shallow Copy is used to copy seats list to seatsCopy list. It creates an ArrayList containing all elements from the 
list that were passed to the constructor. So Point to note here is that these are'nt actually copied, hence known as 
shallow copy. Now if modify one of the seats say by it reserving it, so that seat will be reserved which ever list
(seats or seatsCopy) we check for it , but both are effectively the same shared object

So here effectively we have 2 separate ArrayList but with references are two same Seat objects

Deep Copy is copy where the elements are not just references to same elements as in the original list, but are 
themselves copied, Collections Copy is used to do the same.
  