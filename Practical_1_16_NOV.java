/* Q. Write a program to accept choice from the user and display the output.
 1.Arithmetic Operation 
2:Logical Operation
3:Relational Operation
4:Bitwise Operation 
5:Conditional Operation
6:Assignment Operation
*/

package Operator;

import java.util.Scanner;


public class Practical_1_16_NOV 
{

	public static void main(String[] args) 
	{
		int a,b,choice,result;
		Scanner sc = new Scanner(System.in);			//Accept input from the user
		System.out.println("Enter a First number: ");
		a=sc.nextInt();

		System.out.println("Enter a Second number: ");
		b=sc.nextInt();
				
		System.out.println("1:Arithmetic Operation ");
		System.out.println("2:Logical Operation");
		System.out.println("3:Relational Operation ");
		System.out.println("4:Bitwise Operation ");
		System.out.println("5:Conditional Operation ");
		System.out.println("6:Assignment Operation ");
				
		System.out.println("Enter a Your Choice: ");
		choice=sc.nextInt();

		switch(choice)
		{
			case 1: // Arithmetic Operators(+,_,*,/,%)
				result=a+b;
					System.out.println("Addition is " + result);
					result=a-b;
					System.out.println("Subtraction is " + result);
					result=a*b;
					System.out.println("Multiplication is " + result);
					result=a/b;
					System.out.println("Division is " + result);
					result=a%b;
					System.out.println("Modulo is " + result);
				break;
				
			case 2: //Logical Operators (&&, ||, !)
						
					System.out.println((a==b && a!=b));
					System.out.println((a==b || a!=b));
					System.out.println(!(a>b));
				break;
				
			case 3: //Relational Operators (==,!=,>=,<=,>,<)
					System.out.println(a==b);		
					System.out.println(a!=b);		
					System.out.println(a>=b);		
					System.out.println(a<=b);		
					System.out.println(a>b);		
					System.out.println(a<b);
				break;
				
			case 4: //Bitwise Operators (&, | , ^)
					result = (a & b);
					System.out.println("The Result is " + result);		// Logical AND
					result = (a | b);
					System.out.println("The Result is " + result);		// Logical OR
					result = (a ^ b);
					System.out.println("The Result is " + result);		// Logical XOR
				break;
				
			case 5: //Conditional Operators
				result=(a>b)?(a):(b);
				break;
				
			case 6: //Assignment Operators (+=,-=,*=,/=,%=,)
					a+=b;
					System.out.println("Result is : "+a);
						
					a-=b;
					System.out.println("Result is : "+a);		

					a*=b;
					System.out.println("Result is : "+a);		

					a/=b;
					System.out.println("Result is : "+a);		

					a%=b;
					System.out.println("Result is : "+a);
				break;
				
			default : System.out.println("Invalid Choice....");
				
		}

	}

}
