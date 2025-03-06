package inheritance.example.special_cases_of_super_and_this;


class Demo1 {
    void disp() {
        System.out.println("Learn from leadeer");
    }
}

class Demo2 extends Demo1 {
    void disp() {
        System.out.println("Pioneering edutainment");
        super.disp();
    }
}
public class Case4 {
    
}
