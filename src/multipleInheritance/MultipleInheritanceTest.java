package multipleInheritance;

public class MultipleInheritanceTest implements Test1,Test2,Test3 {
	
	public void test1() {
		System.out.println("Implementing test1");
 }
	public void test2() {
		System.out.println("Implementing test2");
 }
	public void test3() {
		System.out.println("Implementing test3");
 }
	public static void main(String[] args) {
		MultipleInheritanceTest m  = new MultipleInheritanceTest();
		m.test1();
		m.test2();
		m.test3();
	}

}
