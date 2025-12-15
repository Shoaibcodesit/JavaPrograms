package Java.Pograms;

public class PalindromeCheck {
	
	public static boolean ispalindrome(String s) {
		if(s == null) return false;
		
		s=s.toLowerCase();
		int left = 0;
		int right = s.length()-1;
		
		while(left<right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[]args) {
		String s1 = "level";
		String s2 = "hello";
		
		System.out.println(s1+ " " +ispalindrome(s1));
		System.out.println(s2+ " " +ispalindrome(s2));
	}

}
