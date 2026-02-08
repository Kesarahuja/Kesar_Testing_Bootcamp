package methodOverriding;

public class ChildClass {
	public void display() {
		System.out.println("This is Parent Class display method - child");
	}
	
	public void show() {
		System.out.println("This is Parent Class show method - child");
	}
	
	public static void main(String[] args) {
		
		// Child Class Reference and Child Class Object
		ChildClass obj1 = new ChildClass();
		obj1.display();
		obj1.show();
		obj1.display();
		
		// Parent Reference and Child Object
		ParentClass obj2 = new ParentClass();
		obj2.display();
		obj2.show();
		
		// Parent Reference and Child Object 
		ParentClass obj3 = new ChildClass();
		obj3.display();
		obj3.show();
		obj3.disp();
		

	}

}
