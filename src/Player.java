
public class Player extends Circle implements Scalable, Moveable{
	
	public static double playerSpeed = 0.3;

	Player(double x, double y, double radius) {
		super(x, y, radius);
		this.getBoundingBox().setBounds((int) x, (int) y, (int) radius, (int) radius);
	}

	@Override
	public void grow() {
		this.setRadius(this.getRadius() + 10);
		this.getBoundingBox().setSize((int) this.getRadius(), (int) this.getRadius()); 
	}

	@Override
	public void shrink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUp() {
		this.setY(this.getY() - playerSpeed);
		this.getBoundingBox().setLocation((int) this.getX(), (int) this.getY());
	}

	@Override
	public void moveDown() {
		this.setY(this.getY() + playerSpeed);
		this.getBoundingBox().setLocation((int) this.getX(), (int) this.getY());
	}

	@Override
	public void moveLeft() {
		this.setX(this.getX() - playerSpeed);
		this.getBoundingBox().setLocation((int) this.getX(), (int) this.getY());
	}

	@Override
	public void moveRight() {
		this.setX(this.getX() + playerSpeed);
		this.getBoundingBox().setLocation((int) this.getX(), (int) this.getY());
	}

}
