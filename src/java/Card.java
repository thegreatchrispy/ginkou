public class Card {
    private int accountId;
    private String lastName;
    private String firstName;
    private String cardNumber;
    private boolean activated;
    private String pin;
    private double balance;

    public Card (Account account) {
        accountId = account.getId();
        lastName = account.getLastName();
        firstName = account.getFirstName();
        activated = false;
        pin = "0000";
        balance = account.getBalance();
    }

    public int getAccountId () {
        return accountId;
    }

    public void setAccountId (int accountId) {
        this.accountId = accountId;
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

    public String getCardNumber () {
        return cardNumber;
    }

    public void setCardNumber (String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean getActivated () {
        return activated;
    }

    public void setActivated (boolean activated) {
        this.activated = activated;
    }

    public String getPin () {
        return pin;
    }

    public void setPin (String pin) {
        this.pin = pin;
    }

    public double setBalance () {
        return balance;
    }

    public void getBalance (double balance) {
        this.balance = balance;
    }

    public String toString () {
        String result = "Account Number: " + accountId + "\n";
        result += "Cardholder: " + lastName + ", " + firstName + "\n";
        result += "Card Number: ";
        
        for (int i = 0; i < cardNumber.length(); i++) {
            for (int j = 0; j < 4; j++) {
                result += cardNumber.charAt(i+j);
            }

            i += 3;
            result += " ";
        }

        result += "\n";
        result += "Card Active: " + activated + "\n";
        result += "Card PIN: " + pin + "\n";
        result += "Card Balance: " + balance + "\n";
        
        return result;
    }
}