import java.awt.Rectangle;

public abstract class Shape {

	private double x;
	private double y;
	private Rectangle boundingBox;
	
	Shape(double x, double y, Rectangle boundingBox) {
		this.x = x;
		this.y = y;
		this.boundingBox = boundingBox;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Rectangle getBoundingBox() {
		return boundingBox;
	}
	abstract public double getArea();
	
}
