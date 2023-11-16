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
		int a,b,c,choice,e,f,result;
		Scanner sca = new Scanner(System.in);

		System.out.println("1:Greater between 3 No ");
		System.out.println("2:Given no. is even or odd");
		System.out.println("3:Check the given character is vowel or not");
		System.out.println("4:Check the given no. is divisible by 5 or not ");
				
		System.out.println("Enter a Your Choice: ");
		choice=sca.nextInt();

		switch(choice)
		{
			case 1: 
				System.out.println("Enter a First number: ");
				a=sca.nextInt();

				System.out.println("Enter a Second number: ");
				b=sca.nextInt();

				System.out.println("Enter a Third number: ");
				c=sca.nextInt();
				
				result = (a>b) ? (a>c?a:c) : (b>c?b:c);
				System.out.print("Greatest Number is :" + result );
			break;
			
			case 2: 
				System.out.println("Enter Any number: ");
				e=sca.nextInt();
				
				if(e%2==0)
				{
					System.out.print("Given Number is EVEN :" );
				}
				else
				{
					System.out.print("Given Number is ODD :" );
				}
			break;

			case 3: 
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
			
			case 4: 
				System.out.println("Enter Any number: ");
				f=sca.nextInt();
				
				if(f%5==0)
				{
					System.out.println("Entered  number is divisible by 5... ");
				}
				else
				{
					System.out.println("Entered  number is not divisible by 5... ");
				}
			break;
			
			default: System.out.println("Opps! Soory , You entered Invaid Choice... ");
		}
	}

}
