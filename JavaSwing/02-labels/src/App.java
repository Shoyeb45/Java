import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) throws Exception {
        Border border = BorderFactory.createLineBorder(Color.MAGENTA, 3, true);   
        ImageIcon image = new ImageIcon("opLogo.png", "One piece");
        
        JLabel label = new JLabel();
        label.setText("Welcome to my app");  // by default it will set label to the center in vertical axis and left side in horizontal axis
        label.setBorder(border);  
        label.setHorizontalAlignment(JLabel.CENTER);   // set alignment
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);    // for visibility of the bg color we need to set opaque as true   
        label.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 35));  // set font of the text
        label.setForeground(Color.white);   // Set color of the font
        label.setIcon(image);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBounds(0, 0, 300, 300);   // manually setting up the height and width
        JFrame frame = new JFrame();

        frame.setTitle("02-labels in java swing");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
        // frame.pack();


        /*
        // JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("dude.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel(); //create a label
		label.setText("bro, do you even code?"); //set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); //set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,100)); //set font of text
		label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //display background color
		//label.setBorder(border); //sets border of label (not image+text)
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions
			
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);	 
		frame.add(label);
		frame.pack();

         */
    }
}
