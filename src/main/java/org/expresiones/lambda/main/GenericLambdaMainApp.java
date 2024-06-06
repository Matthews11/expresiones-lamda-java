package org.expresiones.lambda.main;

import org.expresiones.lambda.introduccion.interfaz.Printer;
import org.expresiones.lambda.introduccion.model.Employee;
import org.expresiones.lambda.introduccion.model.Product;

public class GenericLambdaMainApp {

	
	public static void main(String[] args) {
		
	
	
	}
	
	public static void example() {
		Printer<String> printString = (string)->{
			System.out.println(string);
		
		};
		
		Printer<Product> printProduct = product->System.out.println(product);
		Printer<Employee> printEmployee = product->System.out.println(product);
		Product product = new Product();
		product.setId(20l);
		product.setName("Iphone");
		product.setPrice(1000.00);
		
		printProduct.print(product);
		
		printEmployee.print(new Employee());
	}
	
}
