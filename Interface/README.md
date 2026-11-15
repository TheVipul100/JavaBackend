# Java Interfaces Practice

Three small projects I built to understand Java interfaces.

## What's inside

| Package | What it shows |
|---------|---------------|
| `account` | One interface (`IAccount`) with three implementations: `SavingsAcc`, `CurrentAcc`, `FixedDeposit`. Covers upcasting, downcasting and constants in interfaces |
| `bankingService` | One class (`Customer`) implementing two interfaces (`IBankService`, `ILoanService`) |
| `discountOnServices` | An interface extending another interface (`IPropertyTax extends IDiscount`), used by `FlightBooking` |
| `payment` | Interface with a default method, abstract base class, `CardPayment` and `UpiPayment` extending it |

## Key takeaways
- An interface says *what* to do, the class decides *how*.
- `IAccount account = new SavingsAcc()` is upcasting. The calling code only sees interface methods.
- To call a child-only method like `sett()`, downcast first: `SavingsAcc save = (SavingsAcc) account;`
- `MIN_BALANCE` is a constant because interface fields are `public static final`.
- `SavingsAcc` blocks withdrawals below the minimum balance. `CurrentAcc` only blocks overdrafts. `FixedDeposit` blocks deposits and withdrawals completely. Same interface, different behaviour.
- A class can implement two interfaces. If both declare `deposit(int)`, one method in the class satisfies both.
- `FlightBooking` implements only `IPropertyTax` and still has to implement `IDiscount`'s methods, because `IPropertyTax` extends it.
- A `default` method lets an interface hold shared logic. `pay()` is written once, and each class supplies its own `calculateFee()` and `debit()`.

## Project structure
```
src/
├── account/
│   ├── IAccount.java
│   ├── SavingsAcc.java
│   ├── CurrentAcc.java
│   ├── FixedDeposit.java
│   └── Client.java
├── bankingService/
│   ├── IBankService.java
│   ├── ILoanService.java
│   ├── Customer.java
│   └── Client.java
├── discountOnServices/
│   ├── IDiscount.java
│   ├── IPropertyTax.java
│   ├── FlightBooking.java
│   ├── CabBooking.java
│   └── Driver.java
└── payment/
    ├── IPaymentMethod.java
    ├── BasePayment.java
    ├── CardPayment.java
    ├── UpiPayment.java
    ├── Wallet.java   (placeholder)
    └── Client.java
```

## How to run
From inside the `src` folder:
```bash
# account
javac account/*.java
java account.Client

# bankingService
javac bankingService/*.java
java bankingService.Client

# discountOnServices
javac discountOnServices/*.java
java discountOnServices.Driver

# payment
javac payment/*.java
java payment.Client
```

## Requirements
Java 8 or above.
The `payment` package needs Java 9 or above (private method in an interface).

## Things I got wrong along the way
- My minimum-balance check was always true, so it never blocked a withdrawal.
- `checkBalance()` in `SavingsAcc` always returned 0.
- I wrote a comment about a compile error that didn't exist.

## What's next
- Exception handling, so `FixedDeposit` can reject deposits properly instead of just printing a message.
- Default and static methods in interfaces.
- Implement `Wallet` as a third payment method

Feedback welcome. I'm still learning.