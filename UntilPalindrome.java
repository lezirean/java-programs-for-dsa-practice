import java.util.Scanner;

public class UntilPalindrome{
	public static int reverse(int num){
		int reversed = 0;

    	// run loop until num becomes 0
    	while(num != 0) {
    
	      // get last digit from num
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
		}
		return reversed;
	}

	public static boolean checkPalindrome(int num){
		int reversedNum = reverse(num);
		if(reversedNum == num) return true;
		return false;
	}

	public static void main (String[] arg){
		Scanner sc = new Scanner(System.in);
		int num, noOfIterations = 0, palindrome, input;
		input = sc.nextInt();	// take input

		while(true){
			++noOfIterations;
			//num = reverse(input); // stores original input to num
			num = input; // stores original input to num
			input = input + reverse(input); // reverse input and add it to original

			if(checkPalindrome(input) == true){
				System.out.println("The palindrome is " + reverse(input));
				System.out.println("No. of iterations: " + noOfIterations);
				break;
			}
		}

	}
}