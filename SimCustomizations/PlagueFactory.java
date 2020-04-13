package SimCustomizations;

import SimStation.SimStationFactory;
import mvc.Model;

public class PlagueFactory extends SimStationFactory {

	public PlagueFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model makeModel() {
		return new PlagueSimulation();
	}
}