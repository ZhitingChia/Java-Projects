//Author: Zhi Ting Chia
//Created on 12/6/2019


import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class BMIPanel extends JPanel{
	private JPanel titlePanel;
	private JPanel valPanel;
	private JPanel detailsPanel;
	private JPanel buttonPanel;
	private JPanel ackPanel;
	private Color bmiColor;
	private GridBagConstraints c;
	private Model m;
	public JButton button;
	
	
	public BMIPanel(double bmi) {
		m = new Model();
		this.setLayout(new GridBagLayout());
		c = new GridBagConstraints();	
		titlePanel = makeTitlePanel(bmi);
		//c.anchor=GridBagConstraints.CENTER;
		c.gridy=0;
		//c.gridx=0;
		c.weightx=0.5;
		c.weighty=0.25;
		c.fill=GridBagConstraints.BOTH;
		this.add(titlePanel,c);
		valPanel = makeValuePanel(bmi);
		c.gridy=1;
		c.weighty=0.25;
		this.add(valPanel,c);
		detailsPanel = makeDetailsPanel(bmi);
		c.gridy=2;
		c.weighty =0.40;
		this.add(detailsPanel,c);
		
		c.weighty = 0.05;
		c.gridy=3;
		buttonPanel = makeButtonPanel();
		this.add(buttonPanel,c);
		
		//c.weighty=0.06;
		c.gridy=4;
		ackPanel = makeAckPanel();
		this.add(ackPanel,c);
		this.setBackground(new Color(200,250,255));
	}
	
	public static void main(String args[]) {
		JFrame mainFrame = new JFrame("BMI Calculator by Zhiting");
		Model m = new Model();
		mainFrame.setSize(800,600);
		
		BMIPanel bPanel = new BMIPanel(m.computeBMI(1.61,82));
		mainFrame.getContentPane().add(bPanel);
		mainFrame.setVisible(true);
	}
	
	private JPanel makeTitlePanel(double bmi) {
		bmi = (double) Math.round(bmi*100)/100;
		JPanel titlePanel = new JPanel();
		String risk = new Model().getRiskLevel(bmi);
		JLabel titleLabel = new JLabel (risk + " Risk");
		titleLabel.setFont(new Font(titleLabel.getFont().getName(),Font.PLAIN, 33));
		titlePanel.add(titleLabel);
		return titlePanel;
	}
	
	
	private JPanel makeValuePanel(double bmi) {
		bmi = (double) Math.round(bmi*100)/100;
		JPanel valPanel = new JPanel();
		JLabel valLabel = new JLabel ("BMI: " + Double.toString(bmi));
		Font f = valLabel.getFont();
		valLabel.setFont(new Font(f.getName(), Font.PLAIN, 50));
		bmiColor = m.getBMIColor(bmi);
		valPanel.setBackground(bmiColor);
		valPanel.add(valLabel);
		return valPanel;
	}
	
	private JPanel makeDetailsPanel(double bmi) {
		bmi = (double) Math.round(bmi*100)/100;
		JPanel detailsPanel = new JPanel();
		JLabel detailsLabel = new JLabel(m.getDetails(bmi));
		detailsPanel.add(detailsLabel);
		Color detailsColor = new Color(249,248,210);
		detailsPanel.setBackground(detailsColor);
		
		
		return detailsPanel;
		
	}
	
	private JPanel makeButtonPanel() {
		JPanel buttonPanel = new JPanel();
		button = new JButton("back");
		buttonPanel.add(button);
		return buttonPanel;
	}
	
	private JPanel makeAckPanel() {
		JPanel ackPanel = new JPanel();
		JLabel ackLabel = new JLabel ("<html>Information obtained from https://www.healthhub.sg/programmes/93/bmi-calculator.</html>");
		ackPanel.add(ackLabel);
		return ackPanel;
	}

}
