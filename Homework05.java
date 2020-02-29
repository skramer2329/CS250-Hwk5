/*Sabrina Kramer
 * CS 250 - 401
 * Homework05.java
 * 
 * This program gets string from user and checks
 * if user input follows format of (ddd)(ddd)...(ddd)
 * Where 'd' is a digit from [0 - 9]
 * 
 */

import java.util.Scanner;

public class Homework05 
{
	public static void main(String [] args)
	{
		Scanner stdId = new Scanner(System.in);
		System.out.println("Please enter a string (ddd)(ddd)...(ddd)");
		String userInput = stdId.nextLine();
		char test1 = '(';													//test1 and test2 are comparison char to make sure only parenthesis are used
		char test2 = ')';													
		int i = 0;
		int stringLength = userInput.length(); 								//turns user input into an integer for loop
		
		while(i < stringLength)
		{
						
			if((i % 5 == 0) && (userInput.charAt(i) == test1))				//checks if input equals '(' char
			{
				++i;														//if correct char, increments to next index in String
			}
			
			else if((i % 5 == 4) && (userInput.charAt(i) == test2))			//checks if input equals ')' char
			{
				++i;														
			}
			
			else if(((i % 5) != 0) && ((i % 5) != 4))						//if not '(' and ')', then check to see if char at index i is a digit
			{
				if(Character.isDigit(userInput.charAt(i)) == true)
				{
					++i;
				}
				else
				{
					System.out.println(userInput + " is not valid.");		//if char at index i != digit [0-9], then prints <userInput> is not valid.
					break;
				}
			}
			
			else
			{
				System.out.print(userInput + " ...is not valid.");			//if '(' is not used, then prints not valid
				break;
			}
			
			if (i == stringLength -1)
			{
				System.out.println(userInput + " is valid.");				//if i makes loops through entire string w/out errors, prints to screen <userInput> is valid.
			}
			
		}
		stdId.close();
	}
	
}
