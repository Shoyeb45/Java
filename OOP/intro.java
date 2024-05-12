// Creating class
class Pen {
    // Attribnutes - data
    String colour;
    String type;

    // Method of class pen - memeber
    public void write() {
        System.out.println("Pen is writing something ");
    }

    // Accessing attributes of object via this keyword
    public void printColour() {
        System.out.println(this.colour);
    }
}

public class intro {
    public static void main(String[] args) {
        // Creating object of clas Pen
        Pen pen1 = new Pen();
        pen1.colour = "Blue";
        pen1.type = "gel";
        StringBuilder output = new StringBuilder("The colour of pen is ");
        output.append(pen1.colour);
        output.append(" And type is ");
        output.append(pen1.type);

        System.out.println(output);

        pen1.write();
        pen1.printColour();

        Pen pen2 = new Pen();
        pen2.colour = "Red";
        pen2.type = "Ball";
        pen2.printColour();
    }
}
