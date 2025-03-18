package inheritance.example.association;

public class AssociationStrengthEx2 {
    public static void main(String[] args) {
        Bike bike = new Bike("Luna", 25);
        Book book = new Book("Ravi Belagere", "Heli Hoga Karana");

        Student student = new Student();
        student.setBike(bike);
        student.setBook(book);

        System.out.println(student.heart.getHearbeat());
        System.out.println(student.heart.getWeight());

        System.out.println(student.brain.getColor());
        System.out.println(student.brain.getWeight());

        System.out.println(student.bike.getBrand());
        System.out.println(student.bike.getMileage());

        System.out.println(student.book.getAuthor());
        System.out.println(student.book.getTitle());
        
        student = null;

        // System.out.println(student.heart.getHearbeat());// NullPointerException
        // System.out.println(student.heart.getWeight());  // NullPointerException
    
        // System.out.println(student.brain.getColor());   // NullPointerException
        // System.out.println(student.brain.getWeight());  // NullPointerException
    
        // System.out.println(student.bike.getBrand());    // NullPointerException
        // System.out.println(student.bike.getMileage());  // NullPointerException
    
        // System.out.println(student.book.getAuthor());   // NullPointerException
        // System.out.println(student.book.getTitle());    // NullPointerException

        // Bike
        System.out.println(bike.getBrand());
        System.out.println(bike.getMileage());

        // Book
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
    }
}

// Composite class
class Heart {
    private int heartbeat;
    private int weight;

    public Heart(int heartbeat, int weight) {
        this.heartbeat = heartbeat;
        this.weight = weight;
    }

    public int getHearbeat() {
        return heartbeat;
    }

    public int getWeight() {
        return weight;
    }
}

// Composite class
class Brain {
    private String color;
    private int weight;

    public Brain(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}


// Aggregate class
class Bike {
    private String brand;
    private int mileage;

    public Bike(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }
}

// aggregate class
class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}

// main class
class Student {
    // Composite object
    public Heart heart = new Heart(72, 832);
    public Brain brain = new Brain("gray", 150);

    // Aggregate Object
    public Bike bike;
    public Book book;

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}