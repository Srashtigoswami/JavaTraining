import java.util.*;

public class UberFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance:");
        int distance = sc.nextInt();

        System.out.println("Night ride? (yes/no):");
        String night = sc.next();

        double fare = 0;

        if (distance <= 5) {
            fare = distance * 50;
        } 
        else if (distance <= 10) {
            fare = (5 * 50) + (distance - 5) * 40;
        } 
        else {
            fare = (5 * 50) + (5 * 40) + (distance - 10) * 30;
        }

        // Night surcharge
        if (night.equalsIgnoreCase("yes")) {
            fare = fare + (fare * 0.2);
        }

        System.out.println("Total Fare: " + fare);

        sc.close();
    }
}
