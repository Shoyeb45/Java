package examples.interfaces;
import java.util.Scanner;


public class CalculatableApp {
    public static void main(String[] args) {
        Casio cas = new Casio();
        Orpat orp = new Orpat();
        Citizen cit = new Citizen();
        
        Maths.permit(cit);
        Maths.permit(orp);
        Maths.permit(cas);
    }
}

class Maths {
    public static void permit(Calculatable ref) {
        ref.add();
        ref.sub();
    }
}

interface Calculatable {
    public void add();
    public void sub();
}

class Casio implements Calculatable {
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


class Orpat implements Calculatable {

    public void add() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int c = a + b;
        
        System.out.println(c);
        sc.close();
    }
    
    public void sub() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int c = a - b;
        System.out.println(c);
        sc.close();
    }
}


class Citizen implements Calculatable {
    public void add() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int c = a - (-b);
        
        System.out.println(c);
        sc.close();
    }
    
    public void sub() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int c = a + (-b);
        System.out.println(c);
        sc.close();
    }
}