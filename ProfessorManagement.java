import java.util.Scanner;

public class ProfessorManagement{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		Professor prof[] = new Professor[5];
		for(int i = 0; i < prof.length; ++i){
			prof[i] = new Professor();
		}
		// prof[0] = new Professor();
		// prof[1] = new Professor();
		// prof[2] = new Professor();
		// prof[3] = new Professor();
		// prof[4] = new Professor();

		int n;
		String fName, mName, lName, designation, department;
		int serviceYear; double uniSalary;

		System.out.print("How many professors are there? "); n = console.nextInt();

		for(int i = 0; i < n; ++i){
			console.nextLine();
			System.out.print("\nEnter professor " + (i + 1) + "'s first name: "); fName = console.nextLine();
			System.out.print("Enter professor " + (i + 1) + "'s middle name: "); mName = console.nextLine();
			System.out.print("Enter professor " + (i + 1) + "'s last name: "); lName = console.nextLine();
			//prof[i] = new Professor();
			//prof[i] = new Professor(fName, mName, lName);
			prof[i].setName(fName, mName, lName);

			System.out.print("Enter professor " + (i + 1) + "'s designation: "); designation = console.nextLine();
			System.out.print("Enter professor " + (i + 1) + "'s department: "); department = console.nextLine();
			System.out.print("Enter professor " + (i + 1) + "'s number of years teaching: "); serviceYear = console.nextInt();
			System.out.print("Enter professor " + (i + 1) + "'s monthly salary: "); uniSalary = console.nextDouble();
			//prof[i] = new Professor(designation, department, serviceYear, uniSalary);
			prof[i].setAdditionalDetails(designation, department, serviceYear, uniSalary);
		}

		for(int i = 0; i < n; ++i){
			System.out.print("\nProf. " + (i + 1)); prof[i].showDetails();
		}
	}	
}

class Professor{
	String firstName, middleName, lastName;

	public void setName(String fName, String mName, String lName){
		firstName = fName;
		middleName = mName;
		lastName = lName;
	}

	// public Professor(String fName, String mName, String lName){
	// 	this.firstName = fName;
	// 	this.middleName = mName;
	// 	this.lastName = lName;
	// }

	String profDesignation, uniDepartment;
	int yearsOfService; 
	double salary;

	public void setAdditionalDetails(String designation, String department, int noOfYearsService, double monthlySalary){
		profDesignation = designation;
		uniDepartment = department;
		yearsOfService = noOfYearsService;
		salary = monthlySalary;
	}

	// public Professor(String designation, String department, int noOfYearsService, double monthlySalary){
	// 	this.profDesignation = designation;
	// 	this.uniDepartment = department;
	// 	this.yearsOfService = noOfYearsService;
	// 	this.salary = monthlySalary;
	// }

	public void showDetails(){
		System.out.print("\n\t--Full name: " + lastName + ", " + firstName + ", " + middleName);
		System.out.print("\n\t--Designation: " + profDesignation);
		System.out.print("\n\t--University Department: " + uniDepartment);
		System.out.print("\n\t--Years of teaching: " + yearsOfService);
		System.out.print("\n\t--Monthly Salary: " + salary);
	}		
}

	





//*****************************************
	// public static void main(String args[]){
	// 	Scanner console = new Scanner(System.in);

	// 	String profDesignation, department, firstName, middleName, lastName;
	// 	int yearsOfService;
	// 	double salary;

	// 	System.out.print("This program details a professor's basic information");
	// 	System.out.print("\nEnter the professor's first name: "); firstName = console.nextLine();
	// 	System.out.print("\nEnter the professor's middle name: "); middleName = console.nextLine();
	// 	System.out.print("\nEnter the professor's last name: "); lastName = console.nextLine();
	// 	System.out.print("\nEnter the professor's course designation: "); profDesignation = console.nextLine();
	// 	System.out.print("\nEnter the professor's department: "); department = console.nextLine();
	// 	System.out.print("\nEnter the years the professor has been teaching: "); yearsOfService = console.nextInt();
	// 	System.out.print("\nEnter the professor's monthly salary: "); salary = console.nextDouble();

	// 	System.out.print("\n\nThe professor's full name is: " + lastName + ", " + firstName + ", " + middleName);
	// 	System.out.print("\nThe professor is teaching: " + profDesignation);
	// 	System.out.print("\nThe professor is under the \' " + department + "\' department");
	// 	System.out.print("\nThe professor teaches for " + yearsOfService + " now");
	// 	System.out.print("\nThe professor makes " + salary + " a month");
	// }