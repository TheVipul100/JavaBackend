package day45.Practice;

public class Practice2 {

        static void test() {
            try {
                try {
                    throw new RuntimeException("A");
                } catch (RuntimeException e) {
                    throw new IllegalStateException("B");
                } finally {
                    throw new IllegalArgumentException("C");
                }
            } catch (Exception e) {
                System.out.println("caught " + e.getMessage());
                System.out.println(e.getSuppressed().length);

            }
        }

        /*
        * Interview takeaway

        "An exception thrown in finally replaces any exception in propagation , and the original ("B") is lost without a trace.
        *  try-with-resources avoids this by suppressing the secondary exception instead."*/

        public static void main(String[] args) {
            test();
        }
}

/*
* The finally belongs to the inner try. The outer try has no finally at all.
finally runs before B can leave the inner try statement. B is still "in propagation" when the inner finally starts,
* and that finally throws C. A new exception thrown in finally replaces the one in flight. B never reaches the outer
* catch.
*
* Correct trace
Step	What happens
1	   throw A, caught by the inner catch, so A is handled and finished
2	   Inside that catch, throw B starts propagating out of the inner try
3      The inner finally must run first, and it executes throw C
4	   C replaces B, and B is silently lost
5	   C propagates to the outer catch (Exception e), which runs once
6	   Prints the message, then the suppressed count
* */

/*
* Why getSuppressed().length is 0

Only two things add suppressed exceptions:

try-with-resources, automatically
you calling addSuppressed() yourself
* */


/*
* This is the key difference:

	                                      Original exception    	Second exception
Plain finally throws                           	lost	                 thrown
try-with-resources close() throws              thrown	             kept in getSuppressed()

This is why try-with-resources is preferred over manual finally for cleanup.
* It protects the real error, while a finally can hide it.*/