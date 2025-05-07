package examples.interfaces;

public class ExtendAndImplementEx1 {
    
}


class Math {
    public void mul() {
        int a = 100;
        int b = 50;
        int c = a * b;
        System.out.println(c);
    }
    
    public void div() {
        int a = 100;
        int b = 50;
        int c = a / b;
        System.out.println(c);
    }
}

interface Calculatable {
    public void add();
    public void sub();
}

class Casio extends Math implements Calculatable {
    public void add() {
        int a = 100;
        int b = 50;
        int c = a + b;
        System.out.println(c);
    }
    
    public void sub() {
        int a = 100;
        int b = 50;
        int c = a - b;
        System.out.println(c);   
    }
}