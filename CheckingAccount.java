package MidtermProject;

public class CheckingAccount extends BankAccounts {
    private double minimumBalance;

    // Default constructor
    public CheckingAccount() {
        super();
        this.minimumBalance = 0.0;
    }

    // Parameterized constructor
    public CheckingAccount(int accountNo, String accountName, double minimumBalance) {
        super(accountNo, accountName);
        this.minimumBalance = minimumBalance;
    }

    // Getter
    public double getMinimumBalance() {
        return minimumBalance;
    }

    // Encash check (deposit alternative)
    public void encashCheck(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Check encashed: " + amount);
        } else {
            System.out.println("Invalid check amount.");
        }
    }

}
