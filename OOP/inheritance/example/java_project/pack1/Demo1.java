package pack1;

public class Demo1 {
    public int a = 10;
    protected int b = 20;
    /*<default>*/ int c = 30;
    private int d = 40;   
    
}

class Demo2 extends Demo1 {

    void accessAll() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


