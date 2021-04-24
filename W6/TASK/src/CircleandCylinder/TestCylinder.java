package CircleandCylinder;

public class TestCylinder {
	public static void main (String[] args){
		Cylinder c1 = new Cylinder();
		System.out.println("cylinder:"
				+" radius="+c1.getRadius()
				+" height="+ c1.getHeight()
				+" base area="+c1.getArea()
				+" volume="+c1.getVolume());
				
		Cylinder c2 = new Cylinder(10,0);
		System.out.println("Cylinder:"
				+" Radius="+c2.getRadius()
				+" Height="+c2.getHeight()
				+" base area="+c2.getArea()
				+" Volume="+c2.getVolume());
		
		Cylinder c3 = new Cylinder(2.0,10.0);
		System.out.println("Cylinder:"
				+" Radius="+c3.getRadius()
				+" Height="+c3.getHeight()
				+" base area="+c3.getArea()
				+" Volume="+c3.getVolume());
	}
}
