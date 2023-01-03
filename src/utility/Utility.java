package utility;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class Utility {
	
	/*
	 a) write method that take number from 1-7 and return day of week
		Note :can use this method only within the package 
	 */
	
	void DayOfWeek(int num)
	{
		if(num>1 && num<7)
		{
			switch(num)
			{
			case 1:
			{
				System .out.println("Sunday");
				break;
			}
			case 2:
			{
				System .out.println("Monday");
				break;
			}
			case 3:
			{
				System .out.println("Tuesday");
				break;
			}
			case 4:
			{
				System .out.println("Wednesday");
				break;
			}
			case 5:
			{
				System .out.println("Thersday");
				break;
			}
			case 6:
			{
				System .out.println("Friday");
				break;
			}
			case 7:
			{
				System .out.println("Saturday");
				break;
			}
			default:
				System .out.println("not correct value");
				break;
			}
		}
		else
		{
			System .out.println("plz enter value between 1-7");
		}
	}
	
	/*
	 b)Write method to display the pattern like right angle triangle with a number.
	Note :
	x)can use this method everywhere 
	xx)can call this method in another class without create object
	 */
	public static void Pattern(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	
	public Utility() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Utility Obj1=new Utility();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number");
		int number = Integer.parseInt(reader.readLine());
		Obj1.DayOfWeek(number);
		Pattern(number);
	}

}
