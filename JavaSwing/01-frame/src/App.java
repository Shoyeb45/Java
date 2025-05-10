import java.awt.Color;


public class App {
    public static void main(String[] args) throws Exception {
        MyFrame frame = new MyFrame("My first JFrame in swing", new Color(0xff243));
        frame.addIcon("icon.png");
    }
}
