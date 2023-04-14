import java.util.*;

//2. Suppose that a is declared as int[] a = new int[99]. Give the contents of the array after the following two statements are executed: 
//	for (i = 0; i < 99; i++) a[i] = 98-i; 
//	for (i = 0; i < 99; i++) a[i] = a[a[i]]; 

public class A2{
	public static void main(String args[]){
		int[] a = new int[99];
		int i;

		for (i = 0; i < 99; i++){
			a[i] = 98-i; 
			System.out.print(a[i] + " ");
		} 

		System.out.print("\n\n");

		for (i = 0; i < 99; i++){
			 a[i] = a[a[i]]; 
			 System.out.print(a[i] + " ");
		}
	}
}
