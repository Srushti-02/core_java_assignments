package swingPractice;
//import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
public class ButtonInSwing {

	public static void main(String[] args) {
		//Simple Button
		
//		JFrame f = new JFrame("Hello, there!");
//		JButton b = new JButton("click");
//		b.setBounds(100, 100, 100, 30);//x, y, width, height
//		b.setBackground(Color.gray); //color for button
//		b.setText("Try"); //set text for button
//		f.add(b);
//		f.setSize(500,500); //frame size = width,height
//		f.setLayout(null); //not using any layout manager
//		f.setVisible(true); //to make frame visible
		
		
		//Button With Image
		JFrame f = new JFrame("Button With Image");
		ImageIcon i = new ImageIcon("D:\\srushti villa website\\icons\\location.png");
		Image image = i.getImage();
		Image newImage = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		ImageIcon img = new ImageIcon(newImage);
		JButton b = new JButton(img);
		b.setBounds(100, 100, 200, 100);
		f.add(b);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
