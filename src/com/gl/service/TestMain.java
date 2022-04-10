package com.gl.service;

import com.gl.solution.CurrencyDenominator;
import com.gl.solution.PayMoney;

public class TestMain {

	public static void main(String[] args) {
		
		PayMoney payMoney = new PayMoney();
		payMoney.acceptPayMoneyInputs();
		payMoney.processTransactions();
		
		CurrencyDenominator currency = new CurrencyDenominator();
		currency.acceptDenominationInputs();
		currency.calculateMinPayment();
	}

}
