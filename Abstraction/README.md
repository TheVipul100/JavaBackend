# Abstraction in Java

Small programs I wrote while learning abstraction in Java. The idea in both: hide the core steps inside the class and expose only the method the outside world needs.

## Project structure

```
Abstraction/
├── README.md
├── .gitignore
└── src/
    ├── abstractionPrac/     # report generator
    │   ├── ReportGenerator.java
    │   ├── PdfReport.java
    │   ├── ExcelReport.java
    │   ├── CsvReport.java
    │   └── Client.java
    └── abstraction/         # food order
        ├── Order.java
        └── Driver.java
```

## 1. Report generator (`abstractionPrac`)

`ReportGenerator` is an abstract class. Its public method `generate()` runs three steps in a fixed order:

1. `fetchData()` is private. It validates the input and returns `false` for null or empty data.
2. `formatData()` is abstract. Each child (`PdfReport`, `ExcelReport`, `CsvReport`) decides how to format.
3. `save()` is private.

`generate()` is `final`, so no child can change the order of the steps. The class is abstract, so `new ReportGenerator()` won't compile.

## 2. Food order (`abstraction`)

`Order.placeOrder()` is the only public method. The steps behind it (`orderNumber()`, `dish()`, `pay()`) are private, so `Driver` can't call them directly.

## How to run

Open a terminal in the `src` folder, then:

```bash
# report generator
javac abstractionPrac/*.java
java abstractionPrac.Client

# food order
javac abstraction/*.java
java abstraction.Driver
```

On Windows Command Prompt, use backslashes in the `javac` paths (`abstractionPrac\*.java`).

Sample output for the food order:

```
Order @123 placed by Vipul
Preparing dish: Kadhai Paneer
Amount to be paid..300
```

## Concepts covered

- Abstract classes and abstract methods
- Hiding implementation with `private`
- Locking the flow of steps with `final`
- Exposing only what the outside world needs

## Requirements

- JDK 8 or higher
