// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//
// ****************************************************************

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
		
		//get word from user
		System.out.println("\n Masukkan kata: ");
		String word = scan.nextLine();
		
		//convert to all upper case
		word = word.toUpperCase();
		
		//hitung frekuensi setiap huruf dalam string
		for (int i=0; i < word.length(); i++){
			// try and catch
			try{
				counts[word.charAt(i)-'A']++;
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println(word.charAt(i)+ " bukanlah kata");
			}
		}
				
		//print frequencies
		System.out.println();
		for (int i=0; i < counts.length; i++)
			if (counts [i] != 0)
				System.out.println((char)(i +'A') + ": " + counts[i]);
	}
}