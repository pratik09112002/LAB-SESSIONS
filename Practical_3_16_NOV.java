/* Q. Write a program to accept choice from the user and perform the operation 
 * 1. Find out greater between 3 No.
 * 2. Check the given no. is even or odd
 * 3. Check the given character is vowel or not.
 * 4. Check the given no. is divisible by 5 or not.  
*/


package Operator;

import java.util.Scanner;

public class Practical_3_16_NOV {

	public static void main(String[] args) 
	{
		int num1,num2,num3,choice,num,number,result;
		Scanner sca = new Scanner(System.in);				//Accept input from the user

		System.out.println("1:Greater between 3 No ");
		System.out.println("2:Given no. is even or odd");
		System.out.println("3:Check the given character is vowel or not");
		System.out.println("4:Check the given no. is divisible by 5 or not ");
				
		System.out.println("Enter a Your Choice: ");
		choice=sca.nextInt();

		switch(choice)        
		{
			case 1: //Find out greater between 3 Numbers
				System.out.println("Enter a First number: ");
				num1=sca.nextInt();

				System.out.println("Enter a Second number: ");
				num2=sca.nextInt();

				System.out.println("Enter a Third number: ");
				num3=sca.nextInt();
				
				result = (num1>num2) ? (num1>num3?num1:num3) : (num2>num3?num2:num3);
				System.out.print("Greatest Number is :" + result );
			break;
			
			case 2: //Check the given no. is even or odd
				System.out.println("Enter Any number: ");
				num=sca.nextInt();
				
				if(num%2==0)
				{
					System.out.print("Given Number is EVEN :" );
				}
				else
				{
					System.out.print("Given Number is ODD :" );
				}
			break;

			case 3: //Check the given character is vowel or not
				char ch;
				System.out.println("Enter Any Character: ");
				ch=sca.next().charAt(0);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
				   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					System.out.println("Entered Character is Vowel...: ");
				}
				else
				{
					System.out.println("Entered Character is not a Vowel...: ");
				}
			break;
			
			case 4: //Check the given no. is divisible by 5 or not
				System.out.print("Enter Any number: ");
				number=sca.nextInt();
				
				if(number%5==0)
				{
					System.out.println("Entered  number is divisible by 5... ");
				}
				else
				{
					System.out.println("Entered  number is not divisible by 5... ");
				}
			break;
			
			default: System.out.println("Opps!!! Sorry , You entered Invaid Choice... ");
		}
	}

}
