package basicprogram;
public class MathClassProgram {

	public static void main(String[] args) 
	{

	System.out.println(Math.addExact(45, 90));
	System.out.println(Math.subtractExact(45, 15));
	System.out.println(Math.multiplyExact(150, 6));
	System.out.println(Math.min(45, 98));
	System.out.println(Math.min(9.6, 4.55));
	System.out.println(Math.abs(-99));
	System.out.println(Math.multiplyExact(5, 5));
	
	for(int i=1;i<=10;i++)
	{       
	System.out.println(Math.random());
	}
	double area=Math.PI*7*7;
	System.out.println(area);
		
	}

}
