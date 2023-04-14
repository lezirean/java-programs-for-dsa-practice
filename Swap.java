import java.util.Scanner;

public class Swap{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		String name1, name2, temp;

		System.out.print("You will be asked to enter two names."
						+ "\nThe program will display the names you entered, swap"
						+ "\nthe names, and then display them after they are swapped.");

		System.out.print("\n\nPlease enter the first name: ");
		name1 = console.next();

		System.out.print("Please enter the second name: ");
		name2 = console.next();

		System.out.print("You entered " + name1 + " as your first name and " + name2 + " as your"
						+ "\nsecond name.");

		temp = name1;
		name1 = name2;
		name2 = temp;

		System.out.print("\n\nAfter swapping the names,"
						+ "\nthe first name is " + name1
						+ "\nand the second name is " + name2 + ".");

	}
}


/* Output

You will be asked to enter two names.
The program will display the names you entered, swap
the names, and then display them after they are swapped.

Please enter the first name: Romeo
Please enter the second name: Juliet
You entered Romeo as your first name and Juliet as your
second name.

After swapping the names,
the first name is Juliet
and the second name is Romeo.

*/