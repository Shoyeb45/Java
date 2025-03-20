# Polymorphism in java

### 
#### Non-polymorphic version:

<p>
    <img src="./image/intro/introExUML.png">
</p>

- [Java code of non-polymorphic](./examples/intro/IntroExNonPolymorphic.java)

<p>
    <img src="./image/intro/tightCoupling.png">
</p>

Relationship of cry method =>  $3: 3 = 1:1$

> Polymorphism -> Poly(many) + morph(Different forms)
- $1 : \text{Many}$

Examples of polymorphism in nature:

- **Carbon** exists in 1) Graphite, 2) Diamond, 3) Coal..
- **Water** exists in 1) Solid, 2) Liquid, 3) Gaseous..

- In the above example, we cannot achieve polymorphism because the relationship is $3:3$ or $1:1$ and not $1 : \text{Many}$.
- This is because, in the above example tight-coupling exists and hence polymorphism cannot be achieved.
- Tight-coupling refers to the process of creating child-type reference to child-type object
- If polymorphism must be achieved we should have loose-coupling as shown below.
- Loose coupling refers to the process of creating parent-type reference to child-type objects

#### Polymorphic Version

<p>
    <img src="./image/intro/introExPolymorphicUML.png">
    <p>UML</p>
</p>

- [Java code of polymorphic](./examples/intro/IntroExPolymorphic.java)

- The above implementation referred to as ***Tight coupling or upcast***


<p>
    <img src="./image/intro/relationshipPoly.png">
</p>

- Relationship : ($1: 3 = 1: \text{many}$)
- Hence it is a **real polymorphism**


#### Ploymorphism 

- It refers to the ability of an object to take on multiple forms.

- **Dynamic method dispatch** : It is the mechanism by which a call to an overridden method id resolved at run-time rather than compile time.
- When an overridden method is called through a parent reference, java(JVM) determines which version (Parent/Child) of that method is to be executed based upon the type of the object being refrred to at the time call occurs. Thus determination is made at the run-time.
- At run-time it depends on the type of the object being referred to (not the type of the reference variable) that determines which version of the overridden method will be executed.


### Accessing Specialised Method

<p>
    <img src="./image/specialisedMethod/Ex1UML.png">
    <p> UML </p>
</p>

- [Example of java code](./examples/)

<p>
    <img src="./image/specialisedMethod/ex1Error.png">
    <p align="center"> Error in accessing directly eat method </p>
</p>

<br>

- The error in the above program is because we are trying to access the specialised method of the child class using the parent type reference directly.
- The limitation of parent-type reference to child object is that using parent type reference we can not access the specialised methods of the child objects directly. In otherword, using parent reference we can access only inherited method and overridden methods. 
- The compiler check for method is performed on the basis of the type of reference, so in the parent class the method will not be present, hence compiler error.
- The error of the above program can be overcome by performing down-casting
- Down-casting refers to the process of temporarily converting parent-type reference to child-type so that the specialized method of the child class can be accessed.

<p>
    <img src="./image/specialisedMethod/ex1sol.png">
</p>


NOTE:

<p>
    <img src="./image/specialisedMethod/coupling.png">
</p>


|Advantage of Upcasting| Advantage of Downcasting|
|--|--|
|Polymorphism can be achieved| Using parent-type reference we can access the specialised method of the child class|
|Code flexibility| |
|Code reduction| |


## Advantages of Polymorphism 

### 1. Plane hierarchy 

<p>
    <img src="./image/advantage/planeUML.png">
    <p align="center">UML of PlaneApp</p>
</p>

- [Plane App Java Code](./examples/advantage/PlaneExample.java)

<p>
    <img src="./image/advantage/PlaneApp.png">
    <p align="center">Different implementation and leveraging power of polymorphism</p>
</p>

### 2. Animal Hierarchy

<p>
    <img src="./image/advantage/animalAppUML.png">
    <p align="center">UML of AnimalApp</p>
</p>

- [Animal App Java Code](./examples/advantage/AnimalApp.java)


<p>
    <img src="./image/advantage/AnimalApp.png">
    <p align="center">Different implementation and leveraging power of polymorphism</p>
</p>
