package ewfwef;

public class Week_3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
		int number =0;
		
		while (number < 20) {
			number++;
			sum += number;
			if(sum>= 100)
				break;
		}
		
		System.out.println(number);
		System.out.println(sum);
	}

}
