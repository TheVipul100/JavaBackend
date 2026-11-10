Java Initialization Order: Practice Examples



Small, focused programs exploring how and when Java initializes classes and objects: static blocks, instance init blocks, constructor chaining, inheritance order, and the JVM's lazy class loading.



Key concepts

Loading ≠ initialization. Loading puts the class blueprint in Metaspace. Static blocks and static field initializers run at initialization, on first active use (new, static method call, non-constant static field access).

Static order: static variables and static blocks run top to bottom, once per class.

Instance order: super() → instance initializers and field initializers (textual order) → rest of the constructor body.

Nested classes are separate classes and are initialized lazily, not when the outer class is.

Compile-time constants (static final int X = 10) are inlined and do not trigger class initialization.

Overridden methods called from a parent constructor dispatch to the child, before the child's fields are initialized.

Requirements

JDK 25+ (several files use static void main(...) without public, and Pract1 uses a no-arg main()).

On JDK 21-24, run with --enable-preview --source <version>, or change to public static void main(String\[] args).

Files

File	Topic	Expected output

Pract1.java	Static block once, instance block per object	static, then instance / constructor called twice

Pract2.java	Constructor chaining with this(...); lazy init of nested class T	Instance block runs once, in the last constructor of the chain; m1, static block, m2 appear only at new T()

Pract3.java	Overridden method called from parent constructor	x = 0 (child field not yet initialized)

Pract4.java	static final constants don't trigger static init	10, 20 (no "T static")

Pract5.java	Field initializer vs instance block vs constructor	block a = 10, constructor a = 10, repeated, then Pract.A@<hash>

Main.java	Parent/child static and instance order	P static, C static, P instance, P constructor, C instance, C constructor

T.java	Static var, static block, instance var order	static block, m2, m1

Driver.java	Instance block as an object counter	11

InstanceInit.java	Static block before main; super → init block → constructor	Static block first, then per object: Account created, Account IIB, Account  established

User.java	Static block runs on first use of the class, not at program start	welcome first, then the static block, then constructor output

sb.java	Local StringBuilder: reference on stack, object on heap, no sharing between threads	100 lines of cumulative output

Project layout

staticandinstanceinit/

├── README.md

├── .gitignore

└── Day27/

&#x20;   ├── Pract/          # files with `package Pract;`

&#x20;   │   ├── Main.java

&#x20;   │   ├── Pract1.java ... Pract5.java

&#x20;   │   └── T.java

&#x20;   ├── Driver.java     # default-package files

&#x20;   ├── InstanceInit.java

&#x20;   ├── User.java

&#x20;   └── sb.java

Build and run



From the Day27 folder:



bash

javac -d ../out Pract/\*.java \*.java



java -cp ../out Pract.Main

java -cp ../out Pract.Pract2

java -cp ../out Pract.Pract3

java -cp ../out Driver

java -cp ../out User

java -cp ../out InstanceInit

Things worth noticing

In Pract2, T is nested but its static code does not run when Pract2 loads. It runs at new T().

In Pract3, the overridden show() runs from the parent constructor and prints 0. Avoid calling overridable methods in constructors.

In Pract4, no static block runs because the constants are inlined by the compiler.

