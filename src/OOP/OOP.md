# OOP in Java `Data Camp Course`

OOP is a paradigm program that considers turns real world objects into code using class, constructors and properties. 

- so we have a created an object called `Car` inside the main class Refer[Main1 & Main2]
- then created a constructor `Car` constructors must have same name as class 
- inside constructors we add properties to distinguish each object.
- We create unique objects in terms of Java we instantiating the objects.
- to instantiate an object we have to use the keyword `new` and unique class or object such as Car can be used as parameters other than data types such as int, String, boolean etc.
- note : except class (object) all have parantheses. ex: constructor , method to pass in parameters.

# Methods [Main2]
- these are the functions of Java, here in OOP the method is an action performed by the object
  - Methods are classified into two types
    1. Void Method - doesn't return any data
    2. Non Void method - returns a data 

# Encapsulation  [Main2 & Main3]
 
### Encapsulation is a process of hiding and revealing part of data based on users need and organization's security , this can be achieved by the access modifiers such as private, public and static. 

- If we don't declare the access modifier the default will be `protected`. which means can be accessible within a package.
- `public` can be accessed anywhere 
- `private` only accessed within the class 
- Objects marked `static` can be accessed without an Object instance.

# Inheritance [Main3 & Main4] 

- Inheritance solves the problem of duplicate code.
- All shared code in one place 
- The base class is above the tree and variant child class inherits the base class. ( Ex. Car ->Mercedes, Toyota, VolksWagon), the subclass or child class inherits all the public properties & method of the base class
- The inheritance is achieved using the keyword `extends`
- the `super()` method calls the constructor of the base class.

# Abstract 
- Abstract classes exists to hold features for inheriting classes.
- Basically it is the base class(Car) that's above all sub classes such as Toyota,Mercedes
- We can't create object instances for abstract class as it is not specific. and just contains the basic definition not the unique features
- It's a blueprint for subclasses. A structure with just properties but not unique.

## Abstract methods 

- Abstract methods have no implementation 
- the class that inherits, must implement the abstract method

## Concrete methods
- these are methods with code implementation 
- here subclasses do not need to implement 

# Interface :

Interface is used to give properties selectively to a class, unlike inheritance which provides the property to all sub classes.
### Limitations of Inheritance

- with inheritance all members are inherited 
- you cannot selectively inherit members

## To create an interface we use the keyword `implements`

```java
interface ElectricCar {
}

class Tesla implements ElectricCar{
    
}
```
### Interface properties 

- interface properties must be written in `upper_SNAKE_CASE`
- the value is immediately assigned and can't be changed
- properties are public static final behind the scenes/by default

### Interface Methods 
in OOP Package 
- the methods are `abstract` by default without code implementation 
- but interfaces can use concrete methods that have code implementation
- All `abstract` methods must be implemented in the subclass

# Polymorphism 

- Polymorphism is a concept in OOP that allows object to exist in Multiple forms 
- For example each car have their own driving experience 
- so using polymorphism we can create various methods of driving
- To achieve we have to `override` the default method in the base class using `@Override`

## Example Code 
##  Override 
Car.java
```java
abstract class Car{
    abstract void drive();
}
```
Toyota.java
```java
class Toyota extends Car{
    @Override
  void drive(){
      // specific driving exp of Toyota
  }
}
```
## Another method is `Overloading`

- We have already seen this in Java Fundamentals 
- Over loading is where we declare same name but with different parameters 
- with this we can use both constructors by giving different input (parameters)

