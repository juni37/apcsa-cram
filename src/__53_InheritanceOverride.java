package fin;

public class __53_InheritanceOverride {

	public static void main(String[] args) {

		// Rules for overriding
		// 1. Overriding : redefining an inherited method (must have same signature)
		// 2. Signature : method name, arguments( # of, order, type. NOT var name )
		// 3. super. : overridden methods are still accessible through super. 
		// 4. this. : current level methods are this.methodname(), but this. is optional
		// 5. private data : Respect Parents' privacy!!

		C c = new C();
		
		c.sm1();

		
	}
	
	
	public static class B {
		public void m1() {
			System.out.println("B m1");
		}
	}
	
	public static class C extends B{
		public void m1() {
			System.out.println("C m1");
		}
		public void sm1() {
			super.m1();
			this.m1();
		}
	}
	

	
	
}
