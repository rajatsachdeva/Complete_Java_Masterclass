# Lecture 96 - The static Statement

> A static field also known a **class** variable, as it is associated with a class rather than a particular instance 
of a class (object) so that its only ever have _**one copy**_ of the variable in memory <br/>
> All instances of the class share that one class variable <br />
> static methods can be accessed using class name only <br />
> Static methods and fields belongs to the class and not to instances of the class, and as a result can be called by 
referencing the class name rather than instance name <br />
> Java does not or can't allow a static method to call a non-static method but same is not valid vice-versa i.e. 
non-static methods can call static methods

#### Why main method is static ?
> When we want to run a Java program there has to be an entry point, a method that is executed when the program runs
.However, until the program runs there's no class instance to call methods on, so Java has to use a static method 
that can be called from the class name (here Main) rather than class instance name<br /> 

#### Running java program from Command Line
`java com.company.rajatsachdeva._static.Main`

#### Why all the Main class needs to be static ?
> Java can't allow a static method to call a non-static method, as static method can be accessed through Class name 
that is even without an instance of class, where as non-static requires an instance of class. 