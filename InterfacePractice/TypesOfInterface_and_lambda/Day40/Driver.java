package TypesOfInterface_and_lambda.Day40;

public class Driver {

    public static void main(String[] args) {

        // The lambda is the implementation of openAccount(); no named class is needed
        IAccount account = (accHolderName,addr,amt) ->
        {
            System.out.println("Opening Account for " + accHolderName);
            return "ACC-" + Math.abs(accHolderName.hashCode());
        };  // statement needs to be closed with a semicolon

        String id = account.openAccount("KODEWALA","Btm",40000);
        System.out.println("Account id: " + id);
        /**
         * Java supports functional interfaces to achieve functional programming:
         * behaviour is passed around as a lambda, without a named class or method.
         */
    }
}
