package ewfwef;

public class CountAboveAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*1000);
			System.out.print(nums[i]+",");
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
					
		}
		System.out.println(sum);
	 int avarage =0;
	 avarage = sum/10;
	 System.out.println(avarage);
	 int count = 0;
	 for (int i = 0; i < nums.length; i++) {
		if(nums[i]>avarage) {
			count++;
		//	break;
		}
		
	}
	 System.out.println(count);
	}

}
