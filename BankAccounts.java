package MidtermProject;

public class BankAccounts {
    private int accountNo;
    private String accountName;
    private double balance;
    private String status;

    public BankAccounts(){
            this.accountNo = 0;
            this.accountName = "";
            this.balance = 0.0;
            this.status = "active";
    }

    public BankAccounts(int accountNo, String accountName) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = 0.0;
        this.status = "active";
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Transaction cancelled: Insufficient balance or invalid amount.");
        }
    }

    // Check balance
    public double inquireBalance() {
        return balance;
    }

    // Transfer money method
    public void transferMoney(BankAccounts recipient, double amount) {
        if (recipient != null && amount > 0 && amount <= balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
            System.out.println("Transferred " + amount + " to account " + recipient.getAccountNo());
        } else {
            System.out.println("Transaction cancelled: Invalid recipient or insufficient balance.");
        }
    }

    // Close account
    public void closeAccount() {
        if (status.equals("active")) {
            System.out.println("Closing account. Withdrawing remaining balance: " + balance);
            balance = 0.0;
            status = "closed";
        } else {
            System.out.println("Account is already closed.");
        }
    }

    // ToString method
    @Override
    public String toString() {
        return "Account No: " + accountNo + "\nAccount Name: " + accountName + "\nBalance: " + balance + "\nStatus: " + status;
    }
}


