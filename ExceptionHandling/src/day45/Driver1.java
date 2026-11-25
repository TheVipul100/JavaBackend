package day45;

public class Driver1 {

    /*
    * compilation failure so parent exception call should always be defined at the last
    * */
    public static void main(String[] args) {
        String s = null;
        try {

            int[] arr = new int[3];
            int x = Integer.parseInt("abc");   //1
            arr[5] = 10 / 0;
            s.length();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
//            try{
//
//            }
//            catch(){
//                System.out.println("Always runs firsttttttt");
//            }
            System.out.println("Always runs");
        }
    }
}
