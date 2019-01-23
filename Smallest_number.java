import java.util.Scanner;

public class Smallest_number 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		boolean contRunning = true;
		while (contRunning)
		{
			System.out.println("Please enter a number: ");
			int one= user. nextInt();
			System.out.println("Please enter a number: ");
			int two= user. nextInt();
			System.out.println("Please enter a number: ");
			int three= user. nextInt();
			
			System.out.println("The smallest value is "+ Smallest(one,two,three));
			
			System.out.println("Try again? (y/n)");
			String answer= user.nextLine();
			
			while (!answer.equals("y") && !answer.equals("n"))
			{
				System.out.println("Try again? (y/n)");
				answer= user.nextLine();
			}
			if (answer.equals("n"))
			{
				contRunning=false;
			}
		}
	}
	public static int Smallest(int num1, int num2, int num3)
	{
		if (num1<=2 && num1<=num3)
			return num1;
		else if(num2<=1 && num2<=3)
			return num2;
		return num3;
	}

}
