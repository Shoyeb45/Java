package inheritance.example;

class Parent {
    private int acc_no = 12345;
    private int pwd = 1001;
    public String car = "Innova";
    protected String door_loc = "Key";
    String food = "Burger";
}


class Child extends  Parent {
    void accessProperties() {
        // System.out.println(acc_no);
        // System.out.println(pwd);
        System.out.println(car);
        System.out.println(door_loc);
        System.out.println(food);
    }
}


public class Rule6 {
    public static void main(String[] args) {
        Child c = new Child();
        c.accessProperties();
    }
}
