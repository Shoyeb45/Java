class Dog {
    private String breed;
    private int age;
    private float price;

    // getter for breed
    public String getBreed() {
        // Validation
        return breed;
    }
    
    // Setter for dog
    public void setBreed(String userBreed) {
        // Validation
        breed = userBreed;
    }
    
    // getter for age
    public int getAge() {
        // Validation
        return age;
    }
    
    // Setter for age
    public void setAge(int userAge) {
        // Validation
        age = userAge;
    }
    
    // getter for price
    public float getPrice() {
        // Validation
        return price;
    }
    
    // Setter for price
    public void setPrice(float userPrice) {
        // Validation
        price = userPrice;
    }
}

public class DogExample2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(5);   
        d.setBreed("");   
        d.setPrice(123.4f);
        System.out.println(d.getBreed());   
        System.out.println(d.getAge());   
        System.out.println(d.getPrice());   
    }
}