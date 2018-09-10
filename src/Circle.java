/*
 * @author Yash Arora
 */


public class Circle extends Shape{
	
	private double radius;

	Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
		this.getBoundingBox().setBounds((int) x, (int) y, (int) radius*2, (int) radius*2);

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
