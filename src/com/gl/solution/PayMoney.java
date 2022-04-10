package com.gl.solution;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class PayMoney {

	int transactionsSize;
	LinkedList<Integer> transactionValues;
	int totalTargets;
	Scanner scanner;

	public PayMoney() {
		transactionsSize = 0;
		totalTargets=0;
		transactionValues = new LinkedList<>();
		scanner = new Scanner(System.in);
	}

	public void acceptPayMoneyInputs() {
		System.out.println("Enter the size of transaction array:");
		transactionsSize = scanner.nextInt(); 
		System.out.println("Enter the values of array: ");
		for (int i = 0; i < transactionsSize; i++) {
			transactionValues.add(scanner.nextInt());
		}
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		totalTargets = scanner.nextInt();
	}

	public void processTransactions() {
		for (int i = 0; i < totalTargets; i++) {
			System.out.println("Enter the value of target ");
			int targetValue = scanner.nextInt();
			int transcationCountAcheived = getTargetAcheived(targetValue); 
			if (transcationCountAcheived == 0)
				System.out.println("Given target is not achieved ");
			else
				System.out.println("Target achieved after " + transcationCountAcheived + " transactions");

		}
	}

	// This returns the Target achieved after 'X' transactions
	public int getTargetAcheived(int targetValue) {
		int transactionamount = 0;		
		Iterator<Integer> it = transactionValues.iterator();
		for(int i=0;it.hasNext();i++) {
			transactionamount +=  it.next().intValue();
			if(transactionamount >= targetValue)
				return i+1;
		}
		return 0;
	}

}

 /*  Impemented using Arrays */ 
//public class PayMoney {
//		
//	int transactionsSize=0;
//	int transactionValues[];
//	int totalTargets= 0;
// 	
//	public void  takeInputs() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the size of transaction array:");
//		transactionsSize = scanner.nextInt();
//		System.out.println("Enter the values of array: ");
//		transactionValues = new int[transactionsSize];		
//		for(int i=0;i<transactionsSize;i++) {
//			transactionValues[i] = scanner.nextInt();
//		}
//		System.out.println("Enter the total no of targets that needs to be achieved: ");
//		totalTargets = scanner.nextInt();
//		
//		for(int i=0;i<totalTargets;i++) {
//			System.out.println("Enter the value of target ");
//			int targetValue = scanner.nextInt();
//			int transcationCountAcheived = getTargetAcheived(targetValue);
//			if( transcationCountAcheived == 0)
//				System.out.println("Given target is not achieved ");
//			else
//			System.out.println("Target achieved after " +   transcationCountAcheived + " transactions");
//		}		
//		
//	}
//	
//	// This returns the Target achieved after 'X' transactions 
//		public int getTargetAcheived(int targetValue) {
//			int transactionCount = 0;
//			for(int i=0;i<transactionValues.length;i++) {
//				transactionCount += transactionValues[i];
//				if(transactionCount >= targetValue)
//					return i+1;
//			}
//			return 0;
//		}
//	
//}
