/* Created by Allan 4/4/2020
 * Edited by Catalina 4/10 Changed randomHeading to setRandomHeading and random number generations
 * 
 * 
 * 
 */
package RandomWalk;

import java.util.Random;
import SimStation.Agent;

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
		this.setRandomHeading();
		steps = random.nextInt(10)+1;
		move(steps);

	}
	
	public int getSteps() {
		return steps;
	}
}
