import java.util.Scanner;

public class vending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0,trayno;
        do{
        System.out.println("Tray1 |Beverages");
        System.out.println("Tray2 |snacks");
        System.out.println("Tray3 | chocolates");
        System.out.println("select your tray by using(1/2/3/0(Exit))");
        
        trayno = sc.nextInt();
        switch(trayno) {
            case 1:
                {
                char stay;
                do
                {
                    System.out.println("a .coco cola 30");
                    System.out.println("b.sprite 60");
                    System.out.println("c. maaza 50");
                    System.out.println("item to purchase(a/b/c");
                    char prod=sc.next().charAt(0);

                    if(prod=='a')
                        total+=30;
                    else if(prod=='b')
                        total+=60;
                    else if(prod=='c')
                        total+=50;
                    System.out.println("stay on same Tray(y/n:");
                    stay=sc.next().charAt(0);
                    
                }while(stay!='n');
                break;

                }

                case 2:
                {
                char stay;
                do
                {
                    System.out.println("a .Lays 30");
                    System.out.println("b.Balaji 60");
                    System.out.println("c.Haldiram50");
                    System.out.println("item to purchase(a/b/c");
                    char prod=sc.next().charAt(0);

                    if(prod=='a')
                        total+=30;
                    else if(prod=='b')
                        total+=60;
                    else if(prod=='c')
                        total+=50;
                    System.out.println("stay on same Tray(y/n:");
                    stay=sc.next().charAt(0);
                }while(stay!='n');
                break;

                }
            case 3:
                {
                char stay;
                do
                {
                    System.out.println("a .dairy milk 30");
                    System.out.println("b.kitkat 60");
                    System.out.println("c. silk 50");
                    System.out.println("item to purchase(a/b/c)");
                    char prod=sc.next().charAt(0);

                    if(prod=='a')
                        total+=30;
                    else if(prod=='b')
                        total+=60;
                    else if(prod=='c')
                        total+=50;
                    System.out.println("stay on same Tray(y/n:");
                    stay=sc.next().charAt(0);
                }while(stay!='n');
                break;

                }
                default:
                break;
            }

          }while(trayno!=0);
           System.out.println("your bill:"+total); 
         sc.close();
    }

}
