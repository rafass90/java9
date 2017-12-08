package br.com.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public void main(String[] args) {

		List  names = new ArrayList(); 
		names.add( "David");
		names.add( "Sam");
		names.add( "Ben");

		names.stream().forEach(s -> printNames(() -> s));
		
	}

	static void printNames(Supplier arg) {
		System.out.println(arg.get());
	}
}