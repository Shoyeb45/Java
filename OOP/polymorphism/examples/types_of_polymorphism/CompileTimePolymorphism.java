package polymorphism.examples.types_of_polymorphism;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(45.5f, 75);
    }
}

class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, int b) {
        return a + b;
    }

    public float add(int a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}


