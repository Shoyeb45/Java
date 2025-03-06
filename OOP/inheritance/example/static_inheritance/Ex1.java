package inheritance.example.static_inheritance;

public class Ex1 {
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

