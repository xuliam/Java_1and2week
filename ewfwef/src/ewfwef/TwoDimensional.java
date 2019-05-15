package ewfwef;

import java.util.Scanner;

//java.util.Scanner input = new Scanner(System.in);
public class TwoDimensional {
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		int[][] matrix = new int[3][3];
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("enter"+matrix.length+"rows and"+matrix[0].length+"columns:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j<matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		int total = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				total += matrix[i][j];
			}
		}
		System.out.println(total);
	}

}
