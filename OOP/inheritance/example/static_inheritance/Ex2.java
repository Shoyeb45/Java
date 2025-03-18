package inheritance.example.static_inheritance;


class Parent {
    static int i = 100;

    static {
        sMethod1();
        System.out.println("Parent 1st static block");
    }

    public static void main(String[] args) {
        System.out.println("Parent main()");
        sMethod1();
    }

    public static void sMethod1() {
        System.out.println(j);
    }

    static {
        System.out.println("Parent 2nd static block");
    }
    static int j = 200;
}


class Child extends Parent {
    static int x = 10;
    static {
        sMethod1();
        System.out.println("Child 1st static block");
    }

    public static void main(String...args) {
        System.out.println("Child Main");
        sMethod2();
    }

    public static void sMethod2() {
        System.out.println(y);
    }
    static {
        System.out.println("Child 2nd static block");
    }
    static int y = 20;
}



public class Ex2 {
    public static void main(String[] args) {
        
    }    
}
