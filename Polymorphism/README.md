\# Java Polymorphism Practice



Small programs I wrote while learning polymorphism in Java: \*\*upcasting\*\*, \*\*downcasting\*\*, and \*\*runtime polymorphism\*\* (method overriding), with two "real world" style examples.



\## Project structure



```

auto\_upcasting/        upcasting + downcasting basics

&#x20; User.java            parent

&#x20; Admin.java           extends User

&#x20; Finance.java         extends Admin

&#x20; Driver.java          main(): upcasting / downcasting experiments



PolymorphismPract/     airline ticket pricing

&#x20; AirlineTicketing.java         parent, ticketingPrice()

&#x20; BusinessClass.java            overrides ticketingPrice()

&#x20; StandardClass.java            overrides ticketingPrice()

&#x20; FrequentClass.java            overrides ticketingPrice()

&#x20; AirlineTicketingProcess.java  single entry point: processingPrice(AirlineTicketing)

&#x20; Client.java                   main()



RealWorld/             payment processing

&#x20; Payment.java                  parent, doPayment()

&#x20; CreditCardPayment.java        overrides doPayment()

&#x20; DebitCardPayment.java         overrides doPayment()

&#x20; NetBankingPayment.java        overrides doPayment()

&#x20; UPIPayment.java               overrides doPayment()

&#x20; PaymentProcessor.java         single entry point: processPayment(Payment)

&#x20; Client.java                   main()

```



\## Concepts covered



\### 1. Upcasting (automatic)

A parent reference can point to a child object. No cast needed, because a child \*is-a\* parent.



```java

User uc = new Admin();      // upcasting

Admin aad = new Finance();  // Finance is-a Admin

```



\### 2. Downcasting (explicit)

Getting a child-type reference back from a parent-type reference. The cast is written by the programmer.



```java

User uc1 = new Admin();

Admin ar = (Admin) uc1;     // works: the object really is an Admin

```



Things to remember:

\- There is only \*\*one object\*\*. The cast changes the \*reference type\*, never the object.

\- The compiler only checks the \*\*reference type\*\*. The JVM checks the \*\*actual object\*\* at runtime.

\- `Admin ar1 = uc1;` (no cast) is a \*\*compile-time error\*\*.

\- `Admin ad = (Admin) new User();` \*\*compiles\*\*, but throws `ClassCastException` at runtime, because the object is a plain `User`.

\- Use `instanceof` before downcasting to stay safe.



\### 3. Runtime polymorphism

A method that takes a \*\*parent type\*\* can accept any child object (auto upcasting happens at the call). The overridden method that runs is decided by the \*\*actual object\*\* at runtime.



```java

public void processPayment(Payment payment) {

&#x20;   payment.doPayment();   // runs CreditCard / UPI / NetBanking version

}

```



\### 4. Design idea: one controlled entry point

Instead of calling `doPayment()` / `ticketingPrice()` directly on each object from outside, clients call a processor class (`PaymentProcessor`, `AirlineTicketingProcess`). If rules change later (validation, logging, receipts), only the processor changes and the callers stay untouched.



\## How to run



From the project root:



```bash

javac -d out auto\_upcasting/\*.java PolymorphismPract/\*.java RealWorld/\*.java



java -cp out auto\_upcasting.Driver

java -cp out PolymorphismPract.Client

java -cp out RealWorld.Client

```



> The `main` methods in `auto\_upcasting.Driver` and `PolymorphismPract.Client` are declared as `static void main(String\[] args)` (no `public`). That launches on \*\*Java 25\*\* or newer. On older versions, change them to `public static void main(String\[] args)`.



\## Expected output



`auto\_upcasting.Driver`

```

10

```



`PolymorphismPract.Client`

```

Ticketing price of Business class........

Ticketing price of Standard class........

Ticketing price of Frequent flyer........

```



`RealWorld.Client`

```

CreditCardPayment.doPayment()....... CreditCardPayment 

NetBankingPayment.doPayment()....... NetBankingPayment 

UPIPayment.doPayment()....... UPIPayment 

```



\## Key takeaway



> The compiler checks the \*\*reference\*\*. The JVM checks the \*\*object\*\*.

