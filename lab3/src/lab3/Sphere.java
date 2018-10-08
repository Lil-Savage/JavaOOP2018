package lab3;

public class Sphere extends Shape {
	public Sphere(double r) {
		super(r);
	}
	
	public double volume() {
		return 4 / 3 * getPi() * getLength() * getLength() * getLength();
	}
	
	public double surfaceArea() {
		return 4 * getPi() * getLength() * getLength();
	}
}
