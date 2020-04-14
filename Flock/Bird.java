/* Created by Andrew 4/12
 * 
 * 
 * 
 */
package Flock;

import java.util.Random;
import SimStation.*;


public class Bird extends Agent{
	private int speed;
	private Bird a;
	
	private Random random = new Random();
	private Simulation s;
	
	public Bird(String name) {
		super(name);
		this.setRandomHeading();
		speed = random.nextInt(10)+1;
	}

	@Override
	public void update() {
		s = this.getSim();
		
		a = (Bird)s.getNeighbor(this, 10);
		copy(a);
	}
	public void copy(Bird b) {
		setHeading(b.getHeading());
		speed = b.getSpeed();
		move(speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
