package ninthAssignment;
import java.awt.*;

class LoginForm{
	Button b1 = new Button("Ok");
	Button b2 = new Button("Cancel");
	Label l1 = new Label("Username");
	Label l2 = new Label("Password");
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	Frame f = new Frame("My Login");
	
	public LoginForm() {
		b1.setBounds(50, 200, 100, 30);
		b2.setBounds(200, 200, 100, 30);
		l2.setBounds(50, 150, 100, 30);
		l1.setBounds(50, 100, 100, 30);
		tf2.setBounds(200, 150, 100, 30);
		tf1.setBounds(200, 100, 100, 30);
		f.setSize(500, 500);
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.add(l2);
		f.add(tf1);
		f.add(tf2);
		f.setLayout(null);
		f.setVisible(true);
	}
}
public class Demo2 {
	public static void main(String[] args) {
		LoginForm lf = new LoginForm();
	}

}
