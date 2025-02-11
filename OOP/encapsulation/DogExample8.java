class DogExample8 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bull Dog", 4, 4.50f);
        System.out.println(d1.getAge());
        System.out.println(d1.getPrice());
        System.out.println(d1.getBreed());
        
        
        // Dog d2 = new Dog();  compilation error
        // System.out.println(d2.getAge());
        // System.out.println(d2.getPrice());
        // System.out.println(d2.getBreed());
    }
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


