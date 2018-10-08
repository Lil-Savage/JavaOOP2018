package lab3;

public class Cube extends Shape{
	public Cube(double l) {
		super(l);
	}
	
	public double volume() {
		return getLength() * getLength() * getLength();
	}
	
	public double surfaceArea() {
		return getLength() * getLength() * 6;
	}
}
