package ewfwef;


public class ReturningArrayFromMethod {
	
	public static int[] reverse(int[]list) {
		int[] result = new int[list.length];
		
		for (int i = 0, j = result.length- 1; i< list.lenght; i++, j--) {
			result[j] = list[i];
		}
		return result;
		
		public static void printArray(int[] array) {
			for(int i =0; i< array.length; i++) {
				System.out.print(array[i] + "");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
