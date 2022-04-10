package com.gl.solution;

import java.util.Scanner;
import java.util.Arrays;
 
 
public class CurrencyDenominator {
	
	int denominationsSize =0;
	int currencyNotes[];
    int currencyCounter[];
	int amountToPay=0;
	
	public void  acceptDenominationInputs() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		denominationsSize = scanner.nextInt();
		System.out.println("Enter the currency denominations value ");
		
		currencyNotes = new int[denominationsSize];		
		currencyCounter= new int[denominationsSize];	
		for(int i=0;i<denominationsSize;i++) {
			currencyNotes[i] = scanner.nextInt();
		}		 
 		
		System.out.println("Enter the amount you want to pay ");
		amountToPay = scanner.nextInt();
		calculateMinPayment();
	}
	
	public void calculateMinPayment() {
		Arrays.sort(currencyNotes);
		
		for (int i = currencyNotes.length-1; i >=0; i--) {
            if (amountToPay >= currencyNotes[i]) {
            	currencyCounter[i] = amountToPay / currencyNotes[i];
                amountToPay = amountToPay - currencyCounter[i] * currencyNotes[i];
            }
        }
      
        // Print notes
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = currencyCounter.length-1; i >=0; i--) {
            if (currencyCounter[i] != 0) {
                System.out.println(currencyNotes[i] + " : "
                    + currencyCounter[i]);
            }
        }
	}
}
