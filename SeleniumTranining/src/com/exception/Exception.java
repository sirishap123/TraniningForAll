package com.exception;


import java.util.Scanner;

public class Exception 

{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		Scanner sc = new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter the nr value : ");
			nr = sc.nextInt();
			System.out.println("Enter the dr Value :");
			dr = sc.nextInt();
			
			try 			
			{
				result = nr / dr;
				System.out.println(result);
				break;
			}			
			
			
			catch (ArithmeticException e) 
			{				
				e.printStackTrace();
				
				System.out.println(e);				
			}
			
			finally {
				
				System.out.println( "i am final.");
			}
		
		}
		
		
	}

}
