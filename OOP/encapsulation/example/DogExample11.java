class Dog
{
    private String breed;
    private int age;
    private float price;
    
    public Dog(String breed, int age, float price) {

        this(breed);
    }
    
    public Dog(String breed) {

        this();
        this.breed = breed;
    }
    
    public Dog() {


        breed = "Pug";
        age = 2;
        price = 7500.5f;
    }
    
    public String getBreed() {
        return breed;
    }
    public int getAge(){
        return age;
    }
    public float getPrice() {
        return price;
    }
}

public class DogExample11 {
    public static void main(String[] args) {

        Dog d1 = new Dog("BullDog", 4, 4500.5f);

        System.out.println(d1.getBreed()); 
        System.out.println(d1.getAge());
        System.out.println(d1.getPrice());
        
        Dog d2 = new Dog();
        System.out.println(d2.getBreed());
        System.out.println(d2.getAge());
        System.out.println(d2.getPrice());
    }
}
