
public class CheckingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	
	public CheckingAccount(double m, double credit_limit, double interest, double loan_interest) {
		super(m);
		// TODO Auto-generated constructor stub
		
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	
	@Override public void debit(double m) {
		if (getBalance() - m < 0) {
			System.out.println("잔액 마이너스.");
			
			if (getBalance() - m < -100) {
				System.err.println("출금 한도 초과.");
				return;
			}
			
			setBalance(getBalance() - m);
		}
	}
	
	public void nextMonth() {
		if (this.getBalance() < 0) {
			this.setBalance(getBalance()+getBalance()*this.loan_interest);
		}
		else if (this.getBalance() > 0) {
			this.setBalance(getBalance()+getBalance()*this.interest);
		}
	}
}
