package com.java.assignmentsix.three.withsynchronized;

import com.java.assignmentsix.three.Banking;

public class DepositSynchronized extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
			OnlineBankingApplicationSynchronized.deposit(Banking.depositAmount);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
