import java.util.Scanner;

public class Deli{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		String sandwich, bread, condiment, drink;
		double price;

		// document code**
		System.out.println("Welcome to the Sandwich Corral");
		System.out.print("\nYou will be given choices for building your sandwich."
							+ "\nPlease enter your selection after each prompt"
							+ "\nand then press the Enter key.");

		System.out.print("\n\nPlease enter your sandwich choice."
							+ "\nHam, Beef, Reuben, PBJ, Cheese, or Vegetarian: ");
		sandwich = console.next();

		System.out.print("Please enter your bread selection."
							+ "\nRye, Wheat, White, Sourdough, or Pumpernickel: ");
		bread = console.next();

		System.out.print("Please enter your choice of condiment (one only)."
							+ "\nMayo, Mustard, Ketchup, none: ");
		condiment = console.next();

		System.out.print("Please enter your drink choice."
							+ "\nCoke, Diet, Tea, Coffee, or Water: ");
		drink = console.next(); 

		System.out.print("Please enter 3.99 for a half sandwich or 5.99."
							+ "\nfor a whole sandwich: ");
		price = console.nextDouble();

		System.out.println("\nYou have entered the following information:"
							+ "\n\nSandwich:\t" + sandwich
							+ "\nBread:\t\t" + bread
							+ "\nCondiment:\t" + condiment
							+ "\nDrink:\t\t" + drink
							+ "\n\nTab:\t\t" + price);

	}
}


/* Output

Welcome to the Sandwich Corral

You will be given choices for building your sandwich.
Please enter your selection after each prompt
and then press the Enter key.

Please enter your sandwich choice.
Ham, Beef, Reuben, PBJ, Cheese, or Vegetarian: Ham
Please enter your bread selection.
Rye, Wheat, White, Sourdough, or Pumpernickel: Rye
Please enter your choice of condiment (one only).
Mayo, Mustard, Ketchup, none: Mustard
Please enter your drink choice.
Coke, Diet, Tea, Coffee, or Water: Water
Please enter 3.99 for a half sandwich or 5.99.
for a whole sandwich: 3.99

You have entered the following information:

Sandwich:       Ham
Bread:          Rye
Condiment:      Mustard
Drink:          Water

Tab:            3.99

*/