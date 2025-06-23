package Application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import Entities.Product;


public class Program {
	// Agora, ignorando a classe "MyComparator", e declararando um Comparator
	// no programa principal utilizando uma classe "anônima".

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		// Adicionando dados na lista...
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Table", 450.0));
		list.add(new Product("Notebook", 1200.0));

		//Simplificando mais ainda a função anônima.
		
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		// Imprimindo os itens da lista list
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
