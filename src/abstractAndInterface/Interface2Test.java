package abstractAndInterface;

public class Interface2Test extends Interface1Test { // We can also create another interface
	public static void main(String[] args) {
	Interface1Test interface1Test = new Interface1Test(); // Object Creation
	interface1Test.test1(); // Calling Abstract methods 
	interface1Test.test2();
}
}