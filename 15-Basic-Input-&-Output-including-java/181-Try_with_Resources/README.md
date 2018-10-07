# Lecture 181 - Try with Resources

[the try with resource statement](https://docs.oracle.com/javase/7/docs/technotes/guides/language/try-with-resources.html)<br/>

Challenge: why did we declare locFile outside try block and not inside it ?

The reason behind that is that try, catch or finally blocks declares a new scope and the variable declared inside 
try block will not available in catch or finally block.