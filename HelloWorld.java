import java.util.Scanner;
public class HelloWorld{
   public static void main(String args[]){
   int pinnumber,numbercash,amount,cash;
   long money;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the pinnumber :");
   pinnumber=s.nextInt();
   System.out.println("Enter the numbercash :");
   numbercash=s.nextInt();
   System.out.println("Enter the amount :");
   amount=s.nextInt();
   System.out.println("Enter 1 for 100rs");
   System.out.println("Enter 2 for 500rs");
   System.out.println("Enter your cash");
   cash=s.nextInt();
   switch(cash)
   {
       case 1:
          money = numbercash*amount;
          System.out.println("numbercash*amount =" +money);
          break;
       case 2:
           money = numbercash+amount;
           System.out.println("numbercash+amount =" +money);
           break;
        default :
            System.out.println("money not avaible");
   }
   }  
}
   
   
