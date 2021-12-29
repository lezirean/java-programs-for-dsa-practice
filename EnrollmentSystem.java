import java.util.Scanner;

abstract class StudentInfo{
    String studentType, statusTagging, firstName, middleName, lastName;
    String birthdate, address, enrollmentYear, degreeProgram;

    abstract void inputStudentInfo();
    abstract void inputDegreeProgAndStatusTagging();
    abstract void displayStudentInfo();
}

public class EnrollmentSystem extends StudentInfo{
    void inputStudentInfo(){
        Scanner console = new Scanner(System.in);

        System.out.print("This program gets the enrollee's information that uses an abstract class"
                        + "\nEnter the enrollee's first name: " ); firstName = console.nextLine();
        System.out.print("Enter the enrollee's middle name: "); middleName = console.nextLine();
        System.out.print("Enter the enrollee's last name: "); lastName = console.nextLine();
        System.out.print("Enter the enrollee's birthdate: "); birthdate = console.nextLine();
        System.out.print("Enter the enrollee's address: "); address = console.nextLine();
        System.out.print("Enter the enrollee's enrollment year: "); enrollmentYear = console.next();
        System.out.print("What type of student are you? Choose one: Regular, Irregular, Transferee, or Returning: "); 
        studentType = console.next();

        // System.out.print("Are you going to be on online mode or correspondence mode: "); 
        // statusTagging = console.nextLine();  
        // System.out.print("\nEnter the enrollee's degree program: "); 
        // degreeProgram = console.nextLine();  
    }

    void inputDegreeProgAndStatusTagging(){
        Scanner input = new Scanner(System.in);
        System.out.print("Are you going to be on online mode or correspondence mode: "); 
        statusTagging = input.nextLine(); 
        System.out.print("Enter the enrollee's degree program: "); 
        degreeProgram = input.nextLine();  
    }

    void displayStudentInfo(){
        System.out.print("\n\nYour details are the following: ");
        System.out.print("\nYour name is: " + lastName + ", " + firstName + ", " + middleName);
        System.out.print("\nYour birthdate is: " + birthdate);
        System.out.print("\nYou live at: " + address);
        System.out.print("\nYour current year of enrollment is: " + enrollmentYear);
        System.out.print("\nYour degree program is: " + degreeProgram);
        System.out.print("\nYou are a/an \'" + studentType + "\' student");
        System.out.print("\nYou are under \'" + statusTagging + "\' mode of learning");
    }

    public static void main(String args[]){
        EnrollmentSystem student = new EnrollmentSystem();
        student.inputStudentInfo();
        student.inputDegreeProgAndStatusTagging();
        student.displayStudentInfo();
    }
    
}
