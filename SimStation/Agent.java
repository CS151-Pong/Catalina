package SimStation;

import mvc.*;


public abstract class Agent extends Model implements Runnable 
{
	
	private static final long serialVersionUID = 8402972125725120175L;
	private Thread thread;
	protected String name;
	protected Heading heading;
	protected Simulation sim;
	private int x, y;
	private AgentState state;
	private boolean suspend = false;
	private boolean stopped = false;
	private static int WORLD_SIZE = 250;
	//private boolean suspend = false;
	
	public Agent(String name) {
		this.name = name;
		state = AgentState.READY;
		heading = Heading.NORTH; // just set a default
	}
	
	public synchronized String toString() { return name + ".state = " + state; }
	public synchronized int getX() {return x;}
	public synchronized int getY() {return y;}
	
	public synchronized AgentState getState() { return state; }
	
	private boolean isStopped()
	{
		switch (state) // could be shorter
		{
			case STOPPED:
				return true;
			default:
				return false;
		}
		
	}

	private boolean isSuspended()
	{
		switch (state)
		{
			case SUSPENDED:
				return true;
			default:
				return false;
		}
		
	}
	
	public void setHeading(Heading heading)
	{
		this.heading = heading;
	}
	
	public void setSimulation(Simulation sim) // set this in Simlation when Sim adds Agents
	{
		this.sim = sim; // agent.SetSimlation(this); goes within addAgent within Simulation
	}
	
	@Override
	public void run() {
		thread = Thread.currentThread(); // catch my thread
		while(!isStopped()) 
		{
			state = AgentState.RUNNING;
			update();
			try 
			{
				Thread.sleep(100); // be cooperative
				synchronized(this) {
					while(isSuspended()) { wait(); }
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void start()
	{
		thread = new Thread();
		thread.start();
	}
	
	public void suspend()
	{
		state = AgentState.SUSPENDED;
	}
	
	public synchronized void resume() {
		if (!isStopped()) {
			state = AgentState.RUNNING;
			notify();
		}
	}
	public void stop()
	{
		state = AgentState.STOPPED;
	}
	
	public void move(int steps)
	{
		switch(heading)
		{
			case NORTH:
			{
				y = y - steps; // move up
				if (y < 0) // don't go above the screen
					y = 0;
			}
			case SOUTH:
			{
				y = y + steps; // move up
				if (y > WORLD_SIZE) // don't below screen
					y = WORLD_SIZE;
			}
			case EAST:
			{
				x = x + steps; // move up
				if (x > WORLD_SIZE) // don't go off the right size
					x = WORLD_SIZE;
			}
				
			case WEST:
			{
				x = x - steps; // move up
				if (x < 0) // don't go off the left side
					x = 0;
			}
		}
	}
	
	public abstract void update();
	
	
	
	
	
	
}
