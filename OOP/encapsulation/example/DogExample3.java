class Dog {
    private String breed;
    private int age;
    private float price;

    public void setDog(String dogBreed, int dogAge, float dogPrice) {
        breed = dogBreed;
        age = dogAge;
        price = dogPrice;
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

public class DogExample3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setDog("Bull Dog", 4, 4500.5f);

        System.out.println(d.getBreed());   
        System.out.println(d.getAge());   
        System.out.println(d.getPrice());   
    }
}