package ex5;

public class Account {
	private int number;
	private String holder;
	private boolean isDeposit;
	private float deposit;
	
	public Account() {	
	}
	
	public Account(int number, String holder, boolean isDeposit, float deposit) {
		this.number = number;
		this.holder = holder;
		this.isDeposit = isDeposit;
		this.deposit = deposit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public boolean isDeposit() {
		return isDeposit;
	}

	public void setDeposit(boolean isDeposit) {
		this.isDeposit = isDeposit;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	
	
	
}
