package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos elementos vai ter o vetor ? ");
		int n = sc.nextInt();
		
		int[] vet = new int [n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		double soma = 0;
		int npares = 0;
		
		

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				
				soma += vet[i];
				npares++;
			}
			
		}
		
		
		
		double media = (double) soma / npares;
		
		System.out.println("MEDIA DOS PARES : " + media);
		
		sc.close();

	}

}
