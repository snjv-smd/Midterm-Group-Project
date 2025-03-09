package MidtermProject;

public class InvestmentAccount extends BankAccounts{
    private double minimumBalance;
    private double interest;

    // Default constructor
    public InvestmentAccount() {
        super();
        this.minimumBalance = 0.0;
        this.interest = 0.0;
    }

    // Parameterized constructor
    public InvestmentAccount(int accountNo, String accountName, double minimumBalance, double interest) {
        super(accountNo, accountName);
        this.minimumBalance = minimumBalance;
        this.interest = interest;
    }

    // Getters
    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double getInterest() {
        return interest;
    }

    // Add investment (deposit redefined)
    public void addInvestment(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Investment added: " + amount);
        } else {
            System.out.println("Invalid investment amount.");
        }
    }

    // Inquire investment value
    public void inquireInvestmentValue() {
        double investmentValue = balance * (1 + interest);
        System.out.println("Investment Value: " + investmentValue);
    }

    // Close account (override method)
    @Override
    public void closeAccount() {
        System.out.println("Closing Investment Account. Final investment value:");
        inquireInvestmentValue();
        balance = 0.0;
        System.out.println("Account closed.");
    }
}


