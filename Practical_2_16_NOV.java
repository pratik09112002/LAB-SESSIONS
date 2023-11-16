/* Q. Write a program to accept age and gender from the user and check the Rate of 
		 Interest according to the condition.
		 above 60
		 M:7% 
		 F:7.5%
		 
		 below 60
		 M,F: 5%
		*/


package Operator;

import java.util.Scanner;

public class Practical_2_16_NOV 
{
	public static void main(String[] args) 
	{
		int age,result,choice;
				
		Scanner sc = new Scanner(System.in);    //Accept input from the user
		System.out.print("Enter your Age: ");
		age=sc.nextInt();
				
		System.out.println("1:Male ");
		System.out.println("2:Female");
		System.out.print("Enter your Gender: ");
		choice=sc.nextInt();

		switch(choice)
		{
			case 1: // For male
					if(age>=60)				//Age is greater than or equal to 60 then rate of interest is 7.5% otherwise 5%.
					{
						System.out.println("User gets 7% Rate of Interest.");
					}
					else
					{
						System.out.println("User gets 5% Rate of Interest.");
					}
					break;
						
			case 2: // For Female
					if(age>=60)				//Age is greater than or equal to 60 then rate of interest is 7.5% otherwise 5%.
					{
						System.out.println("User gets 7.5% Rate of Interest.");
					}
					else
					{
						System.out.println("User gets 5% Rate of Interest.");
					}
					break;
					
				default: System.out.println("Invalid Choice!!! ");	
		}

	}

}
