# Operators in Java

Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result. <br />


## Operator Precedence
The operators in the following table are listed according to precedence order. 
The closer to the top of the table an operator appears, the higher its precedence. 
Operators with higher precedence are evaluated before operators with relatively lower precedence. 
Operators on the same line have equal precedence. When operators of equal precedence appear in the same expression, a rule must govern which is evaluated first. All binary operators except for the assignment operators are evaluated from left to right; assignment operators are evaluated right to left.

| Operators  |	Precedence                  |
|------------|------------------------------|
|postfix		 | `expr++ expr--` |
|unary		   |`++expr --expr +expr -expr ~ !`|
|multiplicative |	`* / %` |
|additive	|`+ -`|
|shift	|`<< >> >>>`|
|relational |	`< > <= >= instanceof`|
|equality	| `== !=` |
|bitwise AND |	`&` |
|bitwise exclusive OR | ` ^ ` |
|bitwise inclusive OR | ` \| ` |
|logical AND	|	`&&` |
|logical OR	| `\|\|` |
|ternary	| `? :` |
|assignment	| `= += -= *= /= %= &= ^= |= <<= >>= >>>=`|


#### See Also
[Reference](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
