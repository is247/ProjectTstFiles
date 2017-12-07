import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Bank {
    //Static Variable
    static final String BANKNAME = "Java Bank";
    int menuChoice;
    LocalDateTime accountCreated = LocalDateTime.now();
    BankAccount myBankAccount = new BankAccount();

    Scanner inputScanner = new Scanner(System.in);


    public void addBankAccount() throws InputMismatchException{
        System.out.println("Would you like to open a new account?");
        System.out.println("1 - yes");
        System.out.println("2 - no");
        menuChoice = Integer.valueOf(inputScanner.nextLine());
        //Switch Statement
        switch (menuChoice){
            case 1:
                BankAccount myBankAccount = new BankAccount();
                LocalDateTime.now();
                break;
            case 2:
                System.out.println("Thank you, have a nice day =)");
                System.exit(0);
                break;
            default:
                throw new InputMismatchException("Invalid. Enter 1 or 2.");
        }
    }
}