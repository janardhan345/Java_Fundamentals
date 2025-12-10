# objects : `Frontend Masters - Java Fundamental`

1. we created a package called object and within that we created a class called rectangle 
2. then created some global var such as length, width and sides.
3. after that created some methods to calculate some values using the vars. 
4. so to get values of var we used getter/setter method also called accessor/mutuator method.
5. in get method we return the var 
6. in set we assign the global var to the current using `this` which refers to current instance/parameter.

## Next Constructors : 

global fields -> constructor -> methods

Constructor are strucure of object that initialise the values of the object.

- Properties are declared and initialized.
- constructors are structure and look same as class 
- all classes have default constructor with no parameters 
- so custom constructors have parameters.
- **`constructor` name must be same as `class`**
- all args constructor that takes values for all class fields.
- always use setter methods for setting field values. 

## Instantiating Objects: 

`Write a class that creates instances of Rectangle to find the total area of two rooms in a house.`

so in the `homeAreaCalculator ` class we are going to instantiate an object with the constructor rectangle using the keyword. 
- They are two constructors in the same name rectangle, one is defualt , other is the one we created. 
- we assign the default one to `room1`. 
- and other one to `room2`.
- so here i used room2 as other constructor and it worked.  

