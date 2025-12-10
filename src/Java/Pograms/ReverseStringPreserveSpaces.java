//Given a string, reverse the characters but keep the spaces at their original positions.

package Java.Pograms;

public class ReverseStringPreserveSpaces {
	public static String reversestring(String str) {
		
		char [] inputArray = str.toCharArray();
		char [] result = new char [inputArray.length];
		
		//Mark space positions in result
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] == ' ') {
				result[i]=' ';
			}
		}
		
		//Fill characters in reverse order, skipping spaces
		int j = inputArray.length-1;
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] != ' ') {
				//skip space positions in result
				while(j>=0 && result[j] == ' ') {
					j--;
				}
				result[j] = inputArray[i];
				j--;
			}
		}
		return new String(result);
	}
	
	public static void main (String []args) {
		
		String input = "Welcome to India";
		System.out.println("Input String:  " + input);
		System.out.println("Output String: " + reversestring(input));
	}

}
