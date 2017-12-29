# Lecture 93 - Scope and Visibility

## Scope <a name="Scope">
> Scope here actually refers to the ___visibility___ of a _class_, _member_, or _variable_ <br />
> Access modifiers like _public_, _private_ and _protected_ they are actually one way to <u>_restrict_</u> 
> scope of an object, other is where the objects are declared(local to method)  <br />
> Rule is to used the narrowest/most local/ closest scope <br />
> Another way to do scoping is to use code blocks {} , As java checks in current block of code if the variable was
> declared in the most local scope as stated above, so it works backwards until it gets a valid declaration, in 
case there is no such declaration then it errors out <br />
> Concept of scope applies not only to variables but also to methods and classes <br />

## Visibility <a name="visibility">
> Object's scope/visibility is the block in which it's declared including any contained blocks <br />
> An Object's visibility is governed by the access modifiers <br />