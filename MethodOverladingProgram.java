package basicprogram;

public class MethodOverladingProgram {
	
		static void login(int a)
		{
			System.out.println("Login 1 ");
		}
		static void login(String a)
		{
			System.out.println("Login 2 ");
		}
		static void login(char b)
		{
			System.out.println("Login 3 ");
		}

	public static void main(String[] args) {
	
		login(5);
		login("a");
		login('b');		
	}

}
