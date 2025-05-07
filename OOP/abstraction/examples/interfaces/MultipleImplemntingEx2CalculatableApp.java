package examples.interfaces;

public class MultipleImplemntingEx2CalculatableApp {
    public static void main(String[] args) {
        Casio cas = new Casio();
        cas.add();
        cas.sub();
    }
}

interface Calculatable1 {
    public void add();
    public void sub();
}

interface Calculatable2 {
    public void add();
    public void sub();
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
}