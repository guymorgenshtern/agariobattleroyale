
public class Player extends Circle implements Scalable, Moveable{
	
	public static double playerSpeed = 0.5;

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
		
		if(this.getY() < 0) {
			this.setY(0);
		}
	}

	@Override
	public void moveDown() {
		this.setY(this.getY() + playerSpeed);
		this.getBoundingBox().setLocation((int) this.getX(), (int) this.getY());
		
		if(this.getY() > (600-this.getRadius()*2)) {
			this.setY(600-this.getRadius()*2);
		}
	}

	@Override
	public void moveLeft() {
		this.setX(this.getX() - playerSpeed);
		this.getBoundingBox().setLocation((int) this.getX(), (int) this.getY());
		
		if(this.getX() < 0) {
			this.setX(0);
		}

	}

	@Override
	public void moveRight() {
		this.setX(this.getX() + playerSpeed);
		this.getBoundingBox().setLocation((int) this.getX(), (int) this.getY());
		
		if(this.getX() > (800-this.getRadius())) {
			this.setX(800-this.getRadius());
		}

	}

}
