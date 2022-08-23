package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgramArrayIterator {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Java");
		nomes.add("python");
		nomes.add("ruby");
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			String atual = it.next();
			System.out.println(atual);
			//it.remove();
		}
		System.out.println(nomes.size());
		
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}

}
