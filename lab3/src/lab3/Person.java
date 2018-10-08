package lab3;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Person p) {
		return p.getName().equals(name);
	}
	
	public String toString() {
		return "Name: " + name;
	}
}
