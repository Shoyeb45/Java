// package inheritance.example;

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }

    public void breath() {
        System.out.println("Animal is breathing...");
    }
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Deer grazes and eats grass...");
    }

    public void foodHabit() {
        System.out.println("Deers are herbivores");
    }
}
class Tiger extends Animal {
    public void eat() {
        System.out.println("Tigers hunts and eats...");
    }

    public void foodHabit() {
        System.out.println("Tigers are carnivores");
    }
}
class Monkey extends Animal {
    public void eat() {
        System.out.println("Monkey snatches and eats...");
    }

    public void foodHabit() {
        System.out.println("Monkeys are omnivores");
    }
}


public class AnimalApp {
    public static void main(String[] args) {
        Deer deer = new Deer();
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();

        deer.breath();
        deer.eat();
        deer.foodHabit();
        deer.sleep();

        tiger.breath();
        tiger.eat();
        tiger.foodHabit();
        tiger.sleep();

        monkey.breath();
        monkey.eat();
        monkey.foodHabit();
        monkey.sleep();
    }
}
