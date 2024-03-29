package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar : ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero : ");
			vet [i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma += vet[i];
		}
		
		System.out.println();
		
		double media = soma / n;
		
		System.out.print("Valores digitados : ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.2f ", vet[i]);
		}
		
		System.out.println();
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();

	}

}
