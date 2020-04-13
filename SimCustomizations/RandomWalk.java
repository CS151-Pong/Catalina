/* Created by Allan 4/4/2020
 * Edited by Catalina 4/10 Changed randomHeading to setRandomHeading and random number generations
 * 
 * 
 * 
 */
package SimCustomizations;

import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;

import SimStation.Agent;
import utils.*;

public class RandomWalk extends Agent
{
	private int steps;
	private Random random = new Random();

	public RandomWalk(String name) {
		super(name);
		steps= random.nextInt(10)+1;
	}
	
	public void update() 
	{
		//ThreadLocalRandom.current().nextInt(min, max + 1);
		this.setRandomHeading();
		steps = random.nextInt(9)+1;
		move(steps);
		changed();
	}
	
	public int getSteps() {
		return steps;
	}
}
