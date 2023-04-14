import java.util.*;

public class Quiz2ProgNo1{

	static int operator(char oper){
		switch (oper){
			case '+':
			case '-':
				return 1;
		
			case '*':
			case '/':
				return 2;
		
			case '^':
				return 3;
		}
		return -1;
	}

	static String infixToPostfix(String exp){
		String res = new String("");
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < exp.length(); ++i){
			char c = exp.charAt(i);
			
			if (Character.isLetterOrDigit(c))
				res += c;
			else if (c == '(')
				stack.push(c);
			else if (c == ')'){
				while (!stack.isEmpty() && stack.peek() != '(') 
					res += stack.pop();
				
				stack.pop();
			}
			else{ 			
				while (!stack.isEmpty() && operator(c) <= operator(stack.peek()))
					res += stack.pop();

				stack.push(c);
			}
		}
	
		while (!stack.isEmpty()){
			if(stack.peek() == '(')
				return "Oops! Invalid Expression.";

			res += stack.pop();
		}

		return res;
	}

	static boolean isOperand(char ch){
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}

	static String postfixToInfix(String exp){
		Stack<String> s = new Stack<String>();

		for (int i = 0; i < exp.length(); i++){
			if (isOperand(exp.charAt(i))){
				s.push(exp.charAt(i) + "");
			}
			else{
				String op1 = s.peek();
				s.pop();
				String op2 = s.peek();
				s.pop();
				s.push("(" + op2 + exp.charAt(i) + op1 + ")");
			}
		}

		return s.peek();
	}

	public static void main(String[] args){
		Scanner console = new Scanner(System.in);

		String exp;
		System.out.println("Enter infix expression: ");
		exp = console.nextLine();
		System.out.println("Infix to Postfix: " + infixToPostfix(exp));

		String expre;
		System.out.println("Enter postfix expression: ");
		expre = console.nextLine();
		System.out.println("Postfix to Infix" + postfixToInfix(expre));
	}

}

