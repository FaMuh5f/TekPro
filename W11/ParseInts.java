// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the integers in the line.
//
// ****************************************************************

import java.util.Scanner;

public class ParseInts{
	public static void main(String[] args){
		int val, sum=0;
		
		Scanner scan = new Scanner(System.in);
		
		String line;
		System.out.println("Masukkan kalimat: ");
		Scanner scanLine = new Scanner(scan.nextLine());
		
		// try and catch
		while (scanLine.hasNext()){
			try{
				val = Integer.parseInt(scanLine.next());
				sum += val;
			}catch (NumberFormatException e){
				
			}
		}
		System.out.println("Total integer pada kalimat adalah " + sum);
	}
}