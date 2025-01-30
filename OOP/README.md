# Pillers of Object Orientated Programming

<p>
    <img src="./image/pillersofoop.png">
</p>

## Data Encapsulation in Java

- Encapsulation referes to the process of providing security to the most important component of an object
- In java, the most important of a class/object are the data members.
- Security to the data members can be provided by preventing direct access and providing controlled access
- Direct access can be prevented by decalaring the data members as private members. Controlled access can be provided by using 'public setters()' and 'public getters()' or accessors and mutators
- This is also refered to as data hiding as the data members are hidden from other classes.


### Data Encapsulation in Real World

<p>
    <img src="./image/human.png">
    <p align="center">1. Human Object</p>
</p>
<br>
<p>
    <img src="./image/computer.png">
    <p align="center">2. Computer Object</p>
</p>

### Data Encapsulation in Java Program

<p>
    <img src="./image/programming.png">
    <p align="center">Object In Java</p>
</p>

- Encapsulation does not mean preventing access, it means providing controlled access.
- Encapsulation is also referred to as wraping of data(variables) and code acting on the data (methods) together as a single unit(class).
<p align="center">
    <img src="./image/capsule.png">
    <p align="center">Class</p>
</p>

```java
class Example {
    dataMembers 
        +
    Methods
}
```

### Advantages of encapsulation
1. Security
2. Maintainability
3. Modularity

### Steps to implement encapsulation in java
1. Declare the variables of a class as private
2. Provide public getters and setters methods to modify & view the variabls values

Examples : 


> Program - 1

[Java Program](./encapsulation/BookExample1.java)
<p align="center">
    <img src="./image/encapEx1.png">
    <p align="center">Program-1</p>
</p>


> Program - 2.a : Encapsulated dog class 

[Java Program](./encapsulation/DogExample2.java)

```java

```