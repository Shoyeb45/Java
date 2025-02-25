package inheritance.example;

class Parent extends Object {
    public Parent() {
        super();
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    public Child() {
        super();
        System.out.println("Child constructor");
    }
}

class Object {
    public  Object() {

    }
}

public class Rule8 {
    public static void main(String[] args) {
        Child c = new Child();
    }    
}


