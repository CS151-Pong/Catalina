package SimCustomizations;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import SimStation.Agent;
import SimStation.Simulation;
import SimStation.simView;
import mvc.Model;



public class PlagueView extends simView implements ActionListener
{

	private Timer timer = new Timer(1000, this);
	private PlagueSimulation sim = new PlagueSimulation();
	private Plague plague;
	
	public PlagueView(Model model) {
		super(model);
		setSize(Simulation.WORLD_SIZE, Simulation.WORLD_SIZE);
		sim = (PlagueSimulation)model;
		sim.populate();
		timer.start();
		
	}
	
	
	public void paintComponent(Graphics gc) 
	{
		Color oldColor = gc.getColor();
		gc.setColor(Color.RED); 	// fills the circle to a new color then sets it back
		for (Agent a : sim.getAgents())
		{
			plague = (Plague)a;
			if(plague.isInfected())
				gc.setColor(Color.RED);
			else
				gc.setColor(Color.GREEN);
			
			gc.fillOval(a.getX(), a.getY(), 5, 5);
		}
		
		gc.setColor(oldColor);

	}
	

}
