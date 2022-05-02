package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("João");
		list.add("Bob");
		list.add("Ana");
		list.add("Cris");
		
		
		System.out.println(list.size());
		
		for (String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("------------------");
		list.removeIf( x -> x.charAt(0) == 'M');
		for (String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Cris" + list.indexOf("Cris"));
		System.out.println("------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		result.add("Maria");
		for (String nomes : result) {
			System.out.println(nomes);
		}
		
		System.out.println("------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
