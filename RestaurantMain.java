package Kasusrestaurant;

import java.util.*;

public class RestaurantMain {
	private static int no;
	private static int quantity;
	private static String status;
	private static int total=0;
	
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Restaurant menu = new Restaurant();
	
	for (;;){
		// Print Menu
		System.out.println("\t\tMenu"); 
		menu.tampilMenuMakanan(); 
		
		// print pesanan yang ingin di pesan
		System.out.printf("\nApa yang ingin dipesan?"); 
		
		// print Id pesanan
		System.out.printf("\nID : ");
		no = in.nextInt();
		
		// print banyak pesanan
		System.out.printf("\nSebanyak : "); 
		quantity = in.nextInt(); 
		
		menu.pesanMakanan(no, quantity); 
		
		System.out.println();
		
		// print menu setelah pengurangan dari pesanan pertama
		System.out.println("Menu sekarang:");
		
		menu.tampilMenuMakanan();
		
		// print konfirmasi apakah mau lanjut pesanan lagi atau tidak
		System.out.printf("\nPesan lagi? (Y/T) : ");
		status = in.next();
		
		if(status.equalsIgnoreCase("T")){
			break;
		}
	}
	in.close();
	
	}
}
