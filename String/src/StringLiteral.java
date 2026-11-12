public class StringLiteral {
    static String getValue(){
    return "a";
    }

    public static void main(String[] input) {
        String s = "shivam";
        String s2 = "shivam";
        String s3 = new String("");
        //        System.out.println(s == s2);  // scp same address bcz of same content so true
        //        System.out.println(s2 == s3); // false; bcz address diff. s3 points to heap with empty string but 2 objects create for s3
        //                                      // one in scp and in heap
        //        System.out.println(s3 == s3); //true


        String a = "xyx";
        String b = a;


        //         System.out.println(a == b) ;  //true
        //         String sc= new String("xyx" );// copy constructor local reference )
        //        System.out.println(b == sc);  //false

        String z = a + b;  // after concatenation it will go into heap z will have the reference // runtime exe.

        // bcz a and b as of now compiler dont know the exact value it can be reassigned
        String y = "xyxxyx";
        //        System.out.println(z == y); // false


        String pehla = "ab";  // literal

        //        String dusra= "a" + "b";  // // folded to "ab" by javac compilation time pe he hojata he by javac
        //        // the expression is a constant expression and it evaluates it during compilation.
        //
        //
        //        System.out.println(pehla == dusra);

        //String a1= "a";
        // String a2 = a1 + "x";     // not a constant, built at runtime will go to heap
        final String a1 = "a";
        String a2 = a1 + "b";   // a + "b" is a constant expression bcz of use of final a1
        System.out.println(pehla == a2);//

        String p = "a";
        p = "b";
        String q = p + "b";  // p is a normal variable so it can be reassigned
        System.out.println(q == pehla);


        String first = "xyx";        // normal variable, even though it holds a literal
        final String second = "xyx";  // constant variable
        // Even if you made second final, it would still not be a constant, because first isn’t one.


        //        A string goes into the String Constant Pool (SCP) only if:
        //
        //       1. It’s a literal ("abc"), or
        //       2. It’s a compile-time constant expression, which javac folds into a single literal, or
        //       3. You call .intern() on it.

        //A + on strings is just syntax for building a new string at runtime (via StringBuilder or invokedynamic),
        // and concat() always creates a new object at runtime.
       // String pehla = "ab";   // literal, lives in the String pool

        // Version 1: plain variable. "+" runs at runtime and builds a new heap object.
        String plain = "a";
        String r1 = plain + "b";
        System.out.println("1. plain variable        : " + (r1 == pehla));    // false

        // Version 2: final variable with a constant value. Compiler folds it into "ab".
        final String fin = "a";
        String r2 = fin + "b";
        System.out.println("2. final constant        : " + (r2 == pehla));    // true

        // Version 3: final, but the value comes from a method call. Not a constant.
        final String fromMethod = getValue();
        String r3 = fromMethod + "b";
        System.out.println("3. final from a method   : " + (r3 == pehla));    // false

        // Version 4: blank final, assigned after the declaration. Not a constant.
        final String blank;
        blank = "a";
        String r4 = blank + "b";
        System.out.println("4. final assigned later  : " + (r4 == pehla));    // false
}


    //Points trap
    // final alone isn’t enough. The initializer must also be a constant.

    //    final String x = getValue();   // not a constant expression
    //    String r = x + "b";            // HEAP
    //    What is a constant expression?
    //
    //    Both operands must be:
    //
    //    literals, or
    //    final variables initialized with a constant expression at declaration mtlb

    /*final String x;                // blank final
    x = "a";                       // assigned later, not at declaration
    String r = x + "b";            // HEAP*/




}

