package Java.Pograms;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		
			for (char c : s.toCharArray()) {
				//push opening brackets into stack
				if(c == '(' || c == '{' || c == '[') {
					stack.push(c);
				}
				//process closing brackets
				else if(c== ')' || c == '}' || c == ']') { 
					//no matching opening bracket
					if(stack.isEmpty()) return false;
				
				char top = stack.peek();
				if((c == ')' && top!= '(') ||
			       (c == '}' && top!= '{') ||
				   (c == ']' && top!= '[')
				  )
				{
					return false;
				}
				//matching bracket
				stack.pop();
			}
		}
		//balanced if stack is empty
		return stack.isEmpty();
	}
	
	public static void main(String []args) {
        System.out.println(isBalanced("[{()}]"));   
        System.out.println(isBalanced("([{]})"));    
        System.out.println(isBalanced("[()()]{}"));

	}

}
