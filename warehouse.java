import java.util.*;

public class warehouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no. of items:");
         int n=sc.nextInt();
         int total=0;
       
         for(int i=1;i<=n;i++){
            int curr=sc.nextInt();
            int minreq=sc.nextInt();
            if(curr<minreq){
                System.out.println("restock needed for product"+1);
                total++;
            }
           
    }
     System.out.println("total no. of product to be restocked"+total);
         }
    
}
