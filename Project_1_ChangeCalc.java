package projects;

import java.util.Scanner;

public class Project_1_ChangeCalc 

// This project is to show the user how much change to give a customer
{

	public static void main(String[] args) 
	{
	
		//prompt the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total sale amount: ");
		double saleAmount = scanner.nextDouble();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter amount given by customer: ");
		double amountGiven = scanner2.nextDouble();
		
		
		// Call the method
		
		getChangeResults(saleAmount, amountGiven);
		//Close the scanners
		
		
		
		scanner.close();
		scanner2.close();
	}

	
		public static void getChangeResults(double saleAmount, double amountGiven)
		{
			double changeAmount = (amountGiven - saleAmount);
			
			double tmp;
				
			if (changeAmount >= 100)
			{
				tmp = (int) changeAmount / 100;
				System.out.println("$100 Bills =  " + (int) tmp);
				changeAmount = changeAmount % 100;
			}
			
			if (changeAmount >= 50) 
			{
				tmp = (int) changeAmount / 50;
				System.out.println("$50 Bills =  " + (int) tmp);
				changeAmount = changeAmount % 50;
			}
			
			if (changeAmount >= 20) 
			{
				tmp = (int) changeAmount / 20;
				System.out.println("$20 Bills =  " + (int) tmp);
				changeAmount = changeAmount % 20;
			}
			
			if (changeAmount >= 10) 
			{
				tmp = (int) changeAmount / 10;
				System.out.println("$10 Bills =  " + (int) tmp);
				changeAmount = changeAmount % 10;
			}
			
			if (changeAmount >= 5) 
			{
				tmp = (int) changeAmount / 5;
				System.out.println("$5 Bills =  " + (int) tmp);
				changeAmount = changeAmount % 5;
			}
			
			if (changeAmount >= 1) 
			{
				tmp = (int) changeAmount / 1;
				System.out.println("$1 Bills =  " + (int) tmp);
				changeAmount = changeAmount % 1;
			}
			
			if (changeAmount > .25) 
			{
				
				tmp = changeAmount / .25;
				System.out.println("Quarters =  " + (int) tmp);
				changeAmount = changeAmount % .25;
			}
			
			if (changeAmount > .10) 
			{
				tmp = changeAmount / .10;
				System.out.println("Dimes =  " + (int) tmp);
				changeAmount = changeAmount % .10;
			}
			
			if (changeAmount > .05) 
			{
				
				tmp = changeAmount / .05;
				System.out.println("Nickels =  " + (int) tmp);
				changeAmount = changeAmount % .05;
			}
			
			if (changeAmount > .01) 
			{
				tmp = changeAmount / .01;
				System.out.println("Pennies =  " + (int) tmp);
				changeAmount = changeAmount % .01;
			}
		}	
}