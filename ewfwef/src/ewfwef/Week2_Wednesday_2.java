package ewfwef;

import javax.swing.JOptionPane;

public class Week2_Wednesday_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
	//	char answer;
		
		a = 50 + (int)(Math.random() * 50);
	//	System.out.println(a);
		
		b = 50 + (int)(Math.random() * 50);
		
		
		
		String pC = JOptionPane.showInputDialog("what is " + a + "+"+ b +"?");
		c = Integer.parseInt(pC);
		
	//	String pC = JOptionPane.showInputDialog("enter your answer", "10");
	//	c = Integer.parseInt(pC);
		
		
		
		if (c == (a+b)) {
			JOptionPane.showMessageDialog(null,"Right");
		}else {
			JOptionPane.showMessageDialog(null,"Wrong");
		}		
		
		//JOptionPane.showInternalMessageDialog(null, a);
				
	}

}
