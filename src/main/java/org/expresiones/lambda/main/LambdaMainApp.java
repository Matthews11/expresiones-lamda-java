package org.expresiones.lambda.main;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

import org.expresiones.lambda.introduccion.interfaz.Math;

public class LambdaMainApp {

	public static void main(String[] args) {
//		int num = 10;
		AtomicInteger numAtomic = new AtomicInteger(10);
		AtomicReference<Integer> num = new AtomicReference<Integer>(10);
		IntStream.range(1, 10).forEach(i-> num.set(num.get()+i));
		
		System.out.println(num);
	}
	
	
	public static void example() {
		Math substract = new Math() {

			@Override
			public Double execute(Double a, Double b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		};

		
		Math multiply = (a,b)->{return a*b;};
		Math divide = (a,b)->{
			System.out.println("Start operation");
			return a/b;
			
		};
		
		System.out.println(substract.execute(2.0, 2.0));
		System.out.println(multiply.execute(2.0, 2.0));
		System.out.println(divide.execute(10.0, 2.0));
		System.out.println(divide.sum(10.0, 2.0));
	}
	
	public static void exampleLambda() {
List<String> countries = List.of("Italia","EEUU","ESA","MEX");
		
		for(String c: countries) {
			System.out.println(c);
		}
		
		
		countries.forEach(c->{
			System.out.println(c.toLowerCase());
		});
	}
}
