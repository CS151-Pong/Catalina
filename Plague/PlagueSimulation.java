/* Created by Catalina 4/12
 * 
 * 
 * 
 */
package Plague;

import java.awt.Frame;
import javax.swing.JOptionPane;

import SimStation.*;

public class PlagueSimulation extends Simulation
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1677099662819555045L;

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
		double infected = 0;
		Plague plague;
		for (Agent a : this.getAgents())
		{
			plague = (Plague)a;
			if (plague.isInfected())
				infected++;
		}
		
		return "" + (infected / this.getAgents().size()) * 100.00;
		
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
