# Lecture 95 - Access Modifiers

> These are _private, protected,_ and _public_ which are used to restrict access to members of classes <br />
> Help achieve **_Encapsulation_** <br />
> If we expose fields of classes, then anyone using the class will reasonably assume that they can manipulate
> the values of those fields. So, it's better _**not**_ to expose class fields<br />

> Only classes, interfaces and enums can exist at the top level everything else must be included within one of these 
<br />

## Top Level
### public:
> The object is visible to all classes everywhere, whether they are in the same package or have imported the package 
containing the public class

##### Top Level public class

`package com.company`

`public class PublicClass {`
    
`    public PubliClass() {`
`    }`   
`}`

##### Top Level public interface

`package com.company`

`public interface PublicInterface {`
       
`}`

### Package-private:
> The object is only available within its own package (and is visible to every class withing the same package). 
Package-private is specified by not specifying, i.e. it is the _**default**_ if you do not specify public. There is 
not a "_package-private_" keyword 

##### Top Level package-private class

`package com.company`

`class PackagePrivateClass {`
    
`    public PackagePrivateClass() {`
`    }`   
`}`

##### Top Level package-private interface

`package com.company`

`interface PackagePrivateInterface {`
       
`}`

## Member Level
### public: 
> At the member level, public has the same meaning as at top level. A public class member (or field) and public 
method can be accessed from any other class anywhere, even in a different package<br />

### Package-private: 
> This also has the same meaning as it does at the top level. An object with no access modifier is visible to every 
class within the same package (but not to classes in external packages) <br />

### private: 
> The object is only visible _within_ the class it is declared. It is not visible anywhere else ( including in 
subclasses of its class) <br />

### protected:
> The object is visible anywhere in its own package (like package-private) but also in subclasses even if they are in
 another package
 
#### Some good read:
> 1. [_link1_](https://stackoverflow.com/questions/2430756/why-are-interface-variables-static-and-final-by-default)