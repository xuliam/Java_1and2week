package ewfwef;

public class SoreDemo {
	public static void printArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");						
		}
	}
	
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		java.util.Arrays.sort(numbers);
		
		
		char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
		java.util.Arrays.sort(chars);
		
         printArray(chars);
		
		System.out.println();
		printArray(numbers);
		//for (int i = 0; i < chars.length; i++) {
		//	System.out.print(chars[i]+"\t");
		}
	}


