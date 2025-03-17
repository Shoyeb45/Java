package inheritance.example.association;

public class ConventionExample {
    
}

class Dog {
    private String breed;
    private int age;
    private float price;

    public Dog(String breed, int age, float price) {
        this.breed = breed;
        this.age = age;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String userBreed) {
        breed = userBreed;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int userAge) {
        age = userAge;
    }
    
    public float getPrice() {
        return price;
    }
    
    public void setPrice(float userPrice) {
        price = userPrice;
    }
}

