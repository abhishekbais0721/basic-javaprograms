package basicprogram;

public class AssertProgram {

	public static void main(String[] args) {
		
		System.out.println("One");
		System.out.println("Two");
		System.out.println("Three");
		
		assert 2==1 : "Sorry but the condition is not correct"; //
		assert 9<1 : "Sorry but the condition is not correct";
		
		System.out.println("Four");
		System.out.println("Five");

	}

}
