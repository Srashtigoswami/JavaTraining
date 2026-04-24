import java.util.*;



public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "sras96"; 
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("Enter password:");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Login Successful");
                return; 
            } else {
                attempts++;
                System.out.println("Wrong password");
            }
        }

        System.out.println("Account Locked");
        sc.close();
    }
}
    

