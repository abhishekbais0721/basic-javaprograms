package basicprogram;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name");
		String input = s1.next(); //String Value
		System.out.println("Enter your age");
		int a = 		s1.nextInt(); // int
		byte b  = s1.nextByte(); // byte
		float c =s1.nextFloat(); // float
		boolean b1 = s1.nextBoolean(); //boolean
		short w = s1.nextShort(); // short
		double p = s1.nextDouble(); // double
		s1.close();

	
	}

}
