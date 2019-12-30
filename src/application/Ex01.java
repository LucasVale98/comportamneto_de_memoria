package application;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dgite o tamanho do vetor: ");
		int n = scanner.nextInt(); 
		double[] vetor = new double[n];

		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scanner.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		double media = soma / n;
		
		System.out.printf("A media é de: %.2f%n", media);
		
		scanner.close();
	}
}
