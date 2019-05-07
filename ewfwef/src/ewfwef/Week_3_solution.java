package ewfwef;

public class Week_3_solution {
	public static int sum(int i1, int i2) {
		int sum =0;
		for(int i = i1; i <=i2; i++)
			sum +=1;
		return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Sum from 1 to 20 is" + sum(1,10));
		System.out.println("Sumfrom20to30is"+ sum(20,30));
		System.out.println("Sumfrom35to45is"+ sum(40,50));
		
	}

}
