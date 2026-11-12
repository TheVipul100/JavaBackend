public class StringPractBook {

    static void check(String name, String s) {
        System.out.println(name + " -> pooled? " + (s == s.intern())
                + " | identityHashCode=" + System.identityHashCode(s));
    }
    public static void main(String[] args)
    {
        String s1="Java";
        String s2= new String("Java");
        String s3=s2.intern();
        String s4 = "Java";

//        s2=s2.intern();
        String s5=new String("JavaScript").intern();
//        System.out.println(s1 == s2);
//        System.out.println(s3==s4);
//        System.out.println(s5== "JavaScript");

        check("s1", s1);
        check("s2", s2);
        check("s3", s3);
        check("s4", s4);
        check("s5", s5);

    }
}
