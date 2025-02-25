package inheritance.example;

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


class Demo3 extends Demo2 {
    void disp3() {
        System.out.println("Work is worship");
    }
}
public class Rule2 {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        d3.disp1();
        d3.disp2();
        d3.disp3();
    }
}
