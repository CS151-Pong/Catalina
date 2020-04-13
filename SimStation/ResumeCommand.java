/* Created by Catalina 4/4/2020
 * 
 * 
 * 
 * 
 */

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
		Simulation sim = (Simulation)model;
		sim.resume();
	}

}
