package basicprogram;

class ParentCl

{
	static void login()
	{
		System.out.println("please login");
	}
	
}

public class InheritanceProgram extends ParentCl

{
	 static void logout()
	{
		 System.out.println("please logout");
	}

	public static void main(String[] args) {
		
		//InheritanceProgram l1=new InheritanceProgram(); for non static 
		
		// l1.logout(); for non static 
		// l1.login(); for non static 
		
		logout();
		login();
	
		

	}

}
