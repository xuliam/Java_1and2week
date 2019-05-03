package ewfwef;

import javax.swing.JOptionPane;

public class Week2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x;
		String pX = JOptionPane.showInputDialog("enter a number", "100");
		x = Double.parseDouble(pX);
		if ((x % 3) == 0 && (x % 2 == 0)) 
			System.out.println("X is divisible by 3 and 2");
		else if (x % 3 == 0 ) 
			System.out.println("X is divisible by 3");
		else if (x % 2 == 0)
			System.out.println("X is divisible by 2");
	//	    total = salary * 1.3;
	//	    else if (years <10)
	}

}
