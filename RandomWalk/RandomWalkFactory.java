/* Created by Allan 4/6/2020
 * Edited by Catalina 4/10 changed makeModel to return RandomWalkSimulation and extends to SimStationFactory
 * 
 * 
 * 
 */


package RandomWalk;

import SimStation.SimStationFactory;
import mvc.Model;

public class RandomWalkFactory extends SimStationFactory {
	
	public RandomWalkFactory()
	{
		super();
	}
	
	public String getTitle() { return "RandomWalk"; }
	
	public Model makeModel() {
		return new RandomWalkSimulation();
	}
}
