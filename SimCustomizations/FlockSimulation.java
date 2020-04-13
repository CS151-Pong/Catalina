package SimCustomizations;

import SimStation.*;



public class FlockSimulation extends Simulation{

	public void populate()
	{
		Bird b;
		for (int i = 0; i<50; i++)
		{
			b = new Bird("Bird #" + i);
			this.addAgent(b);
		}
	}
	
	public static void main(String[] args) {
		FlockFactory factory = new FlockFactory();
		simPanel panel = new simPanel(factory);
		panel.display();
	}
}
