import java.util.*;

public class BankWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter withdrawal amount:");
        double withdraw = sc.nextDouble();

        if (withdraw > balance) {
            System.out.println("Transaction Failed: Insufficient Balance");
        } 
        else if ((balance - withdraw) < 1000) {
            System.out.println("Transaction Failed: Minimum balance violation");
        } 
        else {
            balance = balance - withdraw;
            System.out.println("Transaction Successful");
            System.out.println("Remaining balance: " + balance);
        }

        sc.close();
    }
}
    

