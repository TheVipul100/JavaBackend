package methodOverloading;

public class Login {

   public static void doLogin(int name)
   {
       System.out.println("Login.doLogin().....dvvvvvvvvvvv");
   }

   public static void doLogin(String name, int mobile)
   {
       System.out.println("Login.doLogin().private....");
   }

   public String doLogin(String mobile,String password){

       System.out.println("Login.doLogin().String.....");
       return "Registered";
   }
}
