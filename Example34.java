package example34;
import java.util.Scanner;
/*   
Author: Chan In Kou
Purpose: The Display will show a bar chart
*/
public class Example34
{
	public static void main(String[] args) 
	{
	    //create a Scanner
		Scanner in = new Scanner(System.in);
		
        //create an array
		double[] storeInput = new double[6];
		

		//Ask the user to enter the total sales for five stores that you own.
		for(int i = 1; i <= 5; i++)
		{
			System.out.print("Enter the total sales for Store " + i + ": ");
			storeInput[i] = in.nextDouble();
		}
		
		//display the graph of total sales
        System.out.println("\nGRAPH OF TOTAL SALES");
		System.out.println(" (Each * = $100)");
		
		//display the store 1-5
		for(int i = 1; i <= 5; i++)
		{
			System.out.print("Store " + i + ": ");
		        //display the star by dividing 100 so you get the stars
				for(int b = 0; b < storeInput[i]/100; b++)
				    System.out.print("*");
				    System.out.println("");
		}
    }
}