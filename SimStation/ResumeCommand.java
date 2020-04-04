package SimStation;

import mvc.Command;
import mvc.Model;

public class ResumeCommand extends Command
{
	public ResumeCommand (Model model) {
		super(model);
	}
	
	public void execute()
	{
		Agent agent = (Agent)model;
		agent.resume();
	}

}
