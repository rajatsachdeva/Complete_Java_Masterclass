 # Lecture 109 - Sets & HashSet

[_Link_](https://docs.oracle.com/javase/8/docs/technotes/guides/vm/performance-enhancements-7.html)

Sets are less often used than lists and maps that they can in themselves be useful

List is an ordered collection of items than can have duplicates , whereas a Set has no defined ordering (oracle 
documentation defined it as chaotic) But secondly as Set cannot have duplicates, there are ordered sets as well such 
as link hash set and tree set.

If you want to ensure that there are no duplicates in your collection than Set is best choice rather than a List.

Just like List and Maps its possible to create Raw Sets

A Set cannot be an element of itself

Best performing implementation of Set is HashSet and that uses hashes to store the items now this is just like 
HashMap Class, in fact it uses a HashMap as of Java 8.
So whenever an item is added to HashSet it is internally added as a key in a HashMap with a dummy value.

Union and Intersection is allowed on Sets


# Lecture 110 - HashSet - equals() and hashCode()

Java Documentation warns if you are using your own object as the key in a Map, then you should override the equals 
and hashCode Methods.

Note that it is generally necessary to override the {@code hashCode} 
method whenever this method is overridden, so as to maintain the
general contract for the {@code hashCode} method, which states
that equal objects must have equal hash codes.

