package Java.Pograms;

public class FindMinMaxInArray {
	
	public static int[] findMinMax(int[] num) {
		if(num == null || num.length == 0) {
			throw new IllegalArgumentException("Array is empty or null");
		}
		
		int max = num[0];
		int min = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
			
			if(num[i] < min) {
				min = num[i];
			}
		}
		return new int[]{min, max};
	}
	
	public static void main(String []args) {
		int[] num = {11,5,9,8,4};
		int[] result = 	findMinMax(num);
		System.out.println("Minimum length: "  + result[0]);
		System.out.println("Maximum length: "  + result[1]);
	}
	

}
