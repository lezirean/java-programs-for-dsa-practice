import java.util.*;

public class A3{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int[] a;
		int count = 0, saizu, index = 0;
		int checkInt;
		HashMap<Integer, Integer> track = new HashMap<Integer, Integer>();

		System.out.print("Enter number of integers: "); saizu = console.nextInt();
		a = new int[saizu];

		while(--saizu != -1){
			checkInt = console.nextInt();
			if(checkInt < 1000){
				a[saizu] = checkInt;
				if(track.containsKey(a[saizu])){
					continue;
				}
				track.put(a[saizu], index++);
				++count;
			}
		}

		System.out.println("Number of different integers less than 1000: " + count);
	}
}
