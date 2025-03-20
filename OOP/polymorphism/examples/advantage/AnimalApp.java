package polymorphism.examples.advantage;

// polymorphic code without advantages
// public class AnimalApp {
//     public static void main(String[] args) {
//         Deer d =new Deer();
//         Tiger t = new Tiger();
//         Monkey m = new Monkey();

//         Animal ref;

//         ref = d;
//         ref.foodHabit();
//         ref.eat();
//         ref.sleep();

//         ref = t;
//         ref.foodHabit();
//         ref.eat();
//         ref.sleep();

//         ref = m;
//         ref.foodHabit();
//         ref.eat();
//         ref.sleep();
//     }
// }

// non-polymorphic code
// public class AnimalApp {
//     public static void main(String[] args) {
//         Deer d =new Deer();
//         Tiger t = new Tiger();
//         Monkey m = new Monkey();

//         d.foodHabit();
//         d.eat();
//         d.sleep();

//         t.foodHabit();
//         t.eat();
//         t.sleep();

//         m.foodHabit();
//         m.eat();
//         m.sleep();
//     }
// }

// Polymorphic version with advantages
class Forest {
    public void permit(Animal ref) {
        ref.foodHabit();
        ref.eat();
        ref.sleep();
    }
}

public class AnimalApp {
    public static void main(String[] args) {
        Deer d =new Deer();
        Tiger t = new Tiger();
        Monkey m = new Monkey();

        Forest f = new Forest();

        f.permit(d);
        f.permit(t);
        f.permit(m);
    }
}


class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

    public void foodHabit() {
        System.out.println("Animal has a food habit.");
    }
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
