import java.util.*;
import java.io.*;

public class TR5 {
    static double fact(int n, int m){
		if (n == 1) return 0;

		return fact(n - 1, m) % m;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N, M = 997;

		//System.out.print("Enter a number: "); N = input.nextInt();

		System.out.println("\n" + 1000 + "! MOD " + M + " is " + fact(1000, M));
		System.out.println("\n" + 10000 + "! MOD " + M + " is " + fact(10000, M));
		System.out.println("\n" + 100000 + "! MOD " + M + " is " + fact(100000, M));
		System.out.println("\n" + 1000000 + "! MOD " + M + " is " + fact(1000000, M));
	}
}