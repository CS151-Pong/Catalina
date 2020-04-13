package SimCustomizations;

import java.util.Random;
import SimStation.*;


public class Bird extends Agent{
	private int steps;
	private int speed;
	private Heading heading; 
	private Bird a;
	
	private Random random = new Random();
	private Simulation s;
	
	public Bird(String name) {
		super(name);
		this.setRandomHeading();
		speed = steps = random.nextInt(10)+1;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		
		s = this.getSim();
		
		a = (Bird)s.getNeighbor(this);
		//a.getHeading();
		copy(a);
		
		
		// TODO Auto-generated method stub
		
	}
	public void copy(Bird b) {
		heading = b.getHeading();
		speed = b.getSpeed();
		move(steps = speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
