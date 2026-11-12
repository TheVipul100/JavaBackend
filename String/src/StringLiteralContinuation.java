public class StringLiteralContinuation {

    public static void main(String[] args)
    {
        String s2 = "kodewala";
        String s4= "kodewala";
        System.out.println("SCP " + s2.equals(s4));  // since string so will compare the content

        String s6= new String("kodewala");
        System.out.println("scp and heap " + s2.equals(s6));  // true content
        System.out.println("scp and heap " + s2 == s6); //false == compares reference

    }
}
