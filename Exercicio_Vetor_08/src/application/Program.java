package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor ? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero : ");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		
		double media = soma / vet.length;
		
		System.out.println("MEDIA DO VETOR " + media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA :");
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
		

	}

}
