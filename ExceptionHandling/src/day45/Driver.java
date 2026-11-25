package day45;

public class Driver {

    static void main(String[] args) {

        Account account = new Account();
        String str = null;
        account.doActivate(str);  //"Sbi");

    }


    static class Account {

        void doActivate(String accNO)
        {
            System.out.println("Account.doValidate()...starts");
            validateAccount(accNO);
            System.out.println("Account.doValidate().....end");
        }
        private boolean validateAccount(String accNo)
        {
            System.out.println("Account.validatee....Start()..");
            boolean isValid=false;
            try{
             isValid = accNo.startsWith("SBI");  // exception occurred at this line and this is being called by a
            }// caller method name doActivate()---performing some operation
            catch (NullPointerException e)
            {
                e.printStackTrace(System.out);
            }
            System.out.println("Account.validate.....Ends()..");
            return isValid;
        }
    }
}
