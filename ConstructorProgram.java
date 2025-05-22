package basicprogram;

public class ConstructorProgram {
	
	
	ConstructorProgram()
	
	{
	
	
		System.out.println("this is my constructor 1");
	}

    ConstructorProgram(int a)
	
	{
    	this();
		System.out.println("this is my constructor 2");
	}
    ConstructorProgram(String a , String b)
	
	{
    	
    	this(5);
		System.out.println("this is my constructor 3");
	}
	public static void main(String[] args) {
		
		
		
		//ConstructorProgram  c1 = new ConstructorProgram(); // first way to create an object.
		//new ConstructorProgram(10);
		new ConstructorProgram("abc", "zyz");
		 
		
		
		
		
		
		
		
		
		

	}

}
