package br.com.java9;

import java.util.stream.Stream;

public class Iterate {

	public void main(String[] args) {
		Stream.iterate(5, num-> num > 0, num -> num -1 ).forEach(System.out::println);
		
		
		System.out.println("");
		
		Stream.iterate(5, num -> num -1 )
		.limit(5)
		.forEach(System.out::println);
		
		Stream.generate(() -> 1).limit(5).forEach(System.out::println);
		
	}
	
	
	
}
