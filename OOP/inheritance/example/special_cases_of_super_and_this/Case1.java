package inheritance.example.special_cases_of_super_and_this;

class Demo1 {
    int i = 9;
}

class Demo2 extends Demo1 {
    int i = 99;

    void disp() {
        System.out.println(i); // 99
        System.out.println(super.i);
    }
}



public class Case1 {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.disp();
    }
}
