package Prisoner;

import java.awt.Frame;

import javax.swing.JOptionPane;

import SimStation.*;


public class PrisonerSimulation extends Simulation{
	public void populate()
	{
		Prisoner prisoner;
		for (int i = 0; i<40; i++)
		{
			prisoner = new Prisoner("Prisoner #" + i);
			this.addAgent(prisoner);
			if(i>=0&&i<10) {
				prisoner.setCooperate(new AlwaysCooperate(prisoner));
			}
			else if(i>=10&&i<20) {
				prisoner.setCooperate(new AlwaysCheat(prisoner));
			}
			else if(i>=20&&i<30) {
				prisoner.setCooperate(new RandomlyCooperate(prisoner));
			}
			else if(i>=30&&i<40) {
				prisoner.setCooperate(new LastOpponentCooperate(prisoner));
			}
		}
	}
	
	public void getStats()
    {
		int fitnessCheaters=0;
		int fitnessCooperators=0;
		int fitnessReciproicator=0;
		int fitnessRandom=0;

		for(Agent a: this.getAgents()) {
			Prisoner prisoner=(Prisoner)a;
			Cooperate strat=prisoner.getCooperate();
			int cheaters=0;
			int cooperators=0;
			int reciproicator=0;
			int random=0;
			if(strat instanceof AlwaysCooperate) {
				cooperators++;
				fitnessCooperators=(fitnessCooperators+prisoner.getFitness())/cooperators;
				
			}
			if(strat instanceof AlwaysCheat) {
				cheaters++;
				fitnessCheaters=(fitnessCheaters+prisoner.getFitness())/cheaters;
				
			}
			if(strat instanceof LastOpponentCooperate) {
				reciproicator++;
				fitnessReciproicator=(fitnessReciproicator+prisoner.getFitness())/reciproicator;
				
			}
			if(strat instanceof RandomlyCooperate) {
				random++;
				fitnessRandom=(fitnessRandom+prisoner.getFitness())/random;
			}
			
		}
	  	String stats = "#agents = " + getAgents().size() 
	  			+ "\n clock = " + getClock()
	  			+ "\n Cooperator's average = " + fitnessCooperators
	  			+ "\n Cheater's average = " + fitnessCheaters
	  			+ "\n Reciproicator's average = " + fitnessReciproicator 
	  			+ "\n Random's average = "+ fitnessRandom;
    	JOptionPane.showMessageDialog(
                new Frame(),
                stats);
    }
	
	public static void main(String[] args) {
		PrisonerFactory factory = new PrisonerFactory();
		SimPanel panel = new SimPanel(factory);
		panel.display();
	}

}
