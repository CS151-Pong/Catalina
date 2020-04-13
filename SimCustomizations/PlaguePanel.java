package SimCustomizations;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import SimStation.Simulation;
import SimStation.simView;
import mvc.*;
import SimStation.*;

public class PlaguePanel extends AppPanel
{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8517556296236767488L;
	private JButton Start;
	private JButton Suspend;
	private JButton Resume;
	private JButton Stop;
	private JButton Stats;
	
	public PlaguePanel(AppFactory factory) {
		super(factory);
		PlagueView view = new PlagueView((Simulation)model);// cast name of model 
		
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
