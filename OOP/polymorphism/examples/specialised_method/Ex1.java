package polymorphism.examples.specialised_method;

public class Ex1 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();

        Parent ref;

        ref = c1;
        ref.cry(); // Ploymorphism
        ((Child1)(ref)).eat(); // Solution using downcasting
        
        ref = c2;
        ref.cry();
        ((Child2)(ref)).eat();

        ref = c3;
        ref.cry();
        ((Child3)(ref)).eat();
    }
}

class Parent {
    public void cry() {
        System.out.println("Parent doesn't cry");
    }
}
class Child1 extends Parent {
    public void cry() {
        System.out.println("Child1 cries with low voice");
    }

    public void eat() {
        System.out.println("Child1 eats less food");
    }
}

class Child2 extends Parent {
    public void cry() {
        System.out.println("Child2 cries with moderate voice");
    
    }
    public void eat() {
        System.out.println("Child2 eats sufficient food");
    }
}

class Child3 extends Parent {
    public void cry() {
        System.out.println("Child3 cries with loud voice");
    }

    public void eat() {
        System.out.println("Child3 eats too much food");
    }
}
