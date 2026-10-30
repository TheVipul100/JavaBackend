package practicingRealWorld;

class AmazonCust {
    private final String accountId;
    private String email;
    private String password;
    private int walletBalance;  // amazonUpi

    // Guest account: no sign-up data yet, so everything stays at its default value.
    // Email and password can be set later through the setters.
    public AmazonCust() {
        this.accountId = "GUEST";  //final field must be assigned
    }

    // invalid values are replaced with safe defaults, so the object never hold an invalid negative value
    public AmazonCust(String accountId, String email, String password) {
        this.accountId = (accountId == null || accountId.isBlank()) ? "GUEST" : accountId;
        this.email = isValidEmail(email) ? email : null;
        this.password = isValidPassword(password) ? password : null;   // null means not set yet
    }

    // validation lives here so the constructor and the setters follow the same rules
    private static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    private static boolean isValidPassword(String password) {
        return password != null && password.length() >= 8;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (!isValidEmail(email))
            return false;
        this.email = email;
        return true;
    }

    public boolean setPassword(String password) {
        if (!isValidPassword(password))
            return false;
        this.password = password;
        return true;
    }

    public boolean verifyPassword(String input) {
        return input != null && input.equals(password);
    }

    public boolean passwordChange(String oldpwrd, String newpwrd) {
        if (!verifyPassword(oldpwrd)) {
            return false;
        }
        return setPassword(newpwrd);
    }

    public String getAccountId() {
        return accountId;
    }

    public boolean addMoney(int amount) {
        // second check stops int overflow
        if (amount <= 0 || walletBalance > Integer.MAX_VALUE - amount) {
            return false;
        }
        walletBalance += amount;
        return true;
    }

    public boolean pay(int amount) {
        if (amount <= 0 || amount > walletBalance) {
            return false;
        }
        walletBalance -= amount;
        return true;
    }

    public void displayBal() {
        System.out.println("Balance is: " + walletBalance);
    }
}