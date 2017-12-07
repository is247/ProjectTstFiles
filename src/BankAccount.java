import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class BankAccount {
    Scanner inputScanner = new Scanner(System.in);
    double balance = 0.00;
    String accountName;
    LocalDateTime lastTransaction = LocalDateTime.now();
    DecimalFormat formatter = new DecimalFormat("#.##");

    public void printInfo() {
        System.out.println("Account name: " + accountName);
        System.out.println("You have $" + formatter.format(balance) + " in your account");
        System.out.println("Your last transaction was on " + lastTransaction);
    }

    public void deposit() {
        double userDeposit;
        System.out.println("How much would you like to deposit?");
        userDeposit = Double.valueOf(inputScanner.nextLine());
        balance = (balance + userDeposit);
        lastTransaction = LocalDateTime.now();
    }

    public void withdraw() {
        double userWithdrawal;
        System.out.println("How much would you like to withdraw?");
        userWithdrawal = Double.valueOf(inputScanner.nextLine());
        balance = (balance - userWithdrawal);
        if (balance < 0)
            System.out.println("Your account has been overdrawn by " + (-balance));
        lastTransaction = LocalDateTime.now();
    }

}