/* Created by Catalina Lamboglia 4/4/2020
 * 
 * 
 * 
 * 
 */


package SimStation;

import mvc.Model;

//import MVC.Model;

public class RandomWalkFactory extends SimStationFactory {
	public RandomWalkFactory(){
		super();
	}
	public Model makeModel() {
		return new Drunk("drunk");
	}
	

}
