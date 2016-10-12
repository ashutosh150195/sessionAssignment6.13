package com.java.assignmentsix.three.withsynchronized;

import com.java.assignmentsix.three.Banking;

public class WithdrawSynchronized extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			OnlineBankingApplicationSynchronized.withdraw(Banking.withdrawAmount);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}

}
