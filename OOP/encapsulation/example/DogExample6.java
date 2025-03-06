class Dog {
    private String breed;
    private int age;
    private float price;

    // Constructor
    public Dog(String breed, int age, float price) {
        this.breed = breed;
        this.age = age;
        this.price = price;
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


public class DogExample6 {
    public static void main(String[] args) {

        Dog d = new Dog("Bull Dog", 4, 4500.5f);
       
        System.out.println(d.getBreed());   // Bull Dog
        System.out.println(d.getAge());     // 4
        System.out.println(d.getPrice());   // 4500.5
    }    
}
