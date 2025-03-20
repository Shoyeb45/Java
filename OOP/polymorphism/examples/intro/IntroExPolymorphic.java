package polymorphism.examples.intro;

public class IntroExPolymorphic {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        
        Parent ref;

        ref = c1;
        ref.cry();
        
        ref = c2;
        ref.cry();
        
        ref = c3;
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