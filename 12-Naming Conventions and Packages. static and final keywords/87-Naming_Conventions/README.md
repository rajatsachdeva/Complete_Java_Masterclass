# Lecture 87 - Naming Conventions 

Naming Conventions: [*Link*](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html#naming)<br />

Notes: <br />

## Things that will be named in Java
1. [Packages](#packages)
2. [Classes](#classes)
3. [Interfaces](#interfaces)
4. [Methods](#methods)
5. [Constants](#constants)
6. [Variables](#variables)
7. [Type Parameters](#typeparameters)

### Packages <a name="packages">
> Always lower Case <br />
> Package names should be ***unqiue*** <br />
> Use your internet domain name, reversed, as a prefix for the package name <br />
> Oracle specify a convention for package names at [*Link*](https://docs.oracle.com/javase/specs/jls/se6/html/packages.html#7.7) <br />
> e.g. com.rajatsachdeva, java.lang, java.io, org.xml.sax.helpers <br />

### Class Names <a name="classes">
> Camel Case <br />
> Class names should be nouns (they represent things) <br />
> Should start with a ***capital*** letter <br />
> Each word in the name should with a captial (e.g. LinkedList, ArrayList, String, TopSong, GearBox, Main) <br />

### Interface Names <a name="interfaces">
> Similar to Class names (CamelCase) <br />
> Consider what objects implementing the interface will become or what they will be able to do <br />
> e.g. List, Comparable, Serializable <br />

### Method Names <a name="methods">
> mixedCase <br />
> Often verbs <br />
> Reflect the function performed or the result returned <br />
> e.g. size(), getName(), addPlayer() <br />

### Constants <a name="constants">
> All **UPPER_CASE** <br />
> Separate words with underscore _ <br />
> Declared using final keyword <br />
> e.g. static final int MAX_INT , static final short SEVERITY_ERROR, static final double PI = *3.14159265358979323846* <br />

### Variable Names <a name="variables">
> mixedCase <br />
> Meaningful and indicative <br />
> Start with a lower case letter <br />
> Do ***not*** use underscores <br />
> e.g. i, league, sydneySwans, boxLength <br />
  
### Type Parameters Names <a name="typeparameters">
> Single character, captial letters <br />
> Guidelines at [*Link*](https://docs.oracle.com/javase/tutorial/java/generics/types.html) <br />
> e.g. E - Element (used extensively by the java collections framework), K - Key, N - Number, T - Type, V - Value, S, U, V etc. - 2nd , 3rd, 4th types <br />
      
