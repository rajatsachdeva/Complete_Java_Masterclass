# Lecture 95 - Access Modifiers

> These are _private, protected,_ and _public_ which are used to restrict access to members of classes <br />
> Help achieve **_Encapsulation_** <br />
> If we expose fields of classes, then anyone using the class will reasonably assume that they can manipulate
> the values of those fields. So, it's better _**not**_ to expose class fields<br />

> Only classes, interfaces and enums can exist at the top level everything else must be included within one of these 
<br />

### public:
> The object is visible to all classes everywhere, whether they are in the same package or have imported the package 
containing the public class

`package com.company`

`public class PublicClass {`
    
`    public PubliClass() {`
`    }`   
`}`

### Package-private:
> The object is only available within its own package (and is visible to every class withing the same package). 
Package-privte is specified by not specifying, i.e. it is the _**default**_ if you do not specify public. There is 
not a "_package-private_" keyword 
