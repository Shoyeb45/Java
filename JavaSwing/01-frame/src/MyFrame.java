import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame { 
    public MyFrame(String title, Color bgColor) {
        // Set the title for the window
        this.setTitle(title);   
        
        // Set the default close operation
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the size of the window
        this.setSize(400, 430);

        // Not allow to resize the window
        // this.setResizable(false);

        // Make the window visible
        this.setVisible(true);
        this.getContentPane().setBackground(bgColor);
    }

    public void addIcon(String pathToImage) {
        ImageIcon icon = new ImageIcon(pathToImage);
        this.setIconImage(icon.getImage());
    }
}
