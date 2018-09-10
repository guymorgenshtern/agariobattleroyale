import java.awt.Rectangle;

public class Player extends Circle implements Scalable, Moveable{

	Player(double x, double y, Rectangle boundingBox, double radius) {
		super(x, y, boundingBox, radius);
	}

	@Override
	public void grow() {
		this.setRadius(this.getRadius() + 10);
	}

	@Override
	public void shrink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUp() {
		this.setY(this.getY() - 0.1);
	}

	@Override
	public void moveDown() {
		this.setY(this.getY() + 0.1);		
	}

	@Override
	public void moveLeft() {
		this.setX(this.getX() - 0.1);		
	}

	@Override
	public void moveRight() {
		this.setX(this.getX() + 0.1);
	}

}
