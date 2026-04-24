import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Speed:");
        int Speed=sc.nextInt();
        int fine=0;
        String Repeated;

        if(Speed>100){
            fine+=1000;

        }
        else if(Speed>80){
            fine+=500;

        }
        System.out.println("Repeated:");
        Repeated = sc.next();
        
         if(Repeated.equals("yes")) {
            fine *= 2;  // Double the fine if repeated
        }
        
        System.out.println("Fine amount: " + fine);
        sc.close();
    }
}
