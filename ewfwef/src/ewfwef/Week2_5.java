package ewfwef;
import javax.swing.JOptionPane;

public class Week2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x;
		String pX = JOptionPane.showInputDialog("Enter x:","2");
		x = Integer.parseInt(pX);
		
		if (x > 0)
			JOptionPane.showMessageDialog(null,x +"possive");
		else
			JOptionPane.showMessageDialog(null,x +"negtive");
	}

}
