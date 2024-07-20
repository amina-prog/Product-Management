package com.product.ProductManagementSpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class ProductManagementSpringWebApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductManagementSpringWebApplication.class, args);
		/*ProductService service = context.getBean(ProductService.class);
		ArrayList<Product> p = service.getAllProducts();
		for(Product p2 : p) {
			System.out.println(p2);
		}*/
	}

}
