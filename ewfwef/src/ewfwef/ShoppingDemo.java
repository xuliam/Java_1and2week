/**
 * 老九君练习
 */
package ewfwef;
import java.util.Scanner;

public class ShoppingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		float price; 
		int count;
		double total;
		System.out.print("LV price is:");
		price = input.nextFloat();
		System.out.print("LV count:");
		count = input.nextInt();
		total = price * count;
		
		System.out.print("hermes price:");
		price = input.nextFloat();
		System.out.print("hermes count:");
		count = input.nextInt();
		total += price * count;
		
		System.out.print("last:");
		price = input.nextFloat();
		System.out.print("count");
		count = input.nextInt();
		total += price* count;
	    
		if(total >= 50000) {
			total = total*0.7;
			
		}else {
			total = total *0.9;
		}
		System.out.print(total);
	}

}
