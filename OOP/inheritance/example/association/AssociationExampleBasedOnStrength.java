package inheritance.example.association;

public class AssociationExampleBasedOnStrength {
    public static void main(String[] args) {
        Charger c = new Charger("Samsung", 120);
        Mobile m = new Mobile();

        m.setCharger(c);
        System.out.println(m.os.getName());     // Android
        System.out.println(m.os.getSize());     // 512
        System.out.println(m.c.getBrand());     // Samsung
        System.out.println(m.c.getVoltage());   // 120
        
        // Destroy the object 
        m = null;
        
        // System.out.println(m.os.getName());     // NullPointerException
        // System.out.println(m.os.getSize());     // NullPointerException
        // System.out.println(m.c.getBrand());     // NullPointerException
        // System.out.println(m.c.getVoltage());   // NullPointerException

        System.out.println(c.getBrand());   // Samsung
        System.out.println(c.getVoltage());   // 120
    }
}


// Composite class
class OperatingSystem {
    private String name;
    private int size;

    public OperatingSystem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}


// Aggregate class
class Charger {
    private String brand;
    private int voltage;

    public Charger(String brand, int voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }

    public String getBrand() {
        return brand;
    }

    public int getVoltage() {
        return voltage;
    }
}

// main class
class Mobile {
    OperatingSystem os = new OperatingSystem("Android", 512);
    Charger c;

    public void setCharger(Charger c) {
        this.c = c;
    }
}

