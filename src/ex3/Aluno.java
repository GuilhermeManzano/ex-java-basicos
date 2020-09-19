package ex3;

public class Aluno {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double grade() {
		return n1 + n2 + n3;
	}
	
	public double results() {
		if(grade() < 60.0) {
			return 60.0 - grade();
		} else {
			return 0.0;
		}
	}
}
