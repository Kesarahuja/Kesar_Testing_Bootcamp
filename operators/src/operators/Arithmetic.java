package operators;

public class Arithmetic {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 20;
		int d = 0;
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
	
		int var1 = 5, var2 = 10, var3 = 5;
		
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);
		
		// Comparing var1 and var2 and printing corresponding boolean value
		System.out.println("var1 == var2: " + (var1 == var2));
		
		// Comparing var1 and var3 and printing corresponding boolean value
		System.out.println("var1 == var3: " + (var1 == var3));
		
		//using logical AND to verify two constraints
		if ((a<b) && (b==c)) {
			d = a + b + c;
			System.out.println("The sum is " + d);
		}
		else 
			System.out.println("False Condition");

	}

}
