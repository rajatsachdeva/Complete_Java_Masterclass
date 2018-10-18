# Lecture 189 - Object Input Output including Serialization

**Serializarion:** Method of converting the object/ data structure that can be stored and recreated. In Java if we 
want to read or write objects variables we have to make the java class serializable. We do so making the class 
implement the Serializable Interface. This interface does not have any methods, but it gives JVM a heads up that we 
may want to serialize the object to storage and to read it back again at some point.

If we make a class serialize it's recommended that we add a field called `serialVersionUID`. If we don't do so then 
compiler will give us a warning.

