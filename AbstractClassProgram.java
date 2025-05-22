package basicprogram;


abstract class LogicClass1 // abstract class 
 {
	abstract void login();                // abstract method
	abstract void registration();         // abstract method
	 
 }

public class AbstractClassProgram extends LogicClass1

{

	public static void main(String[] args) 
	{
		
		AbstractClassProgram ab=new AbstractClassProgram();    // created object to call abstract class
		ab.login();
		ab.registration();
		
	}


	void login()                                          // abstract method implementation
	{
		System.out.println("Real logic 1");
		
	}

	
	void registration() 
	{
		
		System.out.println("Real logic 2");
	}

}
