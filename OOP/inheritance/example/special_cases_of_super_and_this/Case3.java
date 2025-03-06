package inheritance.example.special_cases_of_super_and_this;

class Demo1 {
    int i = 9; 
}

class Demo2 extends Demo1 {
    int i = 99;
}

class Demo3 extends Demo1 {
    int i = 999;
    
    void disp() {
    
        System.out.println(i);      // 999
        System.out.println(this.i); // 99
        // System.out.println(super.super.i);// Compilation Error
    }
}

public class Case3 {
    
}
