//package com.kodewala.oops.polymorphism3;
package RealWorld;
public class PaymentProcessor 
{
  public void processPayment(Payment payment) // can accept any type of Payment(CreditCard, DebitCard etc) object
  {
//	  Payment payment = new NetBankingPayment();
	  payment.doPayment(); // Polymorphism  // Payment payment = new NetBankingPayment();
  }
}

//Good design is what your sir is teaching:
// the outside world should talk to one controlled entry point (processPayment) and not call doPayment() directly on each object.


//Why exposing only processPayment is better?
//
//If clients call cardPayment.doPayment() directly, they take responsibility for everything around it: validation, logging, receipts
// and so on. If doPayment() is the only thing exposed, any rule change means editing every caller. With PaymentProcessor, the clients
// only know “give me a payment, I’ll process it.” You can add steps before or after doPayment() later without touching any client code.