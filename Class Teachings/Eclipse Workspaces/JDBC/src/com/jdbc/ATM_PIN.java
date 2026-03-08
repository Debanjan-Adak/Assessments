package com.jdbc;

import java.util.Scanner;

class WrongPinException extends RuntimeException{


	public WrongPinException(String message)
	{
		
		super(message);
	}
}

public class ATM_PIN {

	
	public static void main(String[] args) throws WrongPinException  {
		String pass ="12345678";
		Scanner sc = new Scanner(System.in);
//		int count=3;
		try {
		
			System.out.println("Enter Your Password : ");
			String temp = sc.nextLine();
			if(temp.equals(pass))
			{
			
				System.out.println("You Have successfully logged in");
			
			}
			else
			{
				System.out.println("Wrong Password, Please try again ");
				throw new WrongPinException("");
//				
			}
		}
		catch(WrongPinException e){
			try {
				
				System.out.println("Enter Your Password : ");
				String temp = sc.nextLine();
				if(temp.equals(pass))
				{
				
					System.out.println("You Have successfully logged in");
				
				}
				else
				{
					System.out.println("Wrong Password, Please try again ");
					throw new WrongPinException("Please attempt 24 hours later again");
//					
				}
			}
			catch (WrongPinException e1)
			{
				e1.getMessage();
			}
			
			
			
		}
				
			
		}
	}


