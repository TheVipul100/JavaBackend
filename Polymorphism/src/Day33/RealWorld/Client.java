//package com.kodewala.oops.polymorphism3;
package RealWorld;

public class Client {

	public static void main(String[] args) {

		PaymentProcessor paymentProcessor = new PaymentProcessor();

		// for the user#1, he/she selected payment method as a Credit Card
		CreditCardPayment cardPayment = new CreditCardPayment();

		paymentProcessor.processPayment(cardPayment);

		// for the user#2, he/she selected payment method as a netpayment
		NetBankingPayment netPayment = new NetBankingPayment();

		paymentProcessor.processPayment(netPayment);

		// for the user#2, he/she selected payment method as a upipayment
		UPIPayment upiPayment = new UPIPayment();

		paymentProcessor.processPayment(upiPayment);
	}

}
