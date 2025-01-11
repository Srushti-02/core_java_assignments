package sixthAssignment;

abstract class Shape{
	abstract double area();
}
class Circle extends Shape{
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	@Override
	double area() {
		return 3.14*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + " area="+area()+" ]";
	}	
}
class Cylinder extends Circle{
	int height;
	Cylinder(int radius, int height) {
		super(radius);
		this.height=height;
	}
	@Override
	double area() {
		return 3.14*radius*radius*height/3;
	}
	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", area()=" + area() + "]";
	}	
}

class Square extends Shape{
	int side;
	Square(int side){
		this.side=side;
	}
	@Override
	double area() {
		return side*side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + ", area()=" + area() + "]";
	}
}
class Rectangle extends Square{
	int side2;
	Rectangle(int side, int side2) {
		super(side);
		this.side2 = side2;
	}
	@Override
	double area(){
		return side*side2;
	}
	@Override
	public String toString() {
		return "Rectangle [side2=" + side2 + ", area()=" + area() + "]";
	}
	
}
public class ShapeDemo {

	public static void main(String[] args) {
		Shape[] shape=new Shape[4];
		shape[0] = new Circle(10);
		shape[1] = new Cylinder(10, 30);
		shape[2] = new Square(2);
		shape[3] = new Rectangle(2, 5);
		
		for(Shape s:shape) {
			System.out.println(s);
		}
	}

}
