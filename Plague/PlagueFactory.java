/* Created by Andrew 4/12
 * 
 * 
 * 
 */

package Plague;

import SimStation.SimStationFactory;
import mvc.Model;

public class PlagueFactory extends SimStationFactory {

	public PlagueFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() { return "Plague"; }
	
	public Model makeModel() {
		return new PlagueSimulation();
	}
}