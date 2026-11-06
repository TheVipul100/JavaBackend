//package com.kodewala.oops.polymorphism3;
package RealWorld;
public class NetBankingPayment extends Payment 
{
	@Override
	public void doPayment() 
	{
		System.out.println("NetBankingPayment.doPayment()....... NetBankingPayment ");
	}
}
