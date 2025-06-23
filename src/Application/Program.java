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

		//Criada uma variável "comp" objeto do tipo Comparator<Product> e criada
		//uma classe anônima no programa principal.
		
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};

		list.sort(comp);

		// Imprimindo os itens da lista list
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
