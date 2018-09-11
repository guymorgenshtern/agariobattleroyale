
public class Enemy extends Square implements Moveable{
	
	private double direction;


	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	Enemy(double x, double y, double height, double width) {
		super(x, y, height, width);
		this.getBoundingBox().setBounds((int) x, (int) y, (int) width, (int) height);

	}

	@Override
	public void moveUp() {
   		this.setY(this.getY() - 0.3);
   		this.getBoundingBox().setLocation((int)this.getX(), (int) this.getY());
   		
		if(this.getY() < 0) {
			this.setY(0);
		}
	}

	@Override
	public void moveDown() {
   		this.setY(this.getY() + 0.3);
   		this.getBoundingBox().setLocation((int)this.getX(), (int) this.getY());
   		
		if(this.getY() > (600-this.getHeight())) {
			this.setY(600-this.getHeight());
		}

	}

	@Override
	public void moveLeft() {
   		this.setX(this.getX() - 0.3);
   		this.getBoundingBox().setLocation((int)this.getX(), (int) this.getY());
   		
		if(this.getX() < 0) {
			this.setX(0);
		}

	}

	@Override
	public void moveRight() {
   		this.setX(this.getX() + 0.3);
   		this.getBoundingBox().setLocation((int)this.getX(), (int) this.getY());

		if(this.getX() > (800-this.getWidth())) {
			this.setX(800-this.getWidth());
		}
   		
	}
	
	

}
