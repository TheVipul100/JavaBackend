public class EmptyString {

    public static void main(String[] args) {
            String e = new String("");

            System.out.println(e.length());       // 0
            System.out.println(e.isEmpty());      // true
            System.out.println(e.equals(""));     // true  (same content)
            System.out.println(e == "");          // false (different objects)
            System.out.println(e.intern() == ""); // true  (intern() returns the pooled "")
        }
}
