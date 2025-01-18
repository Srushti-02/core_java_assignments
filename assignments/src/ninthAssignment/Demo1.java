package ninthAssignment;
import java.awt.*;

//To Show the use of various AWT Components
public class Demo1{
	static Button b1, b2;
	static Label l1, l2;
	static TextField tf1, tf2, tf3;
	static Checkbox ch1;
	static Frame f = new Frame("Demo1");
	public static void main(String[] args) {
		b1 = new Button("OK");
		b1.setBounds(50, 200, 50, 30);
		b2 = new Button("Cancel");
		b2.setBounds(120, 200, 100, 30);
		
		l1 = new Label("User Name", Label.CENTER);
		l1.setBounds(50,50, 120, 30);
		l2 = new Label("Password", Label.CENTER);
		l2.setBounds(50,100, 120, 30);
		
		l1.setBackground(Color.WHITE);
		l2.setBackground(Color.WHITE);
		tf1 = new TextField("eg. Srushti Shindkar");
		tf1.setBounds(200, 50, 120, 30);
		tf2 = new TextField("eg. *******");
		tf2.setBounds(200, 100, 120, 30);
		tf3 = new TextField("Forgot password");
		tf3.setBounds(50, 150, 220, 30);
		tf3.setEditable(false);
		
		ch1 = new Checkbox("Keep Signed In?");
		ch1.setBounds(50, 250, 250, 30);
		ch1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		f.setLayout(null);
		f.setBackground(Color.gray);
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.add(l2);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(ch1);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}

}
