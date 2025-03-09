package MidtermProject;
import java.util.Scanner;
public class AccountsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for Regular Account
        System.out.print("Enter Regular Account Number: ");
        int regAccNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Regular Account Name: ");
        String regAccName = scanner.nextLine();
        BankAccounts regularAccount = new BankAccounts(regAccNo, regAccName);

        // User input for Checking Account
        System.out.print("Enter Checking Account Number: ");
        int checkAccNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Checking Account Name: ");
        String checkAccName = scanner.nextLine();
        System.out.print("Enter Minimum Balance for Checking Account: ");
        double checkMinBal = scanner.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(checkAccNo, checkAccName, checkMinBal);

        // User input for Investment Account
        System.out.print("Enter Investment Account Number: ");
        int invAccNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Investment Account Name: ");
        String invAccName = scanner.nextLine();
        System.out.print("Enter Minimum Balance for Investment Account: ");
        double invMinBal = scanner.nextDouble();
        System.out.print("Enter Interest Rate (e.g., 0.05 for 5%): ");
        double invInterest = scanner.nextDouble();
        InvestmentAccount investmentAccount = new InvestmentAccount(invAccNo, invAccName, invMinBal, invInterest);

        // User input for Credit Card Account
        System.out.print("Enter Credit Card Account Number: ");
        int ccAccNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Credit Card Account Name: ");
        String ccAccName = scanner.nextLine();
        System.out.print("Enter Credit Limit: ");
        double ccLimit = scanner.nextDouble();
        CreditCardAccount creditCardAccount = new CreditCardAccount(ccAccNo, ccAccName, ccLimit, 0.0);

        // Demonstrate functionality
        System.out.println("\nRegular Account:");
        regularAccount.deposit(500.0);
        regularAccount.withdraw(200.0);
        System.out.println(regularAccount);

        System.out.println("\nChecking Account:");
        checkingAccount.encashCheck(1500.0);
        System.out.println(checkingAccount);

        System.out.println("\nInvestment Account:");
        investmentAccount.addInvestment(2000.0);
        investmentAccount.inquireInvestmentValue();
        System.out.println(investmentAccount);

        System.out.println("\nCredit Card Account:");
        creditCardAccount.chargeToCard(3000.0);
        creditCardAccount.getCashAdvance(2000.0);
        creditCardAccount.payCard(1500.0);
        System.out.println(creditCardAccount);

        scanner.close();
    }
}

