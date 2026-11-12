public class Strin2 {
        public static void main(String[] args)
        {

            // string identity vs string context why we use new when we have literals in some cases bcz we need obj. identity

//
              String s = "This is" + " Kodewala" + " Academy";  // 1 obj. will be created
//            //  compiler does compile time optimization after compilation the compiler will send the string s to JVM for execution
//            System.out.println(s);
//
//            String s1 = "Kodewala";  //scp
//            String s2= " Academy";  //scp
//
//            String s4 = s1 + s2;//heap   --> new string builder()  + operator == 3 objects in total s1 s2 and s4
//            //+ operator == overloaded using string builder
//            // s4 will have 1 object
//            System.out.println(s4);
//
//            String s6 = "Kodewala" + " Academy";
//
//            // intern() object is created (s4) in heap but if we want to refer it from scp then we use intern
//            // is obj. doesnt exists in the scp then intern will create a copy of it in the scp and starts referring it and if it already exists then it starts referencing it
//
//
//            String s5 ="Kodewala Academy";
//            System.out.println(s5 == s4);  // false
//            System.out.println(s6 == s4);   // false
//            System.out.println(s5 == s4.intern()); // true;

            String a = new String("xyz") + new String("fgh");
            String b="";
            String c= b.concat(a);
            String newer = "";
            System.out.println(a);

        }
}
