# Lecture 111 - Finish off equals() and hashcode()

[_Link_](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-)


Note that it is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.