import java.util.Scanner;

public class SongSales{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);

		String songTitle;
		double price, totalRevenue, commissionInternetSite, commissionManager;
		int noOfCopies;
		final double COM_MANAGER_RATE = 0.12, COM_INTERNET_SITE_RATE = 0.03;

		System.out.println("This program calculates the revenue earned and commission paid for a"
							+ "\nsong sold over the Internet.");

		System.out.print("\n\nPlease enter the name of the song: ");
		songTitle = console.nextLine();

		System.out.print("Please enter the selling price in dollars and cents: ");
		price = console.nextDouble();

		System.out.print("Please enter the number of copies sold: ");
		noOfCopies = console.nextInt();

		totalRevenue = price * noOfCopies;
		commissionManager = totalRevenue * COM_MANAGER_RATE;
		commissionInternetSite = totalRevenue * COM_INTERNET_SITE_RATE;

		System.out.print(noOfCopies + " copies of the song " + "\"" + songTitle + "\" were sold at $" + price 
						+ "\nper copy, for a total revenue of $" + totalRevenue);
		System.out.print("\nThe commission received by your agent is $" + commissionManager);
		System.out.print("\nThe commission received by the Internet site is $" + commissionInternetSite);


	}
}

/* Output

This program calculates the revenue earned and commission paid for a
song sold over the Internet.


Please enter the name of the song: The Beginning of Time
Please enter the selling price in dollars and cents: 0.89
Please enter the number of copies sold: 100000
100000 copies of the song "The Beginning of Time" were sold at $0.89
per copy, for a total revenue of $89000.0
The commission received by your agent is $10680.0
The commission received by the Internet site is $2670.0

*/