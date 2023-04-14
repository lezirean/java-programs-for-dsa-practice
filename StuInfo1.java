import java.util.Scanner;

public class StuInfo1{
	public static void main (String[] args){
		Scanner console = new Scanner (System.in);

		String first_name, last_name, classification, major;
		double gpa;

		System.out.print("Please enter your first name: ");
		first_name = console.nextLine();

		System.out.print("Please enter your last name: ");
		last_name = console.nextLine();

		System.out.print("Please enter your classification: \n"
			+ "freshman, sophomore, junior, senior, special, "
			+ "or graduate: ");
		classification = console.next();

		System.out.print("Please enter your major abbreviation: ");
		major = console.next();

		System.out.print("Please enter your grade point average: ");
		gpa = console.nextDouble();

		System.out.println("\nYou have entered the following "
			+ "information:\n"
			+ "\nName:\t\t" + first_name + ' ' + last_name
			+ "\nClassification:\t" + classification
			+ "\nMajor:\t\t" + major
			+ "\ngpa:\t\t" + gpa);
	}
}

/* Output

You have entered the following information:

Name:           leila borromeo
Classification: sophomore
Major:          BSIT
gpa:            1.23

*/