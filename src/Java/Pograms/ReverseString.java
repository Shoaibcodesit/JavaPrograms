package Java.Pograms;

public class ReverseString {
	public static String reverse(String s) {
		if(s==null || s.length()<=1) {
			return null;
		}
		
		char [] chars = s.toCharArray();
		int left = 0;
		int right = chars.length-1;
		
		while(left<right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			
			left++;
			right--;
		}
		
		return new String(chars);
	}
	
	public static void main(String [] args) {
		String input = "automation";
		String reversed = reverse(input);
		System.out.println("Input String: " + input);
		System.out.println("Reversed String: " + reversed);
	}

}
