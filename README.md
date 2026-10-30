Encapsulation

Practice programs for encapsulation in Java. Both keep their data private and let it change only through methods,i.e, controlled access.

Amazon Customer (practicingRealWorld)

Customer account with email, password and a wallet.

fields are private and the account id is final
setEmail() and setPassword() check the value and return true/false
no getter for the password, the only way to use it is verifyPassword() or passwordChange()
the wallet changes only through addMoney() and pay(), which reject negative amounts and overdrafts
the constructor falls back to safe values if the email or password is invalid


Bank Account (program_two)
Account with account number, holder name, balance and PIN.

all four fields are private, so similarly only public methods can access it(exposed to controlled access)
deposit() rejects negative amounts, withdraw() rejects zero, negative or more than the balance


How to run (from the src folder)
javac practicingRealWorld/*.java
java practicingRealWorld.Driver

javac BankAccount/*.java
java BankAccount.Driver
