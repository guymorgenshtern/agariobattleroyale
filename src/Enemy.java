
public class Enemy extends Square implements Moveable{

	Enemy(double x, double y, double height, double width) {
		super(x, y, height, width);
		this.getBoundingBox().setBounds((int) x, (int) y, (int) width, (int) height);

	}

	@Override
	public void moveUp() {
   		this.setY(this.getY() - 0.3);
   		this.getBoundingBox().setLocation((int)this.getX(), (int) this.getY());
	}

	@Override
	public void moveDown() {
   		this.setY(this.getY() + 0.3);
   		this.getBoundingBox().setLocation((int)this.getX(), (int) this.getY());

	}

	@Override
	public void moveLeft() {
   		this.setX(this.getX() - 0.3);
   		this.getBoundingBox().setLocation((int)this.getX(), (int) this.getY());

	}

	@Override
	public void moveRight() {
   		this.setX(this.getX() + 0.3);
   		this.getBoundingBox().setLocation((int)this.getX(), (int) this.getY());

	}

}
