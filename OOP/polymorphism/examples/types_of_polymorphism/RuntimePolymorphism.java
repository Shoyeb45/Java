package polymorphism.examples.types_of_polymorphism;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Parent ref = new Child1();
        ref.cry();

        ref = new Child2();
        ref.cry();

        ref = new Child3();
        ref.cry();
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
}

class Child2 extends Parent {
    public void cry() {
        System.out.println("Child2 cries with moderate voice");
    }
}

class Child3 extends Parent {
    public void cry() {
        System.out.println("Child3 cries with loud voice");
    }
}

