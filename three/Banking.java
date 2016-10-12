package com.java.assignmentsix.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.java.assignmentsix.three.withoutsynchronized.Deposit;
import com.java.assignmentsix.three.withoutsynchronized.Withdraw;

public class Banking {

	public static BufferedReader br ;
	public static String input ;
	public static int balance = 72 , depositAmount , withdrawAmount ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		
		Deposit deposit = new Deposit(); 
		Withdraw withdraw = new Withdraw();

			deposit.start();
			withdraw.start();
					
	}

	private static void input() {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter DepositAmount : ");
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		depositAmount = Integer.parseInt(input);
		
		System.out.println("Enter WithdrawAmount : ");
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		withdrawAmount = Integer.parseInt(input);
		
	}

}
