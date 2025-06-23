package Application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Entities.Product;

public class Program {
	// Mudando do método Comparable para o default method "sort" da
	// Interface list "default void sort(Comparator<? super E> c)"
	// pois no método "Comparable" nossa classe nao fica fechada para
	// alteração e se o critério de comparação mudar, precisaremos alterar
	// a classe Product e isso é indesejável.

	// Criando uma classe "MyComparator" implementando uma interface
	// "Comparator" e seu método "compare".

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		// Adicionando dados na lista...
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Table", 450.0));
		list.add(new Product("Notebook", 1200.0));

		list.sort(new MyComparator());

		// Imprimindo os itens da lista list
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
