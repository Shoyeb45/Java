package inheritance.example.special_cases_of_super_and_this;
class Demo1 {
    int i = 9; 
}

class Demo2 extends Demo1 {
    int i = 99;

    void disp() {
        int i = 999;

        System.out.println(i);      // 999
        System.out.println(this.i); // 99
        System.out.println(super.i);// 9
    }
}

public class Case2 {
    
}
