package AnotherTypeofEmployee;

public class Commission extends Hourly {
	private double total_sales;
	private double commission_rate;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comm_rate){
		super (eName, eAddress, ePhone, socSecNumber, rate);
		commission_rate = comm_rate;
	}
	
	public void addSales(double total_sales){
		this.total_sales = total_sales;
	}
	
	public double pay(){
		double payment = super.pay()+(total_sales*commission_rate);
		
		total_sales = 0;
		
		return payment;
	}
	
	public String toString(){
		String result = super.toString();
		
		result+="\n Total Sales: "+total_sales;
		
		return result;
	}
}
