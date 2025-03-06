class Dog {
    private String breed;
    private int age;
    private float price;

    public String getBreed() {
        return breed;
    }
    
    public float getPrice() {
        return price;
    }
    
    public int getAge() {
        return age;
    }
}


public class DogExample7 {
    public static void main(String[] args) {

        Dog d = new Dog();
       
        System.out.println(d.getBreed());   // null
        System.out.println(d.getAge());     // 0
        System.out.println(d.getPrice());   // 0.0
    }
}


