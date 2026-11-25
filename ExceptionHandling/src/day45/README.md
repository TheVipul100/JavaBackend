\# Day 45: Exception Handling (continued)



More practice on exception handling. The comments in the files are my own notes while learning, so I left them in as they are.



\## What I learned



\- With several `catch` blocks, the \*\*specific\*\* exceptions go first and the parent (`Exception`) goes last. If the parent comes first, the code does not compile.

\- Only the \*\*first matching\*\* catch runs. The rest of the `try` block after the failing line is skipped.

\- Catching an exception inside the method where it happens (here a `NullPointerException`) lets the program carry on and finish the method normally.

\- `e.printStackTrace(System.out)` prints the stack trace on the same stream as `println`, so the console order is correct in any IDE.

\- `return` in `try`/`catch` saves the value first, and `finally` runs afterwards. The caller gets the saved value.

\- An exception thrown inside `finally` replaces the original one, and `getSuppressed().length` stays 0 because a plain `finally` never adds suppressed exceptions.



\## Files



| File | What it has | Expected output |

|---|---|---|

| `Driver.java` | `NullPointerException` caught inside `validateAccount()` when a null account number is passed | The start/end lines, the stack trace in between, and `Account.doValidate().....end` |

| `Driver1.java` | Multiple catch blocks in the correct order, with `finally` | `Invalid number: For input string: "abc"` then `Always runs` |

| `Practice/Driver.java` | Nested `try`/`catch`/`finally` with a `return` | `F1 4`, `F2 5`, `3` |

| `Practice/Practice2.java` | Exception thrown from `finally` replacing the one from `catch` | `caught C`, then `0` |



In `Driver1.java`, the `NumberFormatException` is thrown on the first risky line, so the lines after it (`arr\[5] = 10 / 0;` and `s.length();`) never run. The other catch blocks are there for practice.



\## How to run



No program arguments are needed. Run each file's `main` method. `Driver.java` and `Practice/Driver.java` use `static void main` (with `public` missing on some of them), so a recent JDK is needed (I used JDK 25).



\## Next



Custom exceptions (checked and unchecked), try-with-resources, suppressed exceptions and multi-catch.





