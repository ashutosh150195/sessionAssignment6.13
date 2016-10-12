package com.java.assignmentsix.three.withoutsynchronized;

import com.java.assignmentsix.three.Banking;

public class OnlineBankingApplication {
	
	public static void deposit(int depositAmount){
		for (int i = 0; i < Byte.MAX_VALUE; i++) {

			System.out.println("OnlineBankingApplication deposit data methods invoke");
			Banking.balance = Banking.balance + depositAmount;
		}
	}
	
	public static void withdraw(int withdrawAmount){
		for (int i = 0; i < Byte.MAX_VALUE; i++) {
			System.out.println("OnlineBankingApplication withdraw data methods invoke");
			if (withdrawAmount < Banking.balance) {
				Banking.balance = Banking.balance - withdrawAmount;
			} else {
				System.out.println("Invaild Amount..");
			}
		}
		
	}

}
