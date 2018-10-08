package lab3;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	public Dog() {
		super();
	}
	
	public void bark() {
		System.out.println("AWAW");
	}
	
	public void eat() {
		System.out.println("Eating.....(Dog)");
	}
}
