/* Created by Andrew 4/12
 * 
 * 
 * 
 */
package Flock;

import SimStation.*;
import mvc.Model;

public class FlockFactory extends SimStationFactory {

	public FlockFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() { return "Flock"; }
	
	public Model makeModel() {
		return new FlockSimulation();
	}
}
