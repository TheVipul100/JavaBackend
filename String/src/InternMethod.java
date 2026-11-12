public class InternMethod {

    public static void main() {

        String s2 = "hello";
        s2 = s2.concat("xyz");
        System.out.println(s2);


        String sc = new String("hello").concat(new String("tackle"));


        String sc1 = new String("hello") + new String("tackle");// 5 objects
         // 2 scp + 2 heap + 1 end result hello tackle sc1 5 obj.

        // in total but memory
         // wastage bcz simply literals will do the task
        // string concatenates the value and not the address of the created object

        // total obj. 8 obj sc and sc1  sc 2 heap +  final concatenated
        System.out.println(sc);
        System.out.println(sc1);


    }
}
