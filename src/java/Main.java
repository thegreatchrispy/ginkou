public class Main {
    public static void main (String[] args) {
        // Account account = new Account ("Allen", "Chris", 100.00, "Checking");
        // Bank bank = new Bank();
        // bank.createAccount(account);
        // System.out.println(account.toString());

        // Card card = new Card (account);
        // account.toString();
        // CardTool cardTool = new CardTool();
        // cardTool.createCard(card);
        // System.out.println(card.toString());
        // cardTool.activateCard(card);
        // cardTool.checkBalance(card);

        System.out.println("Interactive Banking Account Creation...");
        System.out.println("Enter choice: ");
        System.out.println("1) Create Bank Account    2) Create Card for Existing Account");
        System.out.println("3) Activate a Card        4) Check Balance");

        /**
         * switch choice
         *     case 1 getUserInfo, bank.createAccount
         *     case 2 getAccountInfo, cardTool.createCard
         *     case 3 getCardInfo, cardTool.activateCard
         *     case 4 getCardInfo/getAccountInfo, cardTool.checkBalance
         */
    }
}