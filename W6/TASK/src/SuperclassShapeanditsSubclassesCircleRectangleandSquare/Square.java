package SuperclassShapeanditsSubclassesCircleRectangleandSquare;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public double getSide() {
		return super.getLength();
	}
	
	public void setWidth(double side) {
		setSide(side);
	}
	
	public void setLength(double side) {
		setSide(side);
	}
	
	public double getArea() {
		return getSide()*getSide();
	}
	
	public double getPerimeter() {
		return 4*getSide();
	}
	
	public String toString() {
		return "A square with side=" + getSide() +  ", which is a subclass of " + super.toString();
	}
}
