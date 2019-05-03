package ewfwef;

import javax.swing.JOptionPane;

public class Week2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score;
		String grade;
		String name;
		name = JOptionPane.showInputDialog("enter your name");
		String pScore = JOptionPane.showInputDialog("enter score", "90.0");
		score = Double.parseDouble(pScore);
		
		if (score >= 90.0)
			grade = "A";
		else if (score >= 80)
		    grade = "B";
		   
		    else if (score >= 70)
		    	grade = "C";
		    else if (score >= 60)
		    	grade = "D";
		    else
			grade = "F";
		System.out.println(name + grade);
	}

}
