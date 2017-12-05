package com.alandiay.my.spring.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Java8Class {

	@FunctionalInterface
	interface Operation {
		int effectuer(int a, int b);
	}

	public int calculer(int a, int b, Operation operation) {
		return operation.effectuer(a, b);
	}

	public static void main(String[] args) {
		List<Personne> personnes = new ArrayList<Personne>();
		personnes.add(new Personne("sow", "khadidja"));
		personnes.add(new Personne("ndiaye", "alassane"));
		personnes.add(new Personne("diop", "khadidja"));
		personnes.add(new Personne("dia", "khadidja"));
		personnes.add(new Personne("cisse", "khadidja"));
		personnes.add(new Personne("ciss", "khadidja"));
		personnes.add(new Personne("ciss", "khadidja"));
		personnes.forEach(param -> System.out.println(param.getNom()));
		Consumer<Personne> consommateur = param -> System.out.println(param);
		personnes.forEach(consommateur);
		personnes.sort((x, y) -> y.getNom().compareTo(x.getNom()));
		//personnes.forEach(param -> System.out.println(param.getNom()));

		final Integer i = 2;
		consommateur.andThen(consommateur);

		BiFunction<Integer, Integer, Long> additionner = (val1, val2) -> {
			int x = val1 + val2 + i;
			return (long) x;
		};

		Operation plus = (x, y) -> x + y;
		Java8Class java = new Java8Class();
		Operation fois = (x, y) -> x * y;

		System.out.println(java.calculer(3, 5, plus));
		System.out.println(java.calculer(3, 5, fois));

		System.out.println(additionner.apply(1, 2));

		personnes.parallelStream().parallel().filter(x -> x != null).distinct().forEach((x) -> System.out.println(x.getNom()));
	}

}
