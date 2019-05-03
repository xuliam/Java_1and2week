package ewfwef;

import javax.swing.JOptionPane;

public class Week2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius;
		double area;
		
		String pRadius = JOptionPane.showInputDialog("Enter radius:","-1 ");
		radius = Double.parseDouble(pRadius);
		
		if (radius >= 0) {
			area = radius * radius * 3.14;
			
			System.out.println("The area for the " + "cirecle of radius"+ radius + "is" + area);

		}
		else {
			System.out.println("Negative input");
		}
	}

}
