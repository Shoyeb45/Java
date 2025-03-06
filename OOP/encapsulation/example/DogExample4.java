class Dog {
    private String breed;
    private int age;
    private float price;

    public void setDog(String breed, int age, float price) {
        breed = breed;
        age = age;
        price = price;
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

public class DogExample4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setDog("Bull Dog", 4, 4500.5f);

        System.out.println(d.getBreed());   // null
        System.out.println(d.getAge());     // 0
        System.out.println(d.getPrice());   // 0.0
    }
}


