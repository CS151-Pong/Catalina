package SimStation;

import mvc.*;

public interface SimFactory extends AppFactory{

	public abstract View getView(Model m);

}
