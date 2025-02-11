public class DogExample10 {
    public static void main(String[] args) {

        Dog d1 = new Dog("Bull Dog", 4, 4.50f);

        System.out.println(d1.getAge());
        System.out.println(d1.getPrice());
        System.out.println(d1.getBreed());
        
        
        Dog d2 = new Dog();

        System.out.println(d2.getAge());
        System.out.println(d2.getPrice());
        System.out.println(d2.getBreed());          
    }
}


class Dog 
{
    private String breed;
    private int age;
    private float price;

    public Dog(String breed, int age, float price) {

        this();
    }
    

    public Dog() {
        

        breed = "Pug";
        price = 7.5f;
        age = 2;
    }
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