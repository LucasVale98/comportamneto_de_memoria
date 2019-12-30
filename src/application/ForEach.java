package application;

public class ForEach {
	public static void main(String[] args) {
		String vetor[] = new String[] {"Maria", "João", "Paula", "Ana"};
		
		System.out.println("Loop For");
		for (int i = 0; i < vetor.length; i++) {
			System.err.println(vetor[i]);
		}
		
		System.out.println("----------------------------------------");
		System.out.println("Loop For Each");
		for (String obj: vetor) {
			System.out.println(obj);
		}
	}
}
