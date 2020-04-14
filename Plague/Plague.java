/* Created by Catalina 4/12/2020
 * 
 * 
 * 
 * 
 */

package Plague;

import java.util.Random;

import SimStation.*;


public class Plague extends Agent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4516170262356193911L;
	private int steps;
	private Random random = new Random();
	private Simulation simulation;
	private Plague plague;
	public static int VIRULENCE = 50; // % chance of infection
	public static int RESISTANCE = 2; // % chance of resisting infection
	private boolean infected = false;
	private int chance; // can be locally created instead
	
	public Plague(String name) {
		super(name);
		this.setRandomHeading();
		steps = random.nextInt(10)+1;
		randomlyStartInfected();
	}

	@Override
	public void update() 
	{
		
		simulation = this.getSim();
		
		plague = (Plague)simulation.getNeighbor(this, 10);
		infect(plague);
		
		this.setRandomHeading();
		steps = random.nextInt(10)+1;
		move(steps);
		
	}
	
	public boolean isInfected()
	{
		return infected;
	}
	
	public void setInfected(boolean b)
	{
		infected = b;
	}
	
	public void randomlyStartInfected()
	{
		chance = random.nextInt(101);
		if(chance > 50)
		{
			this.infected = true;
		}
	}
	
	public void infect(Plague p)
	{
		if(p.isInfected()) // this gets infected
		{
			chance = random.nextInt(101);
			if(chance > 50)
			{
				chance = random.nextInt(101);
				if (chance > RESISTANCE)
					infected = true;
			}
		}
		else if (this.isInfected()) // infect them
		{
			chance = random.nextInt(101);
			if(chance > 50)
			{
				chance = random.nextInt(101);
				if (chance > RESISTANCE)
					p.setInfected(true);
			}
		}
	}
}
