/* Created by Allan 4/6/2020
 * Edited by Catalina 4/10 Made global Simulation, rewrote both constructor and paintComponent
 * 
 * 
 * 
 */

package SimStation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import mvc.*;

public class SimView extends View implements ActionListener{

	/**
	 * 
	 */
	private Timer timer = new Timer(100, this);
	private Simulation sim = new Simulation();
	private static final long serialVersionUID = 4890019208920195218L;
	
	
	public SimView(Model model) {
		super(model);
		setSize(Simulation.WORLD_SIZE, Simulation.WORLD_SIZE);
		sim = (Simulation)model;
		sim.populate();
		timer.start();
		
	}
	
	public void actionPerformed(ActionEvent e) {
	    new Thread() {
	        public void run() {
	        	if(e.getSource()==timer){
	      	      repaint();// this will call at every 1 second	
	      	    }
	        }
	    }.start();
	}
	
	public void paintComponent(Graphics gc) 
	{
		
		Color oldColor = gc.getColor();
		gc.setColor(Color.RED); 	// fills the circle to a new color then sets it back
		for (Agent a : sim.getAgents())
		{
			gc.fillOval(a.getX(), a.getY(), 5, 5);
		}
		
		gc.setColor(oldColor);

	}
}
