package lab3;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	
	public Cat() {
		super();
	}

	public void meow() {
		System.out.println("Meow");
	}
	
	public void eat() {
		System.out.println("Eating.....(Cat)");
	}
	
}
