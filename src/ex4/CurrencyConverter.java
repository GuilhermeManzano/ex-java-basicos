package ex4;

public class CurrencyConverter {
	public double dollar;
	public double buyDollar;
	
	public double tax() {
		dollar *= 1.06;
		return dollar * buyDollar;
	}
}
