package org.expresiones.lambda.introduccion.impl;

import java.util.List;
import java.util.UUID;

import org.expresiones.lambda.introduccion.interfaz.DataBaseService;
import org.expresiones.lambda.introduccion.model.Employee;

public class EmployeeDBImpl implements DataBaseService<Employee> {

	@Override
	public Employee getById(Long id) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setDni(UUID.randomUUID().toString());
		employee.setName("Mathew Molina");
		employee.setSalary((double) 300);
		return employee;
	}

	@Override
	public List<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

}
