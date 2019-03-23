
public class Account {

	private double balance;
	
	public Account(double init_balance){
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	/**
	 * ��Ǯ����
	 * @param amt: ����Ǯ��
	 */
	public void deposit(double amt){
		this.balance += amt;
	}
	
	/**
	 * ȡǮ����
	 * @param amt: ȡ���Ǯ��
	 */
	public void withdraw(double amt){
		this.balance -= amt;
	}
	
}
