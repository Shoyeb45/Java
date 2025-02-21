class Dog {
    static int count = 0;

    Dog() {
        count++;
    }

    public static int getTotalCountOfObjects() {
        return count;
    }
}

// More efficient approach
class Cat {
    String breed;
    int age;
    static int count = 0;
    {
        count++;
    }

    Cat(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    Cat(int age) {
        this.age = age;
    }

    Cat(String breed) {
        this.breed = breed;
    }

}
public class Question1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(Dog.getTotalCountOfObjects());

        Dog d2 = new Dog();
        System.out.println(Dog.getTotalCountOfObjects());
    }
}
