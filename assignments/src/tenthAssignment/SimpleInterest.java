package tenthAssignment;

import java.awt.*;
import java.awt.event.*;

class SimpleInterestClass{
	Button b1 = new Button("Calculate");
	Button b2 = new Button("Reset");
	Label l1 = new Label("principal amount");
	Label l2 = new Label("rate of interest");
	Label l3 = new Label("no of years");
	Label l4 = new Label("simple interest");
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	TextField tf3 = new TextField();
	TextField tf4 = new TextField();
	Frame f = new Frame("SI Calculator");
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==b1) {
			int pa = Integer.parseInt(tf1.getText());
			int ri = Integer.parseInt(tf2.getText());
			int yr = Integer.parseInt(tf3.getText());
			
			int interest = (pa*ri*yr)/100;
			tf4.setText("="+interest);
		}
	}
	
	public SimpleInterestClass() {
		b1.setBounds(50, 300, 100, 30);
		b2.setBounds(200, 300, 100, 30);
		b1.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e){
            	int p = Integer.parseInt(tf1.getText());
            	double r = Double.parseDouble(tf2.getText());
            	int n = Integer.parseInt(tf3.getText());
                tf4.setText("Rs. "+ (double)(p*r*n)/100);
            }
          
        });
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf4.setText(null);
			}		
		});
		l4.setBounds(50, 350, 100, 30);
		l3.setBounds(50, 200, 100, 30);
		l2.setBounds(50, 150, 100, 30);
		l1.setBounds(50, 100, 100, 30);
		tf4.setBounds(200, 350, 100, 30);
		tf3.setBounds(200, 200, 100, 30);
		tf2.setBounds(200, 150, 100, 30);
		tf1.setBounds(200, 100, 100, 30);
		tf4.setEditable(false);
		f.setSize(400, 500);
		f.add(b1);
		f.add(b2);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.setLayout(null);
		f.setVisible(true);
	}
}
public class SimpleInterest {

	public static void main(String[] args) {
		SimpleInterestClass si = new SimpleInterestClass();
	}

}
