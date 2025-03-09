package MidtermProject;

public class CreditCardAccount extends BankAccounts {
    private double creditLimit;
    private double charges;

    // Default constructor
    public CreditCardAccount() {
        super();
        this.creditLimit = 0.0;
        this.charges = 0.0;
    }

    // Parameterized constructor
    public CreditCardAccount(int accountNo, String accountName, double creditLimit, double charges) {
        super(accountNo, accountName);
        this.creditLimit = creditLimit;
        this.charges = charges;
    }

    // Getters
    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCharges() {
        return charges;
    }

    // Pay card balance
    public void payCard(double amount) {
        if (amount > 0 && amount <= charges) {
            charges -= amount;
            System.out.println("Payment made: " + amount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    // Inquire available credit
    public double inquireAvailableCredit() {
        return creditLimit - charges;
    }

    // Charge to card
    public void chargeToCard(double amount) {
        if (amount > 0 && inquireAvailableCredit() >= amount) {
            charges += amount;
            System.out.println("Charge added: " + amount);
        } else {
            System.out.println("Transaction declined: Insufficient available credit.");
        }
    }

    // Get cash advance
    public void getCashAdvance(double amount) {
        if (amount > 0 && amount <= (0.5 * inquireAvailableCredit())) {
            charges += amount;
            System.out.println("Cash advance granted: " + amount);
        } else {
            System.out.println("Cash advance denied: Exceeds allowed limit.");
        }
    }
}

