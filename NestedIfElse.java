package basicprogram;

public class NestedIfElse {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		
		if (a<b)
			
		{
			
			if(b<c)
			{
				System.out.println("Execute Block 2");
			}
			else
			{
				System.out.println("Execute Block 3 ");
			}
		}
		else
		{
			System.out.println("Execute Block 4");
		}

	}

}
