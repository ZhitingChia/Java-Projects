//Author: Zhi Ting Chia
//Created on 12/6/2019


import java.awt.Color;

public class Model {
	public Model() {
		
	}
	
	public static void main (String args[]) {
		System.out.println(new Model().getDetails(32));
	}
	
	public double computeBMI(double height, double weight) {
		return weight/(height*height);
	}
	
	public Color getBMIColor(double bmi) {
		Color c;
		if (bmi <= 18.4)
			c= Color.yellow;
		else if (bmi <= 22.9)
			c= Color.green;
		else if (bmi <= 27.4)
			c= Color.yellow;
		else {
			c= Color.red;
		}
		
		return c;
	}
	
	public String getRiskLevel(double bmi) {
		String risk;
		if (bmi <= 18.4)
			risk = "Low*";
		else if (bmi <= 22.9)
			risk = "Low";
		else if (bmi <= 27.4)
			risk = "Medium";
		else {
			risk = "High";
		}
		
		return risk;
		
	}
	
	public String getDetails(double bmi) {
		String details;
		if (bmi <= 18.4) {
			details = "<html>AT RISK of nutritional deficiency and osteoporosis. <br/>";
			details += "You  are encouraged to eat a balanced meal and to seek medical advice if necessary.</html>";
		}
		else if (bmi <= 22.9) {
			details = "<html>Achieve a healthy weight by balancing your caloric input (diet) <br/>and output (physical activity).</html>";
		}
		else if (bmi <= 27.4)
		{
			details = "<html>Aim to lose 5% to 10% of your body weight over 6 to 12 months ";
			details += "by increasing physical activity and reducing caloric intake</html>";
		}
		else {
			details = "<html>Aim to lose 5% to 10% of your body weight over 6 to 12 months <br/>";
			details += "by increasing physical activity and reducing caloric intake.<br/> ";
			details	+=  "Go for regular health screening to keep co-morbid conditions* in check.<br/><br/>  ";
			details += "*Cardiovascular risks of metabolic syndrome, including Type 2 Diabetes, Hypertension and Hyperlipidemia.</html>";
		}
		return details;
	}

}
