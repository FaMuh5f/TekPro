package Kasusrestaurant;

public class Menu {
	private final int menuID; // Nomor identitas makanan di menu
	private String menu; // Nama makanan di menu
	private double price; // Harga makanan di menu
	private int stock; // Stok makanan di menu
	
	public Menu(String name, double cost, int st, int id){
		menu = name;
		price = cost;
		stock = st;
		menuID = id;
	}
	
	// Mengambil nama makanan di menu
	public String getMenu(){
		return menu;
	}
	
	// Mengambil harga makanan di menu
	public double getPrice(){
		return price;
	}
	
	// Mengambil stok makanan di menu
	public int getStock(){
		return stock;
	}
	
	// Mengambil nomor identitas makanan di menu
	public int getId(){
		return menuID;
	}
	
	// Pengubahan data stok makanan
	public void setStock(int i){
		stock += i;
	}
}
