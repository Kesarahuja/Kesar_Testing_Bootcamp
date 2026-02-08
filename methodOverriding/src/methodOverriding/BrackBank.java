package methodOverriding;

public class BrackBank {
	public void homeLoanRate() {
		System.out.println("BD Bank home loan rate is 9% ");
	}
	
	public static void main(String[] args) {
		BDBankParent obj1 = new BDBankParent();
		obj1.homeLoanRate();
		
		BrackBank obj2 = new BrackBank();
		obj2.homeLoanRate();

	}
}
