package SuperclassShapeanditsSubclassesCircleRectangleandSquare;

public class testShape {

	public static void main(String[] args) {
		//Shape -> Circle
		Circle c[] = new Circle[3];
		c[0] = new Circle();
		c[1] = new Circle(2.0);
		c[2] = new Circle(3.0, "green", false);
		for(int i=0; i<3; i++) {
			System.out.println((i+1) + ". "+ c[i]);
			System.out.println("Circle : area="+c[i].getArea()+",perimeter="+c[i].getPerimeter());
		}
		
		System.out.println();
		
		//Shape -> Rectangle
		Rectangle r[] = new Rectangle[3];
		r[0] = new Rectangle();
		r[1] = new Rectangle(2, 5);
		r[2] = new Rectangle(1, 3, "Yellow", true);
		for(int i=0; i<3; i++) {
			System.out.println((i+1) + ". " + r[i]);
			System.out.println("Rectangle: Area=" + r[i].getArea() + ",Perimeter="+r[i].getPerimeter());
		}
		
		System.out.println();
		
		//Shape -> Recctangle -> Square
		Square s[] = new Square[3];
		s[0] = new Square();
		s[1] = new Square(3.0);
		s[2] = new Square(2.5, "grey", true);
		for(int i=0; i<3 ; i++) {
			System.out.println((i+1) + ". " + s[i]);
			System.out.println("Square : Area=" + s[i].getArea() + ",Perimeter="+s[i].getPerimeter());
		}
	}
}
