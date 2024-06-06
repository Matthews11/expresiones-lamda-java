package org.expresiones.lambda.main;

import java.util.List;

import org.expresiones.lambda.introduccion.interfaz.DataBaseService;
import org.expresiones.lambda.introduccion.model.Employee;
import org.expresiones.lambda.introduccion.model.Product;

public class MainApp {

	public static void main(String[] args) {
		
		 System.out.println(Product.class.getName());
		 System.out.println(Employee.class.getName());
		 System.out.println(String.class.getName());
		 
		 DataBaseService<String> dataBaseAnonimo = new DataBaseService<String>() {
			
			@Override
			public String getById(Long id) {
				// TODO Auto-generated method stub
				return "Devolviendo el valor desde la clase anonima: "+id;
			}
			
			@Override
			public List<String> getAllRecords() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		 System.out.println(dataBaseAnonimo.getClass().getName());
		 System.out.println(dataBaseAnonimo.getById(20l));
	}
}
