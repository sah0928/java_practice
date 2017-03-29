
public class SavingsAccount extends Account {
	private int month;
	private double interest;
	
	public SavingsAccount(double m, double interest) {
		super(m);

		this.interest = interest;
	}

	@Override
	public void debit(double m) {
		if (month >= 12) {
			this.setBalance(this.getBalance() - m);
		}
		else {
			System.out.println("아직 출금할 수 없습니다!");
		}
	}
	
	@Override
	public double getWithdrawableAccount() {
		// TODO Auto-generated method stub
		if (month >= 12) {
			return this.getBalance();
		}
		else {
			return 0;
		}
	}

	@Override
	public void passTime(int time) {
		// TODO Auto-generated method stub
		this.month += time;
		if (month == 12) {
			this.setBalance(this.getBalance() * Math.pow(1+ interest, month));
		}
	}

}