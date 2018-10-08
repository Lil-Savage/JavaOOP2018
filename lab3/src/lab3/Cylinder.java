package lab3;

public class Cylinder extends Shape{
	public Cylinder(double r, double h) {
		super(r, h);
	}
	
	public double volume() {
		return getPi() * getLength() * getLength() * getHeight();
	}
	
	public double surfaceArea() {
		return getPi() * getLength() * getLength() + 2 * getPi() * getLength() * getHeight();
	}
}
