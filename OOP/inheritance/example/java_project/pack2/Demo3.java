package inheritance.example.java_project.pack2;
import  pack1.*;

public class Demo3 extends Demo1 {
    void accessAll() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Demo4 {
    void accessAll() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
