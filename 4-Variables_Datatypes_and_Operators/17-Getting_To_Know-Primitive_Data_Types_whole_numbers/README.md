# Primitive Data Types
> The Java programming language is statically-typed, which means that all variables must first be declared before they can be used. This involves stating the variable's type and name: <br />
> `int gear = 1;`

## Numeric Primitive Data Types
> All types are singed <br />
> Ranges are defined using following: <br />
`-2^(n-1) to (2^(n-1))-1` <br />
>, here n is number of bits used to store data type variable


|   Type	  |  Bytes(bits n)	|	Range  	    |
|-----------|-----------------|-------------|
|	byte	    |	1 (8)		        |   -128 to 127 |
|	short	    |	2 (16)	 	      |   -32768 to 32767|
|	int		    |	4 (32)		      |   -214783648 to 214783647 |
|	long	    |	8 (64)	 	      |    -(2^63) to (2^63)-1|


1. **byte**: The byte data type is an 8-bit signed [two's complement](https://en.wikipedia.org/wiki/Two%27s_complement) integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.

2. **short**: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.

3. **int**: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1. Use the Integer class to use int data type as an unsigned integer. See the section The Number Classes for more information. Static methods like compareUnsigned, divideUnsigned etc have been added to the Integer class to support the arithmetic operations for unsigned integers.

4. **long**: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. Use this data type when you need a range of values wider than those provided by int. The Long class also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic operations for unsigned long.

[Reference](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
