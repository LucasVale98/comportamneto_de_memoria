package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Paula");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana Claudia");
		list.add(2, "Marco");
		
		for(String lista: list) {
			System.out.println(lista);
		}
		System.out.println("Tamanho da Lista: " + list.size());
		
		System.out.println("--------------------------");
		list.remove("Bob");
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(list.size());
		for(String lista: list) {
			System.out.println(lista);
		}
		
		System.out.println("--------------------------");
		System.out.println("Indície do Alex: " + list.indexOf("Alex"));
		System.out.println("Indície do Bob: " + list.indexOf("Bob"));
		
		System.out.println("--------------------------");
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String string : resultado) {
			System.out.println(string);
		}
		
		System.out.println("--------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("--------------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(nome);
	}	
}
