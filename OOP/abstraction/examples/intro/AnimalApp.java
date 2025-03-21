package abstraction.examples.intro;

public class AnimalApp {
    public static void main(String[] args) {
        Deer d = new Deer();
        Tiger t = new Tiger();
        Monkey m = new Monkey();

        Forest.permit(d);
        Forest.permit(m);
        Forest.permit(t);
    }
}

class Forest {
    public static void permit(Animal a) {
        a.foodHabit();
        a.eat();
        a.sleep();
    }
}
abstract class Animal {
    abstract public void eat();

    abstract public void sleep();

    abstract public void foodHabit();
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Deer grazes and eats grass.");
    }

    public void sleep() {
        System.out.println("Deer is sleeping under the tree");
    }

    public void foodHabit() {
        System.out.println("Deers are herbivores");
    }
}

class Tiger extends Animal {
    public void eat() {
        System.out.println("Tigers hunts and eats.");
    }
    
    public void sleep() {
        System.out.println("Tiger is sleeping inside the cave");
    }

    public void foodHabit() {
        System.out.println("Tigers are carnivores");
    }
}

class Monkey extends Animal {
    public void eat() {
        System.out.println("Monkey snatches and eats.");
    }

    public void sleep() {
        System.out.println("Monkey is sleeping on the tree.");
    } 
    public void foodHabit() {
        System.out.println("Monkeys are omnivores");
    }
}