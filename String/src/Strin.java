public class Strin {

    public static void main(String[] args) {
        String s1 = "Anything";// literals     //scp
        String s2 = new String("That");
        String s3 = new String("Anything");     //two objects will be created one in heap and scp

        String s4 = new String(s1);
        System.out.println(s1 == s3);  // goes to scp
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s3));

    }
}