\# Java Interfaces Practice



Three small projects I built to understand Java interfaces.



\## What's inside



| Package | What it shows |

|---------|---------------|

| `account` | One interface (`IAccount`) with three implementations: `SavingsAcc`, `CurrentAcc`, `FixedDeposit`. Covers upcasting, downcasting and constants in interfaces |

| `bankingService` | One class (`Customer`) implementing two interfaces (`IBankService`, `ILoanService`) |

| `discountOnServices` | An interface extending another interface (`IPropertyTax extends IDiscount`), used by `FlightBooking` |



\## Key takeaways

\- An interface says \*what\* to do, the class decides \*how\*.

\- `IAccount account = new SavingsAcc()` is upcasting. The calling code only sees interface methods.

\- To call a child-only method like `sett()`, downcast first: `SavingsAcc save = (SavingsAcc) account;`

\- `MIN\_BALANCE` is a constant because interface fields are `public static final`.

\- `SavingsAcc` blocks withdrawals below the minimum balance. `CurrentAcc` only blocks overdrafts. `FixedDeposit` blocks deposits and withdrawals completely. Same interface, different behaviour.

\- A class can implement two interfaces. If both declare `deposit(int)`, one method in the class satisfies both.

\- `FlightBooking` implements only `IPropertyTax` and still has to implement `IDiscount`'s methods, because `IPropertyTax` extends it.



\## Project structure

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

└── discountOnServices/

&#x20;   ├── IDiscount.java

&#x20;   ├── IPropertyTax.java

&#x20;   ├── FlightBooking.java

&#x20;   ├── CabBooking.java

&#x20;   └── Driver.java

```



\## How to run

From inside the `src` folder:

```bash

\# account

javac account/\*.java

java account.Client



\# bankingService

javac bankingService/\*.java

java bankingService.Client



\# discountOnServices

javac discountOnServices/\*.java

java discountOnServices.Driver

```



\## Requirements

Java 8 or above.



\## Things I got wrong along the way

\- My minimum-balance check was always true, so it never blocked a withdrawal.

\- `checkBalance()` in `SavingsAcc` always returned 0.

\- I wrote a comment about a compile error that didn't exist.



\## What's next

\- Exception handling, so `FixedDeposit` can reject deposits properly instead of just printing a message.

\- Default and static methods in interfaces.



Feedback welcome. I'm still learning.

