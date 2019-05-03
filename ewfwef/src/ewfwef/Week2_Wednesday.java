package ewfwef;

import javax.swing.JOptionPane;

public class Week2_Wednesday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String name;
		double netsalary = 0;
		double cost = 0;
		
		String name = JOptionPane.showInputDialog("pls enter his name", "Lianxu");
		
		String pSalary = JOptionPane.showInputDialog("Salary","5000");
		Double salary = Double.parseDouble(pSalary);
   //	Double salary = Double.parseDouble(JOptionPane.showInputDialog("salary"));
	//  和上行代码同样的作用 下面这个更简单直接；
		
		String acc = JOptionPane.showInputDialog("ACC","A");
		
	//	String pAcc = JOptionPane.showInputDialog("enter His/Her Accomodation", "A");
	//	acc =  Char.parseChar(pAcc);
		
		switch(acc) {
		case "A": cost = 500;
		break;
		case "B": cost = 400;
		break;
		case "C": cost = 300;
		default:
		
		}
		netsalary = salary - cost;
		
		System.out.println(netsalary);
		
		
	}

}
