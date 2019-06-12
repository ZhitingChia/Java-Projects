//Author: Zhi Ting Chia
//Created on 12/6/2019

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	private View view;
	
	public Controller() {
		view = new View();
	}
	
	public static void main (String args[]) {
		new Controller().runForm();
	}
	
	public void runForm() {
		view.displayFormPanel();
		view.addComputeListener(new ComputeListener());
		
	}
	
	class ComputeListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
            	View bmiView = new View();
            	double height = Double.valueOf(view.fp.heightField.getText()).floatValue();
            	double weight = Double.valueOf(view.fp.weightField.getText()).floatValue();
            	double bmi = new Model().computeBMI(height, weight);
            	//view.getContentPane().removeAll();
            	bmiView.displayBMIPanel(bmi);
            	bmiView.addBackListener(new BackListener());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
	
	class BackListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
            	runForm();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
