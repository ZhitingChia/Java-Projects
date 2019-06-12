//Author: Zhi Ting Chia
//Created on 12/6/2019

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class FormPanel extends JPanel{
	public JPanel heightPanel;
	public JTextField heightField;
	public JPanel weightPanel;
	public JTextField weightField;
	private JPanel buttonPanel;
	public JButton button;
	private GridBagConstraints c; 

	public FormPanel() {
		this.setLayout(new GridBagLayout());
		c = new GridBagConstraints();
		this.heightPanel = makeHeightPanel();
		c.gridx =0;
		this.add(heightPanel,c);
		
		this.weightPanel = makeWeightPanel();
		c.gridx=0;
		c.gridy=1;
		this.add(weightPanel,c);
		this.buttonPanel =makeButtonPanel();
		c.gridy=2;
		this.add(buttonPanel,c);
		
		
	}
	
	public static void main(String args[]) {
		JFrame mainFrame = new JFrame("BMI Calculator by Zhiting");
		FormPanel fPanel = new FormPanel();
		mainFrame.getContentPane().add(fPanel);
		mainFrame.setVisible(true);
	}
	
	public void reset() {
		this.heightField.setText(null);
		this.weightField.setText(null);
	}
	
	private JPanel makeHeightPanel() {
		JPanel heightPanel = new JPanel();
		JLabel heightLabel = new JLabel ("Height(m):  ");
		heightLabel.setFont(new Font(heightLabel.getFont().getName(),Font.PLAIN, 18));
		heightField = new JTextField(5);
		heightField.setFont(new Font(heightField.getFont().getName(),Font.PLAIN, 18));
		heightPanel.add(heightLabel);
		heightPanel.add(heightField);
		return heightPanel;
	}
	
	private JPanel makeWeightPanel() {
		JPanel weightPanel = new JPanel();
		JLabel weightLabel = new JLabel ("Weight(kg):");
		weightLabel.setFont(new Font(weightLabel.getFont().getName(),Font.PLAIN, 18));
		weightField = new JTextField(5);
		weightPanel.add(weightLabel);
		weightField.setFont(new Font(weightField.getFont().getName(),Font.PLAIN, 18));
		weightPanel.add(weightField);
		return weightPanel;
	}
	
	private JPanel makeButtonPanel() {
		JPanel buttonPanel = new JPanel();
		button = new JButton("Enter");
		button.setFont(new Font(button.getFont().getName(),Font.PLAIN, 18));
		buttonPanel.add(button);
		return buttonPanel;
	}

}
