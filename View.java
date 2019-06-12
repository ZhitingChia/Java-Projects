//Author: Zhi Ting Chia
//Created on 12/6/2019


import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame {
	public FormPanel fp;
	public BMIPanel bp;
	
	
	public View() {
		fp = new FormPanel();
		this.setTitle("Simple BMI Calculator by Zhiting");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setVisible(true);
	}
	
	public void addPanel(JPanel panel) {
		this.getContentPane().add(panel);
	}
	
	public static void main(String args[]) {
		new View().displayFormPanel();
	}
	
	public void displayFormPanel() {
		fp.reset();
		add(fp);
		this.setVisible(true);
	}
	
	public void displayBMIPanel(double bmi) {
		bp = new BMIPanel(bmi);
		add(bp);
		this.setVisible(true);
	}
	
	 public void addComputeListener(ActionListener mal) {
		 fp.button.addActionListener(mal);
	 }
	
	 public void addBackListener(ActionListener mal) {
		 bp.button.addActionListener(mal);
	 }
}
