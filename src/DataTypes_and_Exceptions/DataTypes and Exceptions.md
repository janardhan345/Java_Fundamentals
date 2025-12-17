
1. POJO (plain old java object or plain ordinary java object)
    - `pojo` is an simple object, it can't inherit from other classes.
    - Getters and setters are public, but fields are private

    ### Guidelines to create `POJO` class
    - be public 
    - have public getters/setters for all fields and fields should be private.
    - have a default constructor with no argument.

- Getters start with `get` and end with field name. 
- getters just return the field.
- no parameters

```java 
private String make;

public String getMake(){
    return make;
        }
```
- Setter method name stat with `set` and end with field name 
- take a single parameter 
- use `this` to distinguish from field and parameter 
- setters used to store valid input , so it doesn't return anything.

```java 
private String make;

public void setMake(String make){
    this.make = make;
}
```
> SO in short POJO is 
> - Public class 
> - Private fields 
> - Getter return field
> - Setters set the value of a field 
> - Default / No argument constructor 

