package basicprogram;

public class LocalInstanceGlobalVariableConcept {
	
	static int b=20; // Static variable  or Global Variable
	
	int c = 30; // Instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalInstanceGlobalVariableConcept lig=new LocalInstanceGlobalVariableConcept(); // to access instance variable.
		
		int a = 10; // Local Variable
		System.out.println(a);
		
		
		System.out.println(LocalInstanceGlobalVariableConcept.b);
		System.out.println(lig.c);
		
	}

}
