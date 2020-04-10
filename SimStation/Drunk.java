package SimStation;

import java.util.Random;

import utils.*;

public class Drunk extends Agent
{
	private int steps;
	private Random random = new Random();

	public Drunk(String name) {
		super(name);
		steps= random.nextInt(10)+1;
	}
	
	public void update() 
	{
		this.setRandomHeading(random.nextInt(4));
		steps= random.nextInt(9)+1;
		move(steps);
	}
	
	public int getSteps() {
		return steps;
	}
}
