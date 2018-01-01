# Lecture 97 and 98 - The final Statement

> _final_ keyword is usually used to define constant values <br />
> _final_ fields are _not_ actually constants, as they can be modified but only _**once**_, any modification must be 
performed before the class constructor finishes, i.e. while declaring the field or in constructor <br />
> If a class is marked as _final_ it prevents the class from being sub-classed so, a final class _cannot_ be 
extended <br />
> If a class method is marked as _final_ then that method cannot be overridden in subsequent sub-class <br />  

#### static initializer
> _static_ equivalent of _constructors_ known as <u>**_static initialization block_**</u> <br /> 
> The constructors that we have used so far are _**instance**_ constructors  <br />
> static initialization block is called only first when the class is first loaded into the project <br />
> we can have multiple static initialization blocks, and they are called in order they are declared in the class <br />
 
