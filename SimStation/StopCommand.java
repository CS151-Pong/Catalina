package SimStation;

import mvc.Command;
import mvc.Model;

public class StopCommand extends Command
{
	public StopCommand (Model model) {
		super(model);
	}
	
	public void execute()
	{
		Agent agent = (Agent)model;
		agent.stop();
	}

}
