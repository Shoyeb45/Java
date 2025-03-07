

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

    {
        System.out.println("Parent 2nd instance block");
    }

    int j = 200;
}

class Child extends Parent {
    int x = 10;
    {
        nsMethod2();
        System.out.println("Child 1st instance block");
    }

    public Child() {
        System.out.println("Child Constructor");
    }
    public static void main(String...args) {
        System.out.println("Child Main");
        Child c = new Child();
        System.out.println("Execution back to main()");
    }

    public void nsMethod2() {
        System.out.println(y);
    }

    {
        System.out.println("Child 2nd instance block");
    }
    int y = 20;
}