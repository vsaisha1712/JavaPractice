package abstractAndInterface;

public class Interface1Test implements Interface1 {
	
   public void test1() { // Body in Abstract class
	   System.out.println("Implementing test1");
   }
	
	public void test2() {
		System.out.println("Implementing test2");
	}
	
	/*public static void main(String[] args) { // Main method
		Interface1Test interface1Test = new Interface1Test();
		interface1Test.test1(); // Calling Abstract methods 
		interface1Test.test2();
	}*/
}

