public class StringPract {
    static void main(String[] args) {

        String a="hello";

        String b ="he";
        //b="";
        String c = b+"llo";  // b dynamic can chNGE runtime allocation  compiler doesnt know the value of b so runtime dynamic value
        // c ill be in heap

        System.out.println(a == c);

        System.out.println(a == c.intern());  // intern() reference deta hai

        //
    }
}
