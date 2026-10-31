# Inheritance in Java

Practice programs for the **Inheritance** module (Java OOP), organised as one package per program.

## Structure

```
src/
├── Netflix_Subscription/   Single-level inheritance + method overriding
├── program_one/            Multilevel inheritance
└── program_two/            Multilevel & hierarchical inheritance, method/variable hiding
```

## Programs

### Netflix_Subscription
`Subscription` is the parent class. `BasicPlan`, `StandardPlan` and `ProPlan` extend it and override
`getMaxScreens()`, `getVideoQuality()` and (Standard/Pro) `calculateYearlyCost()` to apply yearly discounts.
`Driver` creates each plan and prints its details.

### program_one
Multilevel chain: `Account` -> `SavingsAccount` -> `SrCitAccount` -> `PensionAccount`,
each overriding `openAccount(...)`. Notes on the disadvantages of inheritance (tight coupling, is-a vs has-a) are in the comments.

### program_two
- `CurrentAccount` -> `Type` (multilevel)
- `CitBelowSixty` and `SrCit` both extend `Account` (hierarchical, in `Pin.java`)
- `Driver.java` demonstrates **method hiding** (static methods, static binding) and **variable hiding**
  using `Account` and `OpenSaving`.

## Concepts Covered

| Concept | Where to look |
|---|---|
| Single inheritance | `Netflix_Subscription/` (`BasicPlan`, `StandardPlan`, `ProPlan` extend `Subscription`); `program_two/Driver.java` (`OpenSaving` extends `Account`) |
| Constructor chaining (`super(...)`) | `Netflix_Subscription/BasicPlan.java`, `StandardPlan.java`, `ProPlan.java` |
| Method overriding (dynamic binding) | `Netflix_Subscription/` (`getMaxScreens`, `getVideoQuality`, `calculateYearlyCost`); `program_one/Account.java` (`openAccount`) |
| Extending parent behavior with `super.method()` | `StandardPlan.calculateYearlyCost()`, `ProPlan.calculateYearlyCost()` |
| Multilevel inheritance | `program_one/Account.java` (`Account` -> `SavingsAccount` -> `SrCitAccount` -> `PensionAccount`); `program_two/CurrentAccount.java` (`CurrentAccount` -> `Type`) |
| Hierarchical inheritance | `program_two/Pin.java` (`CitBelowSixty` and `SrCit` both extend `Account`) |
| Method hiding (static methods, static binding) | `program_two/Driver.java` (`Account.firstMethod()` vs `OpenSaving.firstMethod()`) |
| Variable hiding (`this.a` vs `super.a`) | `program_two/Driver.java` (`Account.a` and `OpenSaving.a`) |
| Upcasting / parent reference to child object | `program_two/Driver.java` (`Account acc = new OpenSaving();`) |
| Disadvantages of inheritance, is-a vs has-a | Comments at the bottom of `program_one/Account.java` |

## Run

From the project root:

```bash
mkdir -p out
javac -d out src/Netflix_Subscription/*.java
java -cp out Netflix_Subscription.Driver

javac -d out src/program_one/*.java
java -cp out program_one.Driver

javac -d out src/program_two/*.java
java -cp out program_two.Driver
```

Or open the folder in IntelliJ IDEA and mark `src` as the Sources Root.
