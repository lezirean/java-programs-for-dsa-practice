// Java program to evaluate value of a postfix expression

import java.util.Stack;

public class TR9{

	static Stack<Integer> stack = new Stack<>();
	static char c;

	static int evaluatePostfix(String exp, int i){
		//if(i == exp.length() - 1) return stack.pop();
		if(i == exp.length()) return stack.pop();

		else{
			// Scan all characters one by one
			// for(int i=0;i<exp.length();i++){
			// 	char c=exp.charAt(i);
			c = exp.charAt(i);
				
			// If the scanned character is an operand (number here),
			// push it to the stack.
			if(Character.isDigit(c))
				stack.push(c - '0');
			
			// If the scanned character is an operator, pop two
			// elements from stack apply the operator
			else{
				int val1 = stack.pop();
				int val2 = stack.pop();
				
				switch(c){
					case '+':
					stack.push(val2 + val1);
					break;
					
					case '-':
					stack.push(val2 - val1);
					break;
					
					case '/':
					stack.push(val2 / val1);
					break;
					
					case '*':
					stack.push(val2 * val1);
					break;
				}
			}
			++i;
			//popValue = stack.pop();
			return evaluatePostfix(exp, i);	
		}
		
		//return stack.pop();
	}
	

	public static void main(String[] args){
		String exp="231*+9-";
		int i = 0;
		System.out.println("postfix evaluation: " + evaluatePostfix(exp, i));
	}
}

