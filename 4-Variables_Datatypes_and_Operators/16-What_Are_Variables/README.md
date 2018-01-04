# What are Variables ?

Variables are used to store information to be referenced and manipulated in a computer program. They also provide a way of labeling data with a descriptive name, so our programs can be understood more clearly by the reader and ourselves. <br />
With reference to java class, class field stores _state_ of the class <br />

Java defines various kinds of variables, which are listed below : <br />
1. **Instance Variables** _(Non-Static Fields)_ Technically speaking, objects store their individual states in "non-static fields", that is, fields declared without the _static_ keyword. Non-static fields are also known as instance variables because their values are unique to each instance of a class (to each object, in other words); the currentSpeed of one bicycle is independent from the currentSpeed of another

2. **Class Variables** _(Static Fields)_ A class variable is any field declared with the static modifier; this tells the compiler that there is exactly one copy of this variable in existence, regardless of how many times the class has been instantiated. A field defining the number of gears for a particular kind of bicycle could be marked as static since conceptually the same number of gears will apply to all instances. The code static int numGears = 6; would create such a static field. Additionally, the keyword final could be added to indicate that the number of gears will never change

3. **Local Variables** Similar to how an object stores its state in fields, a method will often store its temporary state in local variables. The syntax for declaring a local variable is similar to declaring a field (for example, int count = 0;). There is no special keyword designating a variable as local; that determination comes entirely from the location in which the variable is declared — which is between the opening and closing braces of a method. As such, local variables are only visible to the methods in which they are declared; they are not accessible from the rest of the class

4. **Parameters** The signature for the main method is public static void main(String[] args). Here, the args variable is the parameter to this method. The important thing to remember is that parameters are always classified as "variables" not "fields". This applies to other parameter-accepting constructs as well (such as constructors and exception handlers)

[Reference](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

Please refer to [_Naming convention_](https://github.com/rajatsachdeva/Complete_Java_Masterclass/tree/master/12-Naming%20Conventions%20and%20Packages.%20static%20and%20final%20keywords/87-Naming_Conventions) sections for rules to name the variables in java  

In this lecture the basics of variable declaration, initialization, assignment is discussed <br />
[_Source Code_](src/Variables.java)
