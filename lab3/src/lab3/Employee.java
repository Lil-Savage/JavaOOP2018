package lab3;

public class Employee extends Person{
	private double salary;
	private int year;
	private String insuranceNumber;
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, double salary, int year, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public boolean equals(Employee p) {
		return (p.getName().equals(getName())) && (p.getSalary() == salary) && (p.getYear() == year) && (p.getInsuranceNumber().equals(insuranceNumber));
	}
	
	public String toString() {
		return super.toString() + "	Salary: " + salary + "	Year: " + year + "	Insurance Number: " + insuranceNumber;
	}
}
