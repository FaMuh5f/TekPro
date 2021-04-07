package listing4dot4;

public class ParmTest {
	public static void main (String[] args){
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before: percent="+percent);
		tripleValue(percent);
		System.out.println("After: percent=" + percent);
		
		System.out.println("\nTenting tripleSalary:");
		Employee amber = new Employee("Amber", 50000);
		System.out.println("Before: salary="+amber.getSalary());
		tripleSalary(amber);
		System.out.println("After: salary="+ amber.getSalary());
		
		System.out.println("\nTesting swap:");
		Employee a = new Employee("chongyun", 70000);
		Employee b = new Employee("diona", 60000);
		System.out.println("Before: a="+a.getName());
		System.out.println("Before: b="+b.getName());
		swap(a,b);
		System.out.println("After: a="+a.getName());
		System.out.println("After: b="+b. getName());
	}
	
	public static void tripleValue(double x){
		x = 3*x;
		System.out.println("End of method: X="+x);
	}
	
	public static void tripleSalary(Employee x){
		x.raiseSalary(200);
		System.out.println("End of method: salary="+ x.getSalary());
	}
	
	public static void swap (Employee x, Employee y){
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: X="+x.getName());
	}

}

class Employee{
	private String name;
	private double salary;
	
	public Employee(String n, double s){
		name = n;
		salary = s;
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary*byPercent/100;
		salary += raise;
	}
}
