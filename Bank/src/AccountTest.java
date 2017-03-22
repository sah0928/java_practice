import java.util.Scanner;

public class AccountTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      CheckingAccount account1 = new CheckingAccount(100, 1000000, 0.01, 0.07);
      CheckingAccount account2 = new CheckingAccount(100, 1000000, 0.01, 0.07);
      
      Scanner sc = new Scanner(System.in);
      
      System.out.printf("account1 balance: %f\n", account1.getBalance());
      System.out.printf("account2 balance: %f\n", account2.getBalance());
      
      System.out.print("Enter deposit amount for account1:");
      
      double a = sc.nextDouble();
      account1.credit(a);
      
      System.out.printf("account1 balance: %f\n", account1.getBalance());
      System.out.printf("account2 balance: %f\n", account2.getBalance());
      System.out.print("Enter withdrawal amount for account1:");
      
      a = sc.nextDouble();
      account2.debit(a);
      
      System.out.printf("account1 balance: %f\n", account1.getBalance()); 
      System.out.printf("account2 balance: %f\n", account2.getBalance());
      
      System.out.println("next month!");
      account1.nextMonth();
      account2.nextMonth();
      
      System.out.printf("account1 balance: %f\n", account1.getBalance()); 
      System.out.printf("account2 balance: %f\n", account2.getBalance());
      
   }
}
      