package ws;

//import java.util.ArrayList;
//import java.util.List;

import entities.Product;

public class ProductWS {

	public Product find() {
		return new Product("p1", "Computer", 28000.0);
	}
	
//	public List<Product> findAll() {
//		List<Product> productList = new ArrayList<Product>();
//		productList.add(new Product("p1", "product1", 100));
//		productList.add(new Product("p2", "product2", 200));
//		productList.add(new Product("p3", "product3", 300));
//		return productList;
//	}
}
