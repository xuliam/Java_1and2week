package ewfwef;

import javax.swing.JOptionPane;

public class Showinputdialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     String firstString = JOptionPane.showInputDialog("x");
     String secondString = JOptionPane.showInputDialog("y");
     
     
     
     int a = Integer.parseInt(firstString);
     int b = Integer.parseInt(secondString);
     
     
     
    
	JOptionPane.showMessageDialog(null,a * b);
     
	}
}
