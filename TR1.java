import java.util.*;
import java.io.*;

public class TR1 {
    static double fact(int n){
		if (n == 1) return 0;

		return fact(n - 1) + Math.log(n);
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N;

		System.out.print("Enter a number: "); N = input.nextInt();

		System.out.println("\nlog(" + N + "!) is " + fact(N));
	}
}
