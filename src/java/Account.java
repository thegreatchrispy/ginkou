public class Account {
    private int id;
    private String lastName;
    private String firstName;
    private double balance;
    private String accountType;

    public Account () {

    }

    public Account (String lastName, String firstName, double balance, String accountType) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public String getAccountType () {
        return accountType;
    }

    public void setAccountType (String accountType) {
        this.accountType = accountType;
    }

    public String toString () {
        String result = "Account Number: " + id + "\n";
        result += "Account Name: " + lastName + ", " + firstName + "\n";
        result += "Account Type: " + accountType + "\n";
        result += "Account Balance: $" + balance + "\n";
        return result;
    }
}