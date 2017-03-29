public abstract class Account {
   private double balance;
   
   public void credit(double m) {
      this.balance += m;
      
   }
   
   public void debit(double m) {
      if (this.balance < m) {
         System.out.println("출금 가능 금액 초과.");
         return;
      }
      
      this.balance -= m;
   }
   
   public double getBalance() {
      return balance;
   }

   
   public Account(double m) {
      this.balance = m;
   }
   
   protected void setBalance(double m) {
	   this.balance = m;
   }
   
   public abstract double getWithdrawableAccount();
   public abstract void passTime(int time);
}