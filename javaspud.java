import java.util.Scanner;

public class Task3_2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		double totalCost = 0.0;
		final double MEDIUM = 2.5;
		final double LARGE = 3.5;
		
		System.out.println("What size jacket do you want,'M' or 'L' ? ");
		String size = in.next();
		
		System.out.println("How many toppings do you want? ");
		int top = in.nextInt();
				
		if (size.equals("M"))
		{	
			if (top <= 2)
			{
				totalCost = MEDIUM + (0.50*top);
			}
			else
			{
				totalCost = MEDIUM + (0.40*top);
			}
		}
		else if (size.equals("L"))
		{
			if (top <= 2)
			{
			totalCost = LARGE + (0.55*top);
			}
			else
			{
			totalCost = LARGE + (0.45*top);
			}
		}	
		else
		{
			System.out.println("Invalid Input ");
		}

		System.out.println("Spud You Like");
		System.out.println("=============");
		System.out.println("Medium (M) or Large jacket potato: " + size);
		System.out.println("Number of toppings: " + top);
		System.out.println("Total cost: " + totalCost + " pounds");
	}
}
