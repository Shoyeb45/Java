package StaticKeyoword.Example;

public class StaticExample3 {
    static int a = 10, b = 20, c = 30;

    static {
        System.out.println("Inside static block");
        a = 100;
        b = 200;
        c = 300;
        // x = 450;
        // y = 550;
        // z = 650;
    }

    public static void disp1() {
        System.out.println("Inside static method-disp1()");
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        // System.out.println("x " + x);
        // System.out.println("y " + y);
        // System.out.println("z " + z);
    }
    
    int x = 40, y = 50, z = 60;

    {
        System.out.println("Inside non-static block");
        x = 45;
        y = 55;
        z = 65;
    }

    public void disp2() {
        System.out.println("Inside non-static method-disp2()");
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        System.out.println("x " + x);
        System.out.println("y " + y);
        System.out.println("z " + z);
    }

    public StaticExample3 () {
        System.out.println("Inside constructor");
        x = 400;
        y = 500;
        z = 600;
    }

    public static void main(String[] args) {
        System.out.println("Inside main() methd");
        disp1();
        StaticExample3 st = new StaticExample3();
        st.disp1();
    }

}
