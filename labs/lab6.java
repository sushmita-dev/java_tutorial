
import java.util.Scanner;

abstract class BankAccount {
    protected Integer accountNumber;
    protected String customerName;
    protected double balance;

    public BankAccount(Integer accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = 0.0; // Initializing balance to 0.0
    }

    // Abstract method for withdrawal
    public abstract void withdraw(double amount);

    // Abstract method for deposit
    public abstract void deposit(double amount);
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000; // Minimum balance constraint
    private static final double INTEREST_RATE = 0.02; // Fixed interest rate

    public SavingsAccount(Integer accountNumber) {
        super(accountNumber, ""); // Initialize customerName as empty string
    }


    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn Amount: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal not allowed.");
        }
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Amount: Rs. " + amount);
    }

    public double calculateInterest() {
        double interest = balance * INTEREST_RATE;
        System.out.println("Interest Earned: Rs. " + interest);
        return interest;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance Amount: Rs. " + balance);
    }
}

public class lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter the Account Number: ");
        Integer accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter the amount for deposit: ");
        double depositAmount = scanner.nextDouble();
        System.out.print("Enter the amount for withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        // Creating SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber);
        savingsAccount.customerName = customerName; // Set customerName

        // Deposit and withdraw
        savingsAccount.deposit(depositAmount);
        savingsAccount.withdraw(withdrawAmount);

        // Calculate interest and display account details
        double interestEarned = savingsAccount.calculateInterest();
        double totalAmount = depositAmount + interestEarned;
        System.out.println("Total Amount: Rs. " + totalAmount);
        savingsAccount.displayAccountDetails();

        scanner.close();
    }
}

