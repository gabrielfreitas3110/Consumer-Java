package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("sMouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.90));
		
		//list.forEach(new PriceUpdate());
		//list.forEach(Product::staticPriceUpdate);
		list.forEach(Product::nonStaticPriceUpdate);
		
		list.forEach(System.out::println);
	}
}