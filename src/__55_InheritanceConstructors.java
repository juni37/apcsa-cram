package fin;

public class __55_InheritanceConstructors {

	public static void main(String[] args) {

		// Rules for Constructors in Inheritance
		// 1. Constructors are NOT inherited
		// 2. super() : calls superclass's constructor
		// 3. If no contructor is written for child class, 
		// 	==> default constructor is added automatically 
		// 4. If no calls to superclass's constructor in child class constructor, 
		// 	==> implicit call to super() is added automatically
		// 5. calling super(n) -or any overloaded constructor- overrides the implicit super();
		// 6. calling super(); MUST occur at the first line.
		
		// what would be printed as a result of the following instruction?		
		new C();

		// what would be printed as a result of the following instruction?		
//		new C(10);
		
	}
	
	public static class B {
		public B() {
			System.out.println("B default");
		}
		public B(int n) {
			System.out.println("B "+n);
		}
	}
	
	public static class C extends B {
		// start with an empty class
		public C() {
			// 2. super() is implicit here. adding the following makes no difference
			// super();
			System.out.println("C default");
		}
		public C(int n) {
			// 2. implicit super(); here too...
			// 3. call the overloaded constructor with: super(n); 
			// calling super(n); anywhere supplants implicit super();
			System.out.println("C "+n);
		}
	}
	
}
