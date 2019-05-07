package ewfwef;

import java.util.Scanner;

public class Week_3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int n = 1;
		
		System.out.println("enter numbers");
		/*n = input.nextInt();
		total = total + n ;*/
		
		while (n != 0) {
			n = input.nextInt();
			total = total +n;
			
		}
		System.out.println(total);
	}
	

		
	}

