package swingPractice;
import javax.swing.*;
import java.awt.event.*;
public class ActionListner {

	public static void main(String[] args) {
		JFrame f = new JFrame("ActionListners example");
		JButton b = new JButton("Click Me");
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		b.setBounds(100, 100, 100, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Hello, Everyone!!");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
