package ninthAssignment;
import java.awt.*;
class FontFrame{
	Frame f = new Frame("Untitled");
	Label l = new Label("Srushti Shindkar");
	
	public FontFrame() {
		l.setBounds(50, 100, 300, 30);
		l.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		f.add(l);
		f.setSize(400, 400);
		f.setBackground(Color.YELLOW);
		f.setLayout(null);
		f.setVisible(true);
	}
}
public class Demo4 {

	public static void main(String[] args) {
		FontFrame fm = new FontFrame();
	}

}
