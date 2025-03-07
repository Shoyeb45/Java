// package inheritance.example.instance_inheritance;

class Parent {
    int i = 100;
    {
        nsMethod1();
        System.out.println("Parent 1st instance block");
    }

    public Parent() {
        System.out.println("Parent Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Parent main()");
        Parent p = new Parent();
    }
    public void nsMethod1() {
        System.out.println(j);
    }

    int j = 200;
}
