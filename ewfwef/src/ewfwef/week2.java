package ewfwef;
import javax.swing.JOptionPane;

public class week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //  double b;
   //  boolean b = (1 > 2);
    // System.out.println(b);
		double radius;
		double area;
		String pRadius = JOptionPane.showInputDialog("pls, enter radius:");
		radius = Double.parseDouble(pRadius);
		 double PI = 3.14;
		if (radius >= 0) {
			area = radius * radius * PI;
			System.out.println("The area"+"for the circle of radius" + radius + "is" + area);
		}
		
	}

}
