import java.awt.Rectangle;

public class Square extends Shape{

	private double height;
	private double width;

	Square(double x, double y, Rectangle boundingBox, double height, double width) {
		super(x, y, boundingBox);
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return height*width;
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
	
}
