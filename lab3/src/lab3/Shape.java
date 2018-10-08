package lab3;

public abstract class Shape {
	private double length;
	private double height;
	private double width;
	private final double Pi = 3.1415926535897932;
	
	public Shape(double l) {
		length = l;
	}
	
	public Shape(double l, double h) {
		length = l;
		height = h;
	}
	
	public Shape(double l, double h, double w) {
		length = l;
		height = h;
		width = w;
	}

	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getPi() {
		return Pi;
	}

	public double volume() {
		return length * height * width;
	}
	
	public double surfaceArea() {
		return 2 * length * height + 2 * length * width + 2 * width * height;
	}
}
