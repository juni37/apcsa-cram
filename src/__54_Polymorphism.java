package fin;

public class __54_Polymorphism {

	public static void main(String[] args) {

		// Rules for Polymorphism
		// 1. Variable types and object types can be different.
		// 2. Parents can point to child & grandchildren, but NOT ( child to parent, child to child, unrelated etc )
		// 3. Parent type references to child type objects are limited to parent's views 
		//      i.e. parent type references cannot use methods unique to child type objects.
		// 4. this. refers to the current object's methods, wherever it was called.

		// 2. 
		C c = new C();
		B b = new B();

		
		// 3. 

		
		// 4. 
		// B or C? 
		c.m1();
		
		// can you get A?
//		c.m1();

		
	}
	
	public static class A {
		public void m1() {
			m2();
		}
		public void m2() {
			System.out.println("A");
		}
	}
	
	public static class B extends A{
		public void m1() {
			m2();
		}
		public void m2() {
			System.out.println("B");
		}
	}
	
	public static class C extends B{
		public void m1() {
			m2();
		}
		public void m2() {
			System.out.println("C");
		}
		public void m3() {
			System.out.println("C 2");
		}
	}
	

	
	
}
