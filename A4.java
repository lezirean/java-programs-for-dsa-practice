import java.util.*;

public class A4 {  
	public static void main(String args[]){  
		ArrayList<Integer> arr = new ArrayList<Integer>();
		HashMap<Integer, Integer> track = new HashMap<Integer, Integer>();
		int min = 1;  
		int max = 999;  
		int count = 0, index = 0;
 
		//Generate random int value from 1 to 999   
		//System.out.println("Random value of type int between " + min + " to " + max + ": ");    
		
		do{
			int b = (int)(Math.random() * (max - min + 1) + min);
			arr.add(b);
			if(track.containsKey(arr.indexOf(b))) break;
			
			track.put(b, index++);
			System.out.print(b + "  ");
			++count;
		}while(true);

		System.out.println("\n\n\nNumber of unique generated values: " + count);
		
	}  
} 