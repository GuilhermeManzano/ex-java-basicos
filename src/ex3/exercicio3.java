package ex3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno =  new Aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.name = sc.nextLine();
		System.out.println("Digite a primeira nota: ");
		aluno.n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		aluno.n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.grade());
		
		if (aluno.results() != 0.0) {
			System.out.printf("MISSING %.2f POINTS%n", aluno.results());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}	
}
