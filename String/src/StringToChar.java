public class StringToChar {
    static void main(String[] args) {
        String[] sArray = {"Hey", "you", "all"};
        String s = "";
        for (String n:sArray)
            s+= n;        // will create multiple objects instead use stringbuilder and append it
        char[] c = s.toCharArray();
        System.out.println(c);
//        String s = "";
//        //        for (String n:sArray)
//        //            s+= n;
//        StringBuilder s=new StringBuilder();
//        for(String n : sArray)
//            s.append(n);
//        char[] c = s.toString().toCharArray();
    }
}
