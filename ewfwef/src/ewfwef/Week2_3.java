package ewfwef;
import javax.swing.JOptionPane;

public class Week2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double inputX;
		 double inputY;
		 
	     String pInputX = JOptionPane.showInputDialog("x", "100");
	     inputX = Double.parseDouble(pInputX);
	     String pInputY = JOptionPane.showInputDialog("Enter y", "0");
	     inputY = Double.parseDouble(pInputY);
	     
	    if (inputY !=0) {
	    	JOptionPane.showMessageDialog(null, inputX/inputY);
	    }else {
	    	JOptionPane.showMessageDialog(null, "You can not divide by Zero");
	    }
	     
	     
	}

}
