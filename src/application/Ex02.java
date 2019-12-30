package application;

import java.util.Scanner;

import entities.Product;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		Product[] vetor = new Product[n];
		
		for (int i = 0; i < vetor.length; i++) {
			scanner.nextLine();
			String nome = scanner.nextLine();
			double preco = scanner.nextDouble();
			vetor[i] = new Product(nome, preco);
		}
		
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		double media = soma / n;
		
		System.out.printf("MEDIA DO PREÇO: %.2f%n", media);
		
		scanner.close();
	}
}
