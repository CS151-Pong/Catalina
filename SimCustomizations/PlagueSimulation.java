package SimCustomizations;

import java.awt.Frame;

import javax.swing.JOptionPane;

import SimStation.*;

public class PlagueSimulation extends Simulation
{
	public void populate()
	{
		Plague p;
		for (int i = 0; i<50; i++)
		{
			p = new Plague("Plague #" + i);
			this.addAgent(p);
		}
	}
	
	public String percentInfected()
	{
		int infected = 0;
		Plague plague;
		for (Agent a : this.getAgents())
		{
			plague = (Plague)a;
			if (plague.isInfected())
				infected++;
		}
		
		return "" + infected/this.getAgents().size();
		
	}
	
	@Override
	public void getStats()
    {
    	String stats = "#agents = " + agent.size() + "\n clock = " + this.getClock() + "\n % infected = " + percentInfected();
    	JOptionPane.showMessageDialog(
                new Frame(),
                stats);
    }
	
	
	
	public static void main(String[] args) {
		PlagueFactory factory = new PlagueFactory();
		PlaguePanel panel = new PlaguePanel(factory);
		panel.display();
	}
	
}
