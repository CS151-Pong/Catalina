/* Created by Andrew 4/12
 * 
 * 
 * 
 */
package SimCustomizations;

import SimStation.*;
import mvc.Model;

public class FlockFactory extends SimStationFactory {

	public FlockFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model makeModel() {
		return new FlockSimulation();
	}
}
