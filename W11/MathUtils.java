// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************

public class MathUtils {
	public static int factorial(int n) throws IllegalArgumentException{
		//jika angka negatif
		if(n<0){
			throw new IllegalArgumentException("Faktorial untuk bilangan negatif tak terdefinisi");
		}
		//input >16
		if(n>16){
			throw new IllegalArgumentException("Arithmatetic Overflow");
		}
		int fac = 1;
		for (int i = n; i>0; i--)
			fac *= i;
		return fac;
	}
}