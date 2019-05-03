package ewfwef;
import javax.swing.JOptionPane;
public class Week2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double weight;
		double height;
		double BMI;
		String pWeight = JOptionPane.showInputDialog("enter weight", "100");
		weight = Double.parseDouble(pWeight);
		String pHeight =JOptionPane.showInputDialog("enter Height");
		height = Double.parseDouble(pHeight);
		BMI = weight / (height * height);
		if (BMI < 18.5) 
			System.out.println("Underweight");
		else 
			System.out.println("ok");
	}

}
