import java.util.*;
import java.io.*;

public class TR8 {
    static double fact(int n, int m, int maxRecurseCall){
		// if (n == 1) return 0;

		// return fact(n - 1, m) % m;

		try {
		    //recurse(i+1);

		    if (n == 1) return 0;		    
			return fact(n - 1, m, ++maxRecurseCall) % m;
		} 
		catch (java.lang.StackOverflowError e) {
		    //System.out.println("Recursion depth on this system is " + maxRecurseCall + ".");
		    return maxRecurseCall;
		}
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N, M = 997;
		int maxRecurseCall = 0;

		//System.out.print("Enter a number: "); N = input.nextInt();

		// System.out.println("\n" + 1000 + "! MOD " + M + " is " + fact(1000, M));
		// System.out.println("\n" + 10000 + "! MOD " + M + " is " + fact(10000, M));
		System.out.println("Maximum number of recursive calls: " + fact(100000, M, maxRecurseCall));
		// System.out.println("\n" + 1000000 + "! MOD " + M + " is " + fact(1000000, M));
	}
}

//50,000 	