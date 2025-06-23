package Application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Entities.Product;

public class Program {
	// Esperiência com o Comparator.

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		// Adicionando dados na lista...
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Table", 450.0));
		list.add(new Product("Notebook", 1200.0));
		
		Collections.sort(list);

		// Imprimindo os itens da lista list
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
