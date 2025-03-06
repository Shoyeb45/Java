package inheritance.example;



class Demo1 {
    int a, b;

    public Demo1() {

        a = 100;
        b = 200;
    }

    public Demo1(int i, int j) {
        this();
        a = i;
        b = j;
    }
}

class Demo2 extends Demo1 {
    int c, d;

    public Demo2() {

        c = 30;
        d = 40;
    }

    public Demo2(int x, int y) {
        super(x, y);
        c = x;
        d = y;
    }

    public Demo2(int m, int n, int o, int p) {
        this(m, n);
        c = o;
        d = p;
    }

    public void disp() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


public class ConsExecutionCase5 {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2(10, 20, 30, 40);
        d2.disp();
    }
}


