package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe a quantidade de produtos: ");
		n = sc.nextInt();
		
		Product[] vet = new Product[n]; 
		
		for(int i = 0; i < n; i++) {
			
			sc.nextLine();
			System.out.print("Informe o nome do produto : ");
			String name = sc.nextLine();
			System.out.printf("Informe o preco do produto: ");
			double price = sc.nextDouble();
			vet[i] = new Product(name, price);
			
		}
		
		System.out.println();
		
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			
			sum += vet[i].getPrice();
			
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE : %.2f%n", avg);
		System.out.println();
		
		
		
		System.out.printf("LISTA DE PRODUTOS : %n");
		
		for (int i = 0; i < n; i++) {
			System.out.println(vet[i].getName());
		}
		
		
		sc.close();
		
	}


}
