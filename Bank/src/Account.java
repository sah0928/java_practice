public class Account {
   private float money;
   
   public void credit(float m) {
      this.money += m;
      
   }
   
   public void debit(float m) {
      if (this.money < m) {
         System.out.println("��� ���� �ݾ� �ʰ�.");
         return;
      }
      
      this.money -= m;
   }
   
   public float balance() {
      return money;
   }

   
   public Account(float m) {
      this.money = m;
   }
}