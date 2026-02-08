package javaCaseStudy;

public class CaseStudy {

	public static void main(String[] args) {
		// Assignment 1-  Use Switch Statement to print Current Day and Month.
		
		String Day = "Wednesday";
		String Month = "January";
		
		switch(Day) {
		case ("Monday"):
			System.out.println("Today is Monday");
			break;
		case ("Tuesday"):
			System.out.println("Today is Tuesday");
			break;
		case ("Wednesday"):
			System.out.println("Today is Wednesday");
			break;
		case ("Thursday"):
			System.out.println("Today is Thursday");
			break;
		case ("Friday"):
			System.out.println("Today is Friday");
			break;
		case ("Saturday"):
			System.out.println("Today is Saturday");
			break;
		case ("Sunday"):
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Not A Day");
			break;
		}

		switch(Month) {
		case ("January"):
			System.out.println("Month is January");
			break;
		case ("February"):
			System.out.println("Month is February");
			break;
		case ("March"):
			System.out.println("Month is March");
			break;
		case ("April"):
			System.out.println("Month is April");
			break;
		case ("May"):
			System.out.println("Month is May");
			break;
		case ("June"):
			System.out.println("Month is June");
			break;
		case ("July"):
			System.out.println("Month is July");
			break;
		case ("August"):
			System.out.println("Month is August");
			break;
		case ("September"):
			System.out.println("Month is September");
			break;
		case ("October"):
			System.out.println("Month is October");
			break;
		case ("November"):
			System.out.println("Month is November");
			break;
		case ("December"):
			System.out.println("Month is December");
			break;
		default:
			System.out.println("Not A Day");
			break;
		}

	}

}
