package inheritance.example;

class Demo1 {
    int a; 
    int b;

    public Demo1() {
        super(); 
        a = 10;
        b = 20;
    }

    public Demo1(int i, int j) {
        super(); 
        a = i;
        b = j;
    }
}

class Demo2 extends Demo1 {
    int c;
    int d;

    public Demo2() {
        super(); 
        c = 30;
        d = 40;
    }

    public Demo2(int m, int n) {
        super(); 
        c = m;
        d = n;
    }

    public void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


public class ConsExecutionCase2 {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2(200, 100);
        d2.display();
    }
}
