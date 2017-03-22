import java.util.Scanner;

public class AccountTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Account account1 = new Account(50);
      Account account2 = new Account(0);
      
      Scanner sc = new Scanner(System.in);
      
      System.out.printf("account1 balance: %f\n", account1.balance());
      System.out.printf("account2 balance: %f\n", account2.balance());
      
      System.out.print("Enter withdrawal amount for account1:");
      
      float a = sc.nextFloat();
      

      System.out.printf("subtracting %f from account1\n", a);
      account1.debit(a);
      System.out.printf("account1 balance: %f\n", account1.balance());
      
      System.out.printf("account2 balance: %f\n", account2.balance());
      
   }
}
      