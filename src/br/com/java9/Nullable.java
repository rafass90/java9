package br.com.java9;

import java.util.List;
import java.util.stream.Stream;

public class Nullable {

	public void main(String[] args) {

		System.out.println("1:");
		Stream.ofNullable(null).forEach(System.out::println);
		
		System.out.println("\n2:");
		Stream.ofNullable(List.of("A", "B", "C")).forEach(System.out::println);

		System.out.println("\n3:");
		Stream.concat(Stream.empty(), List.of("A", "B", "C").stream()).forEach(System.out::println);
		
		System.out.println("\n4:");
		Stream.concat(Stream.ofNullable(false), Stream.ofNullable("A")).forEach(System.out::println);
		Stream.concat(Stream.ofNullable(null), Stream.ofNullable(2)).forEach(System.out::println);
	}

}