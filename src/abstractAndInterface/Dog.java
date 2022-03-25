package abstractAndInterface;

public class Dog extends Animal { //Extending Animal
	
	public void walking() { //Writing body in abstract class
		System.out.println("I can walk");
		
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.walking(); // Executing abstract method
		d.Roaring(); // Executing non-abstract method
		
		
		// We can also create object like
	    Animal d1 = new Dog();
	    d.walking(); 
		d.Roaring();
	}

}
