package org.expresiones.lambda.introduccion.model;

public class Employee {

	private String dni;
	
	private String name;
	
	private Double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [dni=" + dni + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
