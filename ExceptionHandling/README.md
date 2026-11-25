\# Day 44: Exception Handling (Java)



My practice code for exception handling basics. The comments in the files are my own notes while learning, so I left them in as they are.



\## What I learned



\- `try`, `catch` and `finally`, and how they behave when nested

\- Why `finally` runs even when `try` or `catch` has a `return`

\- A try-catch \*\*inside\*\* a loop skips one bad item. A try-catch \*\*outside\*\* the loop stops the whole loop.

\- If `finally` throws, it hides the original exception

\- An empty file does not throw anything, `readLine()` just returns `null`

\- Always check `br != null` before closing, or a `NullPointerException` can hide the real `FileNotFoundException`



\## Files



| File | What it has |

|---|---|

| `Client.java` | Nested try-catch-finally, with a catch inside a catch |

| `Practice1.java` | Rethrowing, and an exception thrown from `finally` |

| `ReadingFile.java` | Reads a CSV file with `BufferedReader` and adds up quantity × price, skipping bad lines |

| `Driver.java` | Basic exceptions: `ArithmeticException` and `NullPointerException` are caught, `ArrayIndexOutOfBoundsException` and `NumberFormatException` are left uncaught on purpose (see the comments in the file) |

| `revise.txt` | Sample data for `ReadingFile` (format: `item,quantity,price`) |



Note: `Driver.java` uses `package day44;` while the other files use `package day44.PracticeSet;`. I haven't changed this yet.



\## How to run



These files use `static void main` without `public`, so they need a recent JDK (I used JDK 25).



\### `ReadingFile`



It takes 3 program arguments, separated by \*\*spaces\*\* (not commas):



```

<path-to-revise.txt> <number> <amount>

```



Example:



```

"E:\\Java Backend\\ExceptionHandling\\src\\day44\\PracticeSet\\revise.txt" 132435 2000

```



\- Use quotes around the path only if it has a space in it.

\- In IntelliJ: Run Configuration → Program arguments.

\- Try a wrong path, a text value like `12a` for the number, or no arguments at all, to see each exception being handled.



\### `Driver`



It takes 2 program arguments: a name and an integer for marks.



```

vipul 90

```



Passing no arguments gives `ArrayIndexOutOfBoundsException`, and passing text instead of the number gives `NumberFormatException`. Neither is caught, so the program crashes with a stack trace, which is the point of that file.



\## Next



Custom exceptions (checked and unchecked), try-with-resources, suppressed exceptions and multi-catch.



\---



\*Practiced with AI help for questions and code review. I rewrote, ran and tested the code myself.\*

