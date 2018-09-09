import java.awt.Rectangle;

public class Circle extends Shape{
	
	private double radius;

	Circle(double x, double y, Rectangle boundingBox, double radius) {
		super(x, y, boundingBox);
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
