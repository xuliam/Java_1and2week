package ewfwef;
import java.util.Scanner;
public class Week2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.print("pls, enter X");
		Scanner input = new Scanner(System.in);
		
		
		x = input.nextInt();// 转换
		
		if (x % 5 == 0) {
			System.out.println("Hi Five");
		}
		if (x % 2 == 0) {
			System.out.println("Hi Even");
		}
	}

}
