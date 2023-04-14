import java.util.Stack;
import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		Scanner in = new Scanner(System.in);
		
		// input expression
		System.out.print("Input expression: ");
		String input = in.nextLine();
		
		// transfer expression to stack
		System.out.println();
		for(int i = 0; i < input.length(); i++) {
			stack.add(input.charAt(i));
		}
		
		// declare counters
		int leftParenCtr = 0, leftS_bracketCtr = 0, leftC_bracketCtr = 0, leftSlashStarCtr = 0;
		int rightParenCtr = 0, rightS_bracketCtr = 0, rightC_bracketCtr = 0, rightSlashStarCtr = 0;
		
		// count parentheses and brackets (left)
		for(int i = 0; i < input.length(); i++) {
			if (stack.get(i) == '(') {
				leftParenCtr++;
			}
			else if (stack.get(i) == '[') {
				leftS_bracketCtr++;
			}
			else if (stack.get(i) == '{') {
				leftC_bracketCtr++;
			}
			else if (stack.get(i) == '/' && i == input.length() - 1) {
				
			}
			else if (stack.get(i) == '/' && stack.get(i + 1) == '*') {
				leftSlashStarCtr++;
			}
		}
		// count parentheses and brackets (right)
		for(int i = 0; i < input.length(); i++) {
			if (stack.get(i) == ')') {
				rightParenCtr++;
			}
			else if (stack.get(i) == ']') {
				rightS_bracketCtr++;
			}
			else if (stack.get(i) == '}') {
				rightC_bracketCtr++;
			}
			else if (stack.get(i) == '*' && stack.get(i + 1) == '/') {
				rightSlashStarCtr++;
			}
		}
	
		int balanceCtr = 0; // counter for unbalanced instances
		// checks and prints how many parentheses is lacking
		if(leftParenCtr > rightParenCtr) {
			System.out.println("Expression lacks " + (leftParenCtr - rightParenCtr) + " right parenthesis/parentheses");
		}
		else if(leftParenCtr < rightParenCtr) {
			System.out.println("Expression lacks " + (rightParenCtr - leftParenCtr) + " left parenthesis/parentheses");
		}
		else {
			balanceCtr++;
		}
		
		// checks and prints how many square brackets is lacking
		if(leftS_bracketCtr > rightS_bracketCtr) {
			System.out.println("Expression lacks " + (leftS_bracketCtr - rightS_bracketCtr) + " right square bracket/s");
		}
		else if(leftS_bracketCtr < rightS_bracketCtr) {
			System.out.println("Expression lacks " + (rightS_bracketCtr - leftS_bracketCtr) + " left square bracket/s");
		}
		else {
			balanceCtr++;
		}
		
		// checks and prints how many square brackets is lacking
		if(leftC_bracketCtr > rightC_bracketCtr) {
			System.out.println("Expression lacks " + (leftC_bracketCtr - rightC_bracketCtr) + " right curly bracket/s");
		}
		else if(leftC_bracketCtr < rightC_bracketCtr) {
			System.out.println("Expression lacks " + (rightC_bracketCtr - leftC_bracketCtr) + " left curly bracket/s");
		}
		else {
			balanceCtr++;
		}
		
		// checks and prints how many slash-asterisk is lacking
		if(leftSlashStarCtr > rightSlashStarCtr) {
			System.out.println("Expression lacks " + (leftSlashStarCtr - rightSlashStarCtr) + " Slash-Asterisk/s");
		}
		else if(leftSlashStarCtr < rightSlashStarCtr) {
			System.out.println("Expression lacks " + (rightSlashStarCtr - leftSlashStarCtr) + " Asterisk-Slash/es");
		}
		else {
			balanceCtr++;
		}
		
		// check if the expression is balanced or not
		if(balanceCtr == 4) {
			System.out.println("The expression is balanced");
		}
		else {
			System.out.println("Which means the expression is not balanced");
		}
		
		in.close();
	}
}
