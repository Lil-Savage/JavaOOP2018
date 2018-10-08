package lab3;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal() {
		name = "Default Name";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void eat() {
		System.out.println("Eating.....");
	}
}
