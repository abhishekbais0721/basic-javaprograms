package basicprogram;

public class OrWithNotOperator {

	public static void main(String[] args) {
		int a = 10;
		int b=20;
		
		if(!(a<b) || (b==a))
		{
			System.out.println("Exectue block 1");
		}
		else
		{
			System.out.println("Else Block");
		}

	}

}
