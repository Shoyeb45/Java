package examples.interfaces;

public class MultipleImplemntingEx1CalculatableApp {
    public static void main(String[] args) {
        
    }
}

interface Calculatable1 {
    public void add();
    public void sub();
}

interface Calculatable2 {
    public void mul();
    public void div();
}

class Casio implements Calculatable1, Calculatable2 {
    
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
