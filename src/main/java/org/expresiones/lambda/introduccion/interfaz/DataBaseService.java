package org.expresiones.lambda.introduccion.interfaz;

import java.util.List;

public interface DataBaseService<T> {

	
	T getById(Long id);
	
	List<T> getAllRecords();
}
