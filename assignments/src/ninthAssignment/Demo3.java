package ninthAssignment;
import java.awt.*;
class ScrollBar{
	Frame f = new Frame("Scroll Bars");
	Scrollbar sb1 = new Scrollbar();
	Scrollbar sb2 = new Scrollbar();
	Scrollbar sb3 = new Scrollbar();
	
	public ScrollBar() {
		sb1.setBounds(20, 50, 30, 150);
		sb1.setBackground(Color.ORANGE);
		f.add(sb1);
		
		sb2.setBounds(70, 50, 30, 150);
		sb2.setBackground(Color.BLACK);
		f.add(sb2);
		
		sb3.setBounds(120, 50, 30, 150);
		sb3.setBackground(Color.CYAN);
		f.add(sb3);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		ScrollBar sb = new ScrollBar();
	}

}
