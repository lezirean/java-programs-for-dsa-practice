import java.util.Scanner;
import java.util.Arrays;

public class UniversitySubjects{
	public static char sophomore1st(){
		Scanner console = new Scanner(System.in);
		char y;
		String sophSubs1st[] = {"Data Communications and Networking", "Data Structures and Algorithms", "Operating Systems",
								"PE 3", "Programming 3 ~Prerequisite: COMP 20033: Computer Programming 2 ", "Reading Visual Arts", "Understanding the Self",
								"World Literature"};
		String sophDesc1st[] = {"fundamentals of networking and the Internet", "various ways to store data and how to manipulate them",
								"how does an operating system manage resources", "how to do Karate", "structured programming using COBOL",
								"understand various visual texts", "philosophical sense of the Self", "explore diverse forms of literature from all over the world"};
		String sophUnits1st[] = {"3.0 units", "3.0 units", "3.0 units", "2.0 units", "3.0 units", "3.0 units", "3.0 units", "3.0 units"};

		System.out.println("---Available subjects for BSIT 2 First Semester---\n");
		for(int i = 0; i < sophSubs1st.length; ++i){
			if(i == 1 || i == 4){
			System.out.println("[" + (i + 1) + "] - " + sophSubs1st[i] + " (" + sophUnits1st[i] + ")"
							+ "\n\t-Prerequisite: COMP 20033: Computer Programming 2 " 
							+ "\n\t- " + sophDesc1st[i]);
			continue;
			}	
			if(i == 2){
			System.out.println("[" + (i + 1) + "] - " + sophSubs1st[i] + " (" + sophUnits1st[i] + ")" 
							+ "\n\t-Prerequisite: COMP 20013: Introduction to Computing " 
							+ "\n\t- " + sophDesc1st[i]);
			continue;
			}
			System.out.println("[" + (i + 1) + "] - " + sophSubs1st[i] + " (" + sophUnits1st[i] + ")" 
								+ "\n\t- " + sophDesc1st[i]);
		}
		System.out.println("Enroll to all of these courses? (Must have taken the prerequisites) y or n?: ");
		y = console.next().charAt(0);
		return y;
	}	

	public static char sophomore2nd(){
		Scanner console = new Scanner(System.in);
		char y;
		String sophSubs2nd[] = {"Human Computer Interaction", "Information Management", "Intergrative Programming and Technologies 1",
								"Network Administration", "Object Oriented Programming", "People and the Earth's Ecosystem",
								"PE 4", "Quantitative Methods with Modeling and Simulation"};
		String sophDesc2nd[] = {"interfaces between the human and computer", "management of digital information", "systems integration with focus on communication mechanisms and data standardization",
								"a higher level of Data Communications and Networking", "programming with mostly the use of classes",
								"a course about the environment", "you will do Volleyball", "use of mathematical tools for computational functions"};
		String sophUnits2nd[] = {"3.0 units", "3.0 units", "3.0 units", "3.0 units", "3.0 units", "3.0 units", "2.0 units", "3.0 units"};

		System.out.println("---Available subjects for BSIT 2 Second Semester---\n");
		for(int i = 0; i < sophSubs2nd.length; ++i){
			if(i == 0){
				System.out.println("[" + (i + 1) + "] - " + sophSubs2nd[i] + " (" + sophUnits2nd[i] + ")" 
					+"\n\t-Prerequisite: COMP 20023: Computer Programming 1 " 
					+ "\n\t- " + sophDesc2nd[i]);
				continue;
			}
			if(i == 1){
				System.out.println("[" + (i + 1) + "] - " + sophSubs2nd[i] + " (" + sophUnits2nd[i] + ")" 
									+ "\n\t-Prerequisite: INTE 30013: Programming 3 " 
									+ "\n\t- " + sophDesc2nd[i]);
				continue;
			}
			if(i == 3){
				System.out.println("[" + (i + 1) + "] - " + sophSubs2nd[i] + " (" + sophUnits2nd[i] + ")" 
									+ "\n\t-Prerequisite: COMP 20173: Data Communications and Networking " 
									+ "\n\t- " + sophDesc2nd[i]);
				continue;
			}
			if(i == 4){
				System.out.println("[" + (i + 1) + "] - " + sophSubs2nd[i] + " (" + sophUnits2nd[i] + ")" 
									+ "\n\t-Prerequisite: COMP 20033: Computer Programming 2 " 
									+ "\n\t- " + sophDesc2nd[i]);
				continue;
			}
			System.out.println("[" + (i + 1) + "] - " + sophSubs2nd[i] + " (" + sophUnits2nd[i] + ")" 
								+ "\n\t- " + sophDesc2nd[i]);
		}
		System.out.println("Enroll to all of these courses? (Must have taken the prerequisites) y or n?: ");
		y = console.next().charAt(0);
		return y;
	}
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);

		int choice;
		char enrolling;

		do{
			System.out.println("\nBSIT 2 Subjects");
			System.out.println("[1] - First Semester"
								+ "\n[2] - Second Semester"
								+ "\n[3] - Exit");
			choice = console.nextInt();

			switch(choice){
				case 1: 
						enrolling = sophomore1st();
						if(enrolling == 'Y' || enrolling == 'y'){
							System.out.println("You are now enrolled in BSIT 2 First Semester courses.");
							System.exit(1);
						}
						//sophomore1st();
						break;
				case 2: 
						enrolling = sophomore2nd();
						if(enrolling == 'Y' || enrolling == 'y'){
							System.out.println("You are now enrolled in BSIT 2 Second Semester courses.");
							System.exit(1);
						}
						//sophomore2nd();
						break;	
			    case 3: System.exit(1);
				default: System.out.println("Invalid choice");
			}
		}while(choice != 3);
	}	
}

// Create a program that will manage university subjects. The program should require that every 
// subject has title, description, units. The subject must have an optional prerequisites and subject 
// equivalence

