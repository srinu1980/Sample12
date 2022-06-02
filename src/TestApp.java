
public class TestApp {

	public static void main(String[] args) {

		//object creation
		Calculation c=new Calculation();
		
		
		//calling addition method
		
		int addResult=c.addition(10, 10);
		System.out.println("Addition Result ::"+addResult);
		
		
		//calling subtraction method
		
		int subResult=c.subtraction(20, 5);
		System.out.println("Subtraction Result ::"+subResult);
				
		//calling multiplication method
		
		int mulResult=c.multiplication(10, 10);
		System.out.println("Multiplication Result ::"+mulResult);
		
		
		//calling Division method
		
		int divResult=c.division(20, 5);
		System.out.println("Division Result ::"+divResult);
		
		
		
	}

}
