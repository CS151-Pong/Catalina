package SimStation;

import mvc.Command;
import mvc.Model;

public class StatsCommand extends Command
{
	public StatsCommand (Model model) {
		super(model);
	}
	
	public void execute()
	{
		Simulation sim = (Simulation)model;
		sim.getStats();
	}

}
