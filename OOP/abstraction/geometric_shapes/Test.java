
public class Test {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle re = new Rectangle();
        Circle c = new Circle();

        Geometry.permit(s);
        Geometry.permit(re);
        Geometry.permit(c);
    }
}

class Geometry {
    public static void permit(Shape ref) {
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}
