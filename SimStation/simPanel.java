package SimStation;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import mvc.*;

public class simPanel extends AppPanel
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1827719495886772240L;
	private JButton Start;
	private JButton Suspend;
	private JButton Resume;
	private JButton Stop;
	private JButton Stats;
	
	public simPanel(AppFactory factory) {
		super(factory);
		simView view = new simView((Simulation)model);// cast name of model 
		this.setLayout(new GridLayout(1, 2));
		
		Start = new JButton("Start");
		Suspend =  new JButton("Suspend");
		Resume = new JButton ("Resume");
		Stop = new JButton("Stop");
		Stats = new JButton("Stats");
		
		Start.addActionListener(this);
		Suspend.addActionListener(this);
		Resume.addActionListener(this);
		Stop.addActionListener(this);
		Stats.addActionListener(this);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,1));
		
		JPanel j=new JPanel();
		j.add(Start);
		buttonPanel.add(j);
		
		j=new JPanel();
		j.add(Suspend);
		buttonPanel.add(j);
	
		j=new JPanel();
		j.add(Resume);
		buttonPanel.add(j);
	
		j=new JPanel();
		j.add(Stop);
		buttonPanel.add(j);
	
		j=new JPanel();
		j.add(Stats);
		buttonPanel.add(j);

		add(buttonPanel, "West");
		add(view,"East");
		//frame.getContentPane().add(screen);
		view.validate();
		//add(view);
	}

}
