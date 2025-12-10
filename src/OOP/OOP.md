# OOP in Java `Data Camp Course`

OOP is a paradigm program that considers turns real world objects into code using class, constructors and properties. 

- so we have a created an object called `Car` inside the main class
- then created a constructor `Car` constructors must have same name as class 
- inside constructors we add properties to distinguish each object.
- We create unique objects in terms of Java we instantiating the objects.
- to instantiate an object we have to use the keyword `new` and unique class or object such as Car can be used as parameters other than data types such as int, String, boolean etc.
- note : except class (object) all have parantheses. ex: constructor , method to pass in parameters.

# Methods 
- these are the functions of Java, here in OOP the method is an action performed by the object
  - Methods are classified into two types
    1. Void Method - doesn't return any data
    2. Non Void method - returns a data 

# Encapsulation 
 
### Encapsulation is a process of hiding and revealing part of data based on users need and organization's security , this can be achieved by the access modifiers such as private, public and static. 

- If we don't declare the access modifier the default will be `protected`. which means can be accessible within a package.
- `public` can be accessed anywhere 
- `private` only accessed within the class 
- Objects marked `static` can be accessed without an Object instance.

# Inheritance 

- Inheritance solves the problem of duplicate code.
- All shared code in one place 
- The base class is above the tree and variant child class inherits the base class. ( Ex. Car ->Mercedes, Toyota, VolksWagon), the subclass or child class inherits all the public properties & method of the base class
- The inheritance is achieved using the keyword `extends`
- the `super()` method calls the constructor of the base class.

