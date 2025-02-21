// package StaticKeyoword.Example;
import java.util.Scanner;

class Farmer {
    private float p;
    private float t;
    private static float r;
    private  float si;

    static  {
        r = 2.5f;
    }

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        p = sc.nextFloat();
        System.out.println("Enter the time duration: ");
        t = sc.nextFloat();
    }

    public void compute() {
        si = (p * r * t) / 100;
    }
    
    public void display() {
        System.out.println("Simple Interest: " + si);
    }

    static void checkEligibility() {
        System.out.println("The applicant must be between 18 & 60 years");
    }
}

public class FarmerApp {
    public static void main(String[] args) {
        Farmer.checkEligibility();
        Farmer f1 = new Farmer();        
        Farmer f2 = new Farmer();        
        Farmer f3 = new Farmer();        

        f1.acceptInput();
        f1.compute();
        f1.display();

        f2.acceptInput();
        f2.compute();
        f2.display();
        // f2.r = 3.5f;  if it is not private
        f3.acceptInput();
        f3.compute();
        f3.display();

    }
}
