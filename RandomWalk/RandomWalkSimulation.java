/* Created by Catalina 4/10/2020
 * 
 * 
 * 
 * 
 */
package RandomWalk;

import SimStation.Simulation;
import SimStation.SimPanel;

public class RandomWalkSimulation extends Simulation{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3753899302397629515L;

	@Override
	public void populate()
	{
		RandomWalk drunk;
		for (int i = 0; i<50; i++)
		{
			drunk = new RandomWalk("Drunk #" + i);
			this.addAgent(drunk);
		}
	}
	
	public static void main(String[] args) {
		RandomWalkFactory factory = new RandomWalkFactory();
		SimPanel panel = new SimPanel(factory);
		panel.display();
	}
}
