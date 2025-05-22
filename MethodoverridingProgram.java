package basicprogram;
 class ClassParent
{
	 void login()
	{
		System.out.println("Login with email id");
	}
}
public class MethodoverridingProgram extends ClassParent
{
	void login()
	{
		
		System.out.println("Login with Mobile no");
		super.login();//keyword
	}
	public static void main(String[] args) 
	{
		MethodoverridingProgram m1=new MethodoverridingProgram();
		m1.login();
	
		

	}

}
