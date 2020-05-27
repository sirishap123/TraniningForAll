package com.exception;

import java.util.Scanner;

public class UserDefinedException extends Exception

{

	public static void main(String[] args) 
	
	{
		String str ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String : ");
		
		str= sc.nextLine();
		
		while (true) 
		{
			try 
			{
				if (str.length() != 10) 
				{
					throw new UserDefinedException();
				}

				else
				{
					System.out.println(str);

					break;
				}
			}

			catch (UserDefinedException e) 
			{

				e.printStackTrace();
			} 
		}
				
			
		}
	}


