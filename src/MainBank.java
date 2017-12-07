//Valerie Schultz schultc4@umbc.edu, Jaspreet Kaur kaur5@umbc.edu, Jason Chung jchung11@umbc.edu, Mohamed  mjalloh2@umbc.edu
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class MainBank {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Bank myBank = new Bank();
        PrintHello hi = new PrintHello();
        hi.print();
        System.out.print("Thank you for choosing " + myBank.BANKNAME);
        Location l = new Location();
        l.setLocation("Maryland");
        System.out.println(" " + l.getLocation());
        System.out.println();
        myBank.addBankAccount();
        System.out.println("Please name your account.");
        myBank.myBankAccount.accountName = inputScanner.nextLine();
        System.out.println();
        GoldCard gc = new GoldCard();
        gc.message();
        restaurantDis goldDiscount = new GoldDis();
        System.out.println("Total off restaurant is $" + goldDiscount.getRestaurantDiscount());
        Benefits gold=new Gold("Chipotle",20,0.5);
        System.out.println(gold.toString());
        PlatinumCard pc = new PlatinumCard();
        pc.message();
        restaurantDis platDiscount = new PlatniumDis();
        System.out.println("Total off restaurant is $" + platDiscount.getRestaurantDiscount());
        Benefits platinum= new Platinum("Starbucks",100,1.5);
        System.out.println(platinum.toString());
        System.out.println("What would you like to do with your account?");
        System.out.println();

        GenericDataType<String>  g1 = new GenericDataType<>("Checking Deposit");
        GenericDataType<String>  g2 = new GenericDataType<>("Checking Withdraw");
        GenericDataType<String>  g3 = new GenericDataType<>("Saving Deposit");
        GenericDataType<String>  g4 = new GenericDataType<>("Saving Withdraw");
        System.out.println("You have the option to add deposit in the following account");
        System.out.println(g1.getAccount());
        System.out.println(g2.getAccount());
        System.out.println(g3.getAccount());
        System.out.println(g4.getAccount());
        System.out.println("-------------------------------------------------");

        try{
            int menuInput = 0;

            while (menuInput == 0) {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Account Information");
                System.out.println("4. Bank Information");
                System.out.println("5. Loan Information");
                System.out.println("---------");
                System.out.println("9. Exit");
                System.out.println("---------");
                menuInput = Integer.valueOf(inputScanner.nextLine());
                if (menuInput == 1) {
                    myBank.myBankAccount.deposit();
                    menuInput = 0;
                } else if (menuInput == 2) {
                    myBank.myBankAccount.withdraw();
                    menuInput = 0;
                } else if (menuInput == 3) {
                    myBank.myBankAccount.printInfo();
                    menuInput = 0;
                } else if (menuInput == 4) {
                    printBankInfo n = new printBankInfo();
                    System.out.print("We are ranked number ");
                    n.p(1);
                    n.p(" Thank you for choosing Java Bank");

                    System.out.println("Account created at " + myBank.accountCreated);
                    menuInput = 0;
                } else if (menuInput == 5){
                    System.out.print("A loan of $1200 with 1% interest rate, with a payment of $120 a month, woud take ");
                    System.out.println(loanLength(1200, 1.0, 120) + " Months to pay back.");
                    System.out.print("A loan of $1000 with 5% interest rate, with a payment of $200 a month, woud take ");
                    System.out.println(loanLength(1000, 5.0, 200) + " Months to pay back.");
                    System.out.print("A loan of $150 with 2% interest rate, with a payment of $100 a month, woud take ");
                    System.out.println(loanLength(150, 2.0, 100) + " Months to pay back.");
                    menuInput = 0;
                } else if (menuInput == 9) {
                    System.out.println("Thank you for banking with us!");
                    Stack myStack = new Stack();
                    myStack.push("Have a great day!");
                    myStack.push("Please come back soon!");
                    while (!myStack.empty()){
                        System.out.println(myStack.pop());
                        System.out.println(" :) ");
                    }
                    break;
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid. Integer required.");
        }
        //Map
        Map<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("Bank Group");
        map.put(1, "Valerie");
        map.put(2, "Jaspreet");
        map.put(3, "No body");
        map.put(3, "Jason");
        map.put(4, "Mohamed");
        System.out.println(map);
    }
    // Recursion
    public static int loanLength(double loan, double interest, double payment) {
        if (loan <= 0) {
            return 0;
        }
        double monthInt = interest / (12 * 100);
        double compounded = loan * (1 + monthInt);
        return 1 + loanLength(compounded - payment, interest, payment);
    }

}
