package com.java.assignmentsix.three.withoutsynchronized;

import com.java.assignmentsix.three.Banking;

public class Withdraw extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub

			OnlineBankingApplication.withdraw(Banking.withdrawAmount);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
