
abstract public class Shape {
    protected float area;

    abstract public void acceptInput();
    abstract public void compute();
    public void disp() {
        System.out.println("The area of " + this.getClass() + " is : " + area);
    }
}
