package application;

import java.util.Locale;
import java.util.Scanner;												

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas : ");
		int n = sc.nextInt();
		
		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		double[] vetAltura = new double[n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Nome da %da pessoa: %n", i + 1);
			System.out.print("Nome : ");
			vetNome[i] = sc.next();
			System.out.print("Idade : ");
			vetIdade[i] = sc.nextInt();
			System.out.print("Altura : ");
			vetAltura[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		double countMenorDe16 = 0;
		
		
		
		for (int i = 0; i < n; i++) {
			
			soma += vetAltura[i];
			
			if (vetIdade[i] < 16) {
				
				countMenorDe16++;
			}
			
			
			
		}
		
		double mediaAltura = soma / n;
		double percentualMenorDe16 = ((double) countMenorDe16 / n) * 100;
		
		System.out.printf("Altura media : %.2f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos : %.2f%%\n", percentualMenorDe16);
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			if (vetIdade[i] < 16) {
				
				System.out.println(vetNome[i]);
				
			}
		}
		
		sc.close();
		
	}

}
