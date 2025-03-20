package inheritance.example.delegation;

public class Ex1 {
    
}


class Owner {
    public static void main(String[] args) {
        Supervisor s = new Supervisor();
        s.wash();
        s.clean();
        s.dust();
    }
}

class Supervisor {
    Worker w = new Worker();

    public void wash() {
        w.wash();
    }

    public void clean() {
        w.clean();
    }
    public void dust() {
        w.dust();
    }

}

class Worker {
    public void wash() {
        System.out.println("Washing...");
    }

    public void clean() {
        System.out.println("Cleaning...");
    }
    public void dust() {
        System.out.println("Dusting...");
    }
}
