package br.com.java9;

import java.util.List;
import java.util.function.Predicate;

/**
 * 
 */

/**
 * @author rafael
 *
 */
public class Takewhile {
	
	public void main(String[] args) {
		Predicate<Integer> predicate1 = p -> p > 4;
		Predicate<Integer> predicate2 = p -> p < 4;
		
		List palavras = List.of(1, 2, 3, 4, 5, 6);
		System.out.println("P1");
		palavras.stream().takeWhile(predicate1).forEach(w -> System.out.println(w));
		System.out.println("\n\nP2");
		palavras.stream().takeWhile(predicate2).forEach(w -> System.out.println(w));
		
	}

}
