package org.expresiones.lambda.introduccion.impl;

import java.util.List;

import org.expresiones.lambda.introduccion.interfaz.DataBaseService;

public class MongoDBImpl implements DataBaseService{

	@Override
	public String getById(Long id) {
		// TODO Auto-generated method stub
		return "Getting data from Mongo whit id: "+id;
	}

	@Override
	public List<String> getAllRecords() {
		// TODO Auto-generated method stub
		return List.of("Hellow Word Mongo");
	}

}
