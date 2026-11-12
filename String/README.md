# Java String Practice

Small, self-contained programs I wrote while learning how Strings work in Java: the String Constant Pool (SCP), heap objects, `==` vs `equals()`, `intern()`, compile-time constants, and concatenation. Most files have my own study notes in the comments.

## Topics covered

- String literals vs `new String(...)`
- The String Constant Pool (SCP) vs the heap
- `==` (reference comparison) vs `.equals()` (content comparison)
- `intern()` and how it returns the pooled reference
- Compile-time constant folding (`"a" + "b"` becomes `"ab"`)
- `final` variables and what counts as a constant expression
- Runtime concatenation with `+` and `concat()`
- Why `StringBuilder` is better than `+=` in loops

## Files

| File | What it demonstrates |
|------|----------------------|
| `Strin.java` | Basics of literal vs `new String(...)`. Compares `s1`, `s3`, and `s4` with `==` and `equals()`. A `new String("Anything")` creates a heap object even when the literal already exists in the SCP. |
| `Strin1.java` | Simple concatenation using `+` and `concat()`. |
| `Strin2.java` | Compile-time optimization of `"This is" + " Kodewala" + " Academy"` into one literal. Notes on how `+` on variables works at runtime and how `intern()` links a heap string back to the pool. Much of it is commented-out experiments. |
| `StringLiteral.java` | Constant expressions. Shows when `+` is folded at compile time (both operands are literals or `final` variables with constant initializers) and when it builds a new heap object (plain variables, `final` values from a method call, or blank finals assigned later). |
| `StringLiteralContinuation.java` | `equals()` vs `==` on SCP and heap strings. Also contains the operator-precedence gotcha: `"text " + s2 == s6` concatenates first and then compares. |
| `EmptyString.java` | The empty string: `length()`, `isEmpty()`, `equals("")`, `== ""` on a `new String("")`, and `intern()` returning the pooled `""`. |
| `Intern.java` | Core `intern()` demo: `s1 == s2` is `false`, `s2.intern() == "java"` is `true`, and `new String("JS").intern() == "JS"` is `true`. |
| `InternMethod.java` | Using `concat()` and `+` with `new String(...)` operands. Notes on how many objects get created and why plain literals would be more memory-efficient. |
| `StringPract.java` | Runtime concatenation (`b + "llo"` where `b` is a normal variable) produces a heap object, so `a == c` is `false`, while `a == c.intern()` is `true`. |
| `StringPractBook.java` | A helper method `check()` that uses `intern()` and `System.identityHashCode()` to show whether a string is the pooled instance, applied to literals, `new String(...)`, and interned strings. |
| `StringToChar.java` | Building a string with `+=` in a loop (creates many intermediate objects), the `StringBuilder` alternative, and converting the result with `toCharArray()`. |

## Key takeaways

1. A string goes into the SCP only if it is a **literal**, a **compile-time constant expression**, or you call **`.intern()`** on it.
2. `new String("x")` always creates a new heap object, even if `"x"` is already in the pool.
3. `+` with a non-constant operand and `concat()` always create a new object at runtime.
4. Use `.equals()` to compare content. Use `==` only when you want to compare references.
5. `final` alone does not make a variable a constant. Its initializer must also be a constant expression, assigned at declaration.
6. Prefer `StringBuilder` over `+=` inside loops.

## Running the examples

Compile and run any file on its own:

```bash
javac Intern.java
java Intern
```

> **Java version note:** Some files declare `main` without `public` or without the `String[] args` parameter (for example `Intern.java`, `StringPract.java`, `StringToChar.java`, `EmptyString.java`, `InternMethod.java`). These need **Java 25 or later** (or Java 21+ with `--enable-preview`). The other files use the standard `public static void main(String[] args)` and run on any Java version.
