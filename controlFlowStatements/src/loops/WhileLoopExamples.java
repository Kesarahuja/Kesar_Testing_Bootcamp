package loops;

public class WhileLoopExamples {

	public static void main(String[] args) {
	int count = 0;
		
		while(count < 5) {
			System.out.println(count);
			count++;
		}	// 0 to 4 output printed
		
		count = 5;
		while(count < 5) {
			System.out.println(count);
			count++;
		}	// No output is printed

	}

}
