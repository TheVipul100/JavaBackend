\# Java Interfaces Practice



Hands-on examples of Java interface features, from basic abstract methods to default, static and private methods, functional interfaces with lambdas, and the `Cloneable` marker interface.



Each folder is a small, runnable example that focuses on one idea.



\## Requirements



\- Java \*\*11 or newer\*\* (private interface methods need Java 9, `String.isBlank()` needs Java 11)

\- No build tool needed, only `javac` and `java`



\## Project structure



```

.

├── Day38/Booking/                          Default, static and private interface methods

│   ├── IBooking.java

│   ├── FlightBooking.java

│   ├── TrainBooking.java

│   └── BusBooking.java

├── StudentManagementSystem/                Interface inheritance and X.super.method()

│   ├── IStudentManagement.java

│   ├── IFeePayment.java

│   ├── Student.java

│   ├── Teacher.java

│   ├── Admin.java

│   └── Driver.java

├── Excercise/                              Class vs anonymous class vs lambda

│   ├── greeter.java

│   └── Cons.java

└── TypesOfInterface\_and\_lambda/

&#x20;   ├── Day39/                              Marker interface (Cloneable), shallow vs deep copy

&#x20;   │   ├── Address.java                    (contains Address and Person)

&#x20;   │   └── Driver.java

&#x20;   └── Day40/                              Functional interface and lambda expression

&#x20;       ├── IAccount.java

&#x20;       ├── IAccountMgmt.java

&#x20;       └── Driver.java

```



\## Concepts covered



| Concept | Since | Where |

|---|---|---|

| Abstract methods and polymorphism through an interface | Java 1.0 | `Day38/Booking/IBooking` |

| \*\*Default methods\*\*: optional behaviour that can be added without breaking implementers | Java 8 | `IBooking.autoUpgrade()`, overridden in `TrainBooking` |

| \*\*Static interface methods\*\*: utilities called on the interface (not inherited) | Java 8 | `IBooking.printTicket()`, used in `FlightBooking` |

| \*\*Private interface methods\*\*: share code between default methods | Java 9 | `IBooking.connectDb()`, `IStudentManagement.percentage()` |

| Interface extending another interface | Java 1.0 | `StudentManagementSystem/IFeePayment` |

| `Interface.super.method()` to call a default method | Java 8 | `Student`, `Teacher` |

| \*\*Functional interface\*\* (`@FunctionalInterface`, SAM) | Java 8 | `Day40/IAccount`, `Excercise/greeter` |

| \*\*Lambda expression\*\* | Java 8 | `Day40/Driver`, `Excercise/Cons` |

| Anonymous class vs lambda | Java 8 | `Excercise/Cons` |

| \*\*Marker interface\*\* (`Cloneable`) | Java 1.0 | `Day39/Address.java` (`Person`) |

| Shallow copy vs deep copy | Java 1.0 | `Day39/Driver` |



\## Types of interface



| Type | Abstract methods | Example |

|---|---|---|

| Normal interface | any number | `IBooking`, `IStudentManagement` |

| Functional interface | exactly one | `IAccount`, `greeter` |

| Marker interface | none | `Cloneable`, `Serializable` |

| Nested interface | declared inside a class or interface | `Map.Entry` |



\## How to build and run



Run these commands from the repository root (the folder that contains `Day38`, `StudentManagementSystem`, and so on).



\*\*Compile everything\*\*



```bash

\# Linux / macOS / Git Bash

mkdir -p out

javac -d out $(find . -name "\*.java")

```



```powershell

\# Windows PowerShell

mkdir out -Force

javac -d out (Get-ChildItem -Recurse -Filter \*.java).FullName

```



\*\*Run an example\*\*



| Example | Command |

|---|---|

| Booking (default / static / private methods) | `java -cp out Day38.Booking.IBooking` |

| Student management | `java -cp out StudentManagementSystem.Driver` |

| Class vs anonymous class vs lambda | `java -cp out Excercise.Cons` |

| Shallow vs deep copy | `java -cp out TypesOfInterface\_and\_lambda.Day39.Driver` |

| Functional interface and lambda | `java -cp out TypesOfInterface\_and\_lambda.Day40.Driver` |



> `IBooking` contains the `main` method for the booking example, because members of an interface are implicitly `public`.



\## Expected output



\*\*Day39: shallow vs deep copy\*\*

```

20 Pune

99

Delhi

Delhi

```

\- Line 1: the primitive `age` of the clone is independent.

\- Line 2: `p3 = p1` is not a copy, it is the same object.

\- Line 3: a shallow copy shares the `Address` object, so changing the clone's city changes the original.

\- Line 4: a deep copy has its own `Address`, so the original stays `Delhi`.



\*\*Excercise: three ways to implement one interface\*\*

```

Class version:  100

anonymous class version: 200

Lambda version : 300

```



\*\*StudentManagementSystem\*\*

```

pass

lunch time

pass

vipul is present

present

Pay fee: 30000

```



\## Key takeaways



1\. A \*\*default method\*\* lets you add behaviour to an interface without breaking existing classes. A class can override it when it needs different behaviour (`TrainBooking`).

2\. \*\*Static interface methods are not inherited.\*\* Call them as `IBooking.printTicket(...)`, never through a class or an object.

3\. A \*\*private interface method\*\* removes duplicated code between default methods and stays hidden from implementers.

4\. If two interfaces supply the same default method, the class must override it and choose with `InterfaceName.super.method()`.

5\. A \*\*functional interface\*\* has exactly one abstract method plus any number of default and static methods. It can be implemented with a lambda.

6\. Interface methods are implicitly `public`, so an implementing class cannot reduce the visibility ("weaker access privileges" error).

7\. `Object.clone()` makes a \*\*shallow copy\*\*. Mutable fields are shared unless you copy them yourself (`deepCopy()`).



\## Notes



\- `Teacher` and `Admin` use simplified attendance logic (one fixed student and one fixed admin) to keep the focus on interface features.

\- These are practice examples written while learning, not production code.

