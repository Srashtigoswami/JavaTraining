import java.util.*;


public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount:");
        double amount = sc.nextDouble();

        if (amount >= 5000) {
            amount = amount - (amount * 0.2);  // 20% discount
        } 
        else if (amount >= 3000) {
            amount = amount - (amount * 0.1);  // 10% discount
        } 
        else {
            System.out.println("No discount applied.");
        }

        System.out.println("Premium customer? (yes/no):");
        String premium = sc.next();

        // Make it case-insensitive
        if (premium.equalsIgnoreCase("yes")) {
            amount = amount - (amount * 0.05);  // 5% additional discount
        }

        System.out.println("Total amount after discount: " + amount);

        sc.close();
    }
}