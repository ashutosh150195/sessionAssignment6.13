package com.java.assignmentsix.three.withsynchronized;

import com.java.assignmentsix.three.Banking;

public class OnlineBankingApplicationSynchronized {
	
	public static synchronized void deposit(int depositAmount){
		for (int i = 0; i < Byte.MAX_VALUE; i++) {
			System.out.println("OnlineBankingApplicationSynchronized deposit data methods invoke");
			Banking.balance = Banking.balance + depositAmount;
		}
		
	}
	
	public static synchronized void withdraw(int withdrawAmount){
		for (int i = 0; i < Byte.MAX_VALUE; i++) {
			System.out.println("OnlineBankingApplicationSynchronized withdraw data methods invoke");
			if (withdrawAmount < Banking.balance) {
				Banking.balance = Banking.balance - withdrawAmount;
			} else {
				System.out.println("Invaild Amount..");
			}
		}
		
	}
	
}
