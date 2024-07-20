package com.product.ProductManagementSpringWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component

public class ProductService {
	@Autowired
    ProductDB db;

    public void addProduct(Product p) {
    	//products.add(p);
    	db.save(p);
    }
    

	public ArrayList<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return (ArrayList<Product>) db.findAll();
	}


	public Product getProduct(String string) {
		// TODO Auto-generated method stub

		return db.findByName(string);
	}

/*
	public ArrayList<Product> getProductsWithText(String string) {
		// TODO Auto-generated method stub
		String str = string.toLowerCase();
		ArrayList<Product> prods = new ArrayList<>();
		
		for(Product p1 : products){
			String name = p1.getName().toLowerCase();
			String type = p1.getType().toLowerCase();
			String place = p1.getPlace().toLowerCase();
			if(name.contains(string) || type.contains(string) || place.contains(string))
				prods.add(p1);
		}
		
		return prods;
	}*/
}
