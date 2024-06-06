package org.expresiones.lambda.introduccion.impl;

import java.util.List;

import org.expresiones.lambda.introduccion.interfaz.DataBaseService;
import org.expresiones.lambda.introduccion.model.Product;

public class ProductDBImpl implements DataBaseService<Product>{

	@Override
	public Product getById(Long id) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setId(id);
		product.setName("pc");
		product.setPrice((double) 2000);
		return product;
	}

	@Override
	public List<Product> getAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

}
