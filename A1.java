//import java.util.*;
import java.util.Arrays;

//1. Use the sieve of Eratosthenes to determine the number of primes less than N, for N = 10^3, 10^4, 10^5, and 10^6
public class A1{

	static int sieveOfEratosthenes(int N){
		boolean primes[] = new boolean[N + 1]; 
		Arrays.fill(primes, true); 

		for(int i = 2; i * i <= N; ++i){
			if(primes[i]){
				for(int j = i * i; j <= N; j = j + i){
					primes[j] = false; 
				}
			}
		}

		int countPrime = 0;
		for(int i = 2; i <= N; ++i){
			if(primes[i]) ++countPrime;
		}

		return countPrime;
	}

	public static void main(String args[]){
		System.out.println("Number of primes in 10^3 = " + sieveOfEratosthenes(1000));
		System.out.println("Number of primes in 10^4 = " + sieveOfEratosthenes(10000));
		System.out.println("Number of primes in 10^5 = " + sieveOfEratosthenes(100000));
		System.out.println("Number of primes in 10^6 = " + sieveOfEratosthenes(1000000));
	}
}