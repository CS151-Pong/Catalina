package SimStation;

import mvc.Model;

//import MVC.Model;

public class RandomWalkSimulation extends SimStationFactory {
public RandomWalkSimulation(){
	super();
}
public Model makeModel() {
	return new Drunk("drunk");
}
}
