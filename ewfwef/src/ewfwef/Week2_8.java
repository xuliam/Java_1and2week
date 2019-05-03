package ewfwef;

import javax.swing.JOptionPane;

public class Week2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salary;
		int years;
		String name;
		double total;
		int percent = 0;
		
		name = JOptionPane.showInputDialog("Enter his/her name", "Lianxu");
		
		String pYears = JOptionPane.showInputDialog("enter Service years", "10");
		years = Integer.parseInt(pYears);
		
		String pSalary =JOptionPane.showInputDialog("enter salary");
		salary = Double.parseDouble(pSalary);
		
		if (years >= 20)
			percent = 40;
		else if (years >= 10 && years <20) 
		    percent = 30;
		    else if (years <10)
		    percent = 20;
		total = salary + ((salary/100) * percent);
		System.out.println(name + total);
	}

}
