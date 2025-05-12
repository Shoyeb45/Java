import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setTitle("Grid Layout in java");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 3, 10, 12));
        int i = 1;
        frame.add(new JButton(Integer.toString(i++)));
        frame.add(new JButton(Integer.toString(i++)));
        frame.add(new JButton(Integer.toString(i++)));
        frame.add(new JButton(Integer.toString(i++)));
        frame.add(new JButton(Integer.toString(i++)));
        frame.add(new JButton(Integer.toString(i++)));
        frame.add(new JButton(Integer.toString(i++)));
        frame.add(new JButton(Integer.toString(i++)));
        frame.add(new JButton(Integer.toString(i++)));

        frame.setVisible(true);
    }
}
