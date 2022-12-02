package test;

import java.util.*;
class accounts
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account balance");

		double balance;
		if(sc.hasNextDouble())
		{
			balance=sc.nextDouble();
			double new_balance=calculate(balance);
			System.out.println("New balance of the account is "+new_balance);
		}
		else
		{
			System.out.println("Enter valid charcters");
		}
	}

	static double calculate(double x)
	{
		if(x>50000)
			return (x*1.08);
		else if(x>25000)
			return(x*1.05);
		else if(x>10000)
			return(x*1.02);
		else
			return x;
	}
}