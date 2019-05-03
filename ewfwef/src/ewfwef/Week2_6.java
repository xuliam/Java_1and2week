package ewfwef;
import javax.swing.JOptionPane;

public class Week2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double score;
		String grade;
		String pScore = JOptionPane.showInputDialog("enter score", "90.0");
		score = Double.parseDouble(pScore);
		if (score >= 90.0)
			grade = "A";
		else if (score >= 80)
		    grade = "B";
		   
		    else
			grade = "F";
		System.out.println(grade);
		
		
	}

}
