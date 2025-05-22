package basicprogram;

import java.util.Scanner;

public class NewScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int a = s1.nextInt();
		System.out.println("Enter Number 2");
		int b = s1.nextInt();
		int sum=a+b;
		System.out.println("The sum of 2 Number is ");
		System.out.println(sum);
		
		
	
	}

}
