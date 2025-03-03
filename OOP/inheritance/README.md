# Inheritance In Java

<p>
    <img src="./image/intro.png">
</p>

Story of Shilpa Shetty and Vijay Malya :
<p>
    <img src="./image/company1.png">
    <p align="center"> Deal With Company-1</p>
    <img src="./image/company2.png">
    <p align="center"> Deal With Company-2</p>
    
</p>

> Inheritance refers to the process of coding a project not as a single class, but as a hierarchy of classes

> Inheritance represents, the "is-a" relationship

> Which is also known as <u>parent-child relationship</u>

>  Inheritance is such a programming mechanism provided by most programming languages particularly object oriented in which the objects of the child class, acquires all the properties(data) and behaviours(methods) of an object of the parent class.

#### Advantages
1. Promotes reusability
2. Reduces code redundancy
3. Less development time and effort
4. Increases profits 
5. Supports code extensibility

## Rules of inheritance

### 1. Single inheritance enables a child class to inherit from a single parent class.
- Single inheritance is permitted in java 

[Java Code](./example/Rule1.java)
<p>
    <img src="./image/ex1.png">
</p>

### 2. Multilevel inheritance

[Java Code](./example/Rule2.java)
- In multilevel inheritance, a child class inherits from a parent class and the child class also acts as the parent class to another class 

- Multi-level inheritance is permitted in java 
<p>
    <img src="./image/ex2.png">
</p>

### 3. Hierarchial inheritance 
- In hierarchial inheritance, one class serves as a parent class to more than one child class
- Hierarchial inheritance is permitted in java 
<p>
    <img src="./image/ex3.png">
</p>

### 4. Multiple inheritance 
- In multiple inheritance, a child class can inherit from more than one parent class.
- Multiple inheritance is not permitted in java as it leads to ambiguity. This is popularly know as **Diamond-Shape Problem**.
<p>
    <img src="./image/mulitpleInheri.png">
</p>


### 5. Hybrid inheritance 
- Hybrid inheritance is a combination of any two or more types of inheritance. 
- Hybrid inheritance is conditionally permitted in java.

<p>
    <img src="./image/hybridInheri.png">
</p>

### 6. Cyclic Inheritance
- In cyclic inheritance, 
    1. A class inherits itself
    2. Two classes inherits from each other, forming a loop or cycle.

- Cyclic Inheritance is not permitted in java.

```java
class Demo1 extends Demo1 {

}
```

```java
class Demo1 extends Demo2 {

    }
class Demo2 extends Demo1 {

}
```

<p>
    <img src="./image/cyclicInheri.png">
</p>

### 7. Private access modifier
- Private members of a class do not participate in inheritance.
- Private members are accessible only within the same class.
- This rule is implemented in order to preserve the piller of encapsulation.
- However, `non-private` members of the parent class can be inherited by the child class

[Java Code](./example/Rule7.java)

<p>
    <img src="./image/privateInheri.png">
</p>

### 8. Constructor
- Constructors of a class do not participate in inheritance.
- Though constructor do not get inherited, they will be executed because of the `super()`.
[Java Code](./example/Rule8.java)

<p>
    <img src="./image/constructor.png">
</p>


## Access Modifiers / Access Specifier in java

1. Access Modifiers in java
    1. `public` 
    2. `protected`
    3. `<default>`
    4. `private`
    5. `static`
    6. `final`
    7. `synchronized` .. etc

2. Access Specifiers in C, C++, etc.

Access Specifiers:
    1. `public` 
    2. `protected`
    3. `<default>`
    4. `private`

Access Modifiers:
    1. `static`
    2. `const`


<p>
    <img src="./image/am.png">
    <i align="center">Access Modifiers in java</i>
</p>

- Access modifiers are `keyword` that are used to define accessibility (visibility) of memebers of a class.

Access Levels 

|**Access Modifiers** | **With the same class** | **Outside the class but in the same package** | **Outside the package but in the related class** | **Outside the package & in  unrelated classes** |
|---|-|-|-|-|
|*public*| Yes| Yes| Yes| Yes|
|*protected*| Yes| Yes| Yes| No|
|*`<default>`*| Yes| Yes| No| No|
|*private*| Yes| No| No| No|


### Following are the access modifiers in java:

#### 1. (+) `public`
- public members  are accessible everywhere in the project

#### 2. (#) `protected`
- protected members  are accessible within the same pacakge and outside the package in related class.

#### 3. (+) `default`
- default members  are accessible only within the same pacakge(package-private modifier
)

#### 4. (~) `private`
- private members  are accessible only within the same class

NOTE:

<p>
    <img src="./image/levelofAM.png">
    <p align="center">Access Modifiers in java</p>
</p>

There are two level of access modifiers:
1. At the top level: `public` or `<default>`
2. At the member-level: `public`, `protected`, `<default>` and `private`


### `packages` in java

- A package is container of a group of related classes 
Syntax : 
```java
package pacakgename;
```

- naming convention of package : Packages are named in reverse order of domain names.

For flipkart.com
Ex. : package com.flipkart;  


### `import` statement in java

- The `import` keyword is used to imoprt in-built and user defined packages.

### Accessing package members

1. Using fully-qualified name (without using import statement)
Ex:
```java
java.util.Scanner sc = new java.util.Scanner(System.in); 
```

2. Importing a specific pacakge members
```java
import java.util.Scanner;
import java.util.ArrayList;
```

3. Importing an entire pacakge

```java
import java.util.*;

Scanner sc = new Scanner(System.in);
ArrayList al = new ArrayList();
```

NOTE: 
> The statement `import java.*`, it will only import the members of "java" package and not the members if its sub-packages(util, math, etc)

- `java.lang` package contains classes that are fundamental to the design of java. Hence it is by default imported in every java program


### `static` import statement in java

- With the help of static import, we can access the static member of a class directly without using class name or any object

- [Example code, using Math class methods](./example/ImportStatement.java)


from java-5 :
```java
import static java.util.Math.*;  // All static members from math class are imported
```

- [Example code, static import of Math class methods](./example/ImportStatement2.java)



## Types of methods in inheritance

<p>
    <img src="./image/methodTypesInInheritance.png">
    <i align="center">Access Modifiers in java</i>
</p>

- In the context of inheritance, we can categorize the method into 3 categories:
#### 1. Inherited Methods 
- There are such methods which have been inherited from the parent class and used as it is.

Advantage: Code Reusability

#### 2. Overridden Methods 
- There are such methods which have been inherited from the parent class and modified to suit the expectations of the child class.

Advantage: Can change the behaviour according to the expectation of the child class.

#### 3. Specialised Methods
- There are such method which are present only in the child class and not in the parent class.

Advantage: Enhances the features & functionalitits of the child class.

#### Example PlaneApp

<p>
    <img src="./image/planeAppUML.png">
    <p align="center">UML Diagram of PlaneApp</p>
</p>

[Java Program for planeApp](./example/PlaneApp.java)

Output:

```text
Plane is taking offf...
Cargo Plane is flying at lower heights..
Cargo plane is carrying goods...
Plane is landing...
Plane is taking offf...
Passenger Plane is flying at medium heights..
Passenger plane is carrying passengers...
Plane is landing...
Plane is taking offf...
Fighter Plane is flying at higher heights..
Fighter plane is carrying weapons...
Plane is landing...
```

#### Example Animal App


<p>
    <img src="./image/AnimalAppUML.png">
    <p align="center">UML Diagram of Animal App</p>
</p>

[Java Program for Animal App](./example/AnimalApp.java)

Output:

```text
Animal is breathing...
Deer grazes and eats grass...
Deers are herbivores
Animal is sleeping...
Animal is breathing...
Tigers hunts and eats...
Tigers are carnivores
Animal is sleeping...
Animal is breathing...
Monkey snatches and eats...
Monkeys are omnivores
Animal is sleeping...
```


### Method Overriding in java
- Method *overriding* allows a child class to reimplement a method which is inhertied a from parent class. 

Example :

<p>
    <img src="./image/MOEx1.png">
    <p align="center">Method Overriding example of String and Mutable string classes</p>
</p>

#### Rules of method overriding

**Rule : 1**
- Access level of the overridden method in the child class cannot tbe more restrictive. In other words, the child class overridden method must retains the same access modifier as that of the parent class of method. Howerver, it's possible to change the access modifier of the overridden method in the child class provided it is less restrictive.

Ex. : 

<p>
    <img src="./image/MORule1.png">
</p>


**Rule : 2**
- i. Return type of the overridden method cannot be changed *(primitive return type)*


<p>
    <img src="./image/MORule2-1.png">
</p>


- ii. However, it is possible to change the return type provided. They are co-variant return types
<p>
    <img src="./image/MORule2-2.png">
</p>

NOTE : Covariant Return types
> It is possible to have different return type for overriding method in the child class provided overridden method and return type should be a sub-type of parent class method's return type.

> In this way, overriding method becomes variant with respect to return type. This way possible from JDK 1.5 onwards 


**Rule : 3**

- The argument list should be exactly the same as that of the parent class method

<p>
    <img src="./image/MORule3.png">
</p>


**Rule : 4**
- Private members cannot be overridden as they don't participate in inheritance

```java

class Animal {
    
    private void eat() {
        System.out.println("Animal is eating");
    }
}

class Moneky extends Animal {
    
    public void eat() { // Specialised method of monkey class

        System.out.println("Monkey steals and eats");
    }
}
        
```


### Difference between method overloading and method overriding

| Sr No |Method Overloading | Method Overriding | 
|-|-|-|
| 1. | Methods have the same name but with different paremeters. | Methods have the same name with same parameters.|
| 2. | It occurs in the same class. | Occurs between parent and child class. |
| 3. | Return types can be same or different. | Return types must be same or co-variant. |
| 4. | Facilitates ease of use. | Facilitates specific implementation for child classes. |
| 5. | Promotes compile-time polymorphism | Promotes runtime polymorphism. |
| 6. | Comparatively high in performance. | Compartively low in performance. |
| 7. | Static methods can be overloaded.  | Static methods cannot be overridden. | 


## Constructors execution in inheritance 

#### Case-1 : Whenever a child class object is created, the parent class constructor will be executed first followed by the child class constructor because of the `super()`.

[Example code](./example/ConsExecutionCase1.java)

<p>
    <img src="./image/ConsExeCase1.png">
    <p align="center"> Memory Map and Flow of execution </p>
</p>

#### Case-2

[Example code](./example/ConsExecutionCase2.java)

<p>
    <img src="./image/ConsExeCase2.png">
    <p align="center"> Memory Map and Flow of execution </p>
</p>

#### Case-3

[Example code](./example/ConsExecutionCase3.java)

<p>
    <img src="./image/ConsExeCase3.png">
    <p align="center"> Memory Map and Flow of execution </p>
</p>



