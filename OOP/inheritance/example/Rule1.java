// package inheritance.example;

class Demo1 {
    void disp1() {
        System.out.println("Learn from readers");
    }
}

class Demo2 extends Demo1 {
    void disp2() {
        System.out.println("Pioneering Edutainment");
    }
}

public class Rule1 {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();

        d2.disp1();
        d2.disp2();
    }
}

