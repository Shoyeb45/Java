class Demo {
    void disp(Number x) {
        System.out.println("Number " + x);
    }
    void disp(int x) {
        System.out.println(x);
    }
}
public class Launch {
    public static void main(String[] args) {
        Demo d = new Demo();
        Integer a = 10;
        d.disp(a);  // Compiler will perform widening and disp(long) will be called
        
    }
}