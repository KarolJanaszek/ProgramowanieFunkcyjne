package com.company.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class InterfejsyFunkcujne {

	public static void main(String[] args) {

		// Consumer
		Suma suma = (a, b) -> a + b;
//        System.out.println(suma.dodaj(10,34));

		// Supplier
		List<String> stringList = List.of("Ala", "ma", "kota");
//        stringList.forEach(System.out::println);
		Optional<String> opt = Optional.of("Ala");
		String s = opt.orElseGet(() -> new String("Pies"));

		// UnaryOperator
		UnaryOperator operator = (str) -> s.toUpperCase();
//        System.out.println(operator.apply(s));

		// Function
		List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        System.out.println(listToMap(integers));

		// Predicate
		Predicate<String> predicate = (str) -> str.contains("kot");
		for (String s1 : stringList) {
			System.out.println(s1 + " contains kot? " + predicate.test(s1));
		}
	}

	private static Map<Integer, String> listToMap(List<Integer> list) {
		Function<Integer, String> function = l -> " text = " + l.toString();

		Map<Integer, String> map = new HashMap<>();
		for (Integer e : list) {
			map.put(e, function.apply(e));
		}

		return map;
	}
}
