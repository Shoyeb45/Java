class Dog extends Object {
    private String breed;
    private int age;
    private float price;

    // Constructor
    public Dog() {

        super();
    }   

    // getter for breed
    public String getBreed() {
        // Validation
        return breed;
    }
    
    // Setter for dog
    public float getPrice() {
        return price;
    }
    
    // getter for age
    public int getAge() {
        // Validation
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


