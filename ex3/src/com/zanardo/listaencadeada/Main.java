package com.zanardo.listaencadeada;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Employee> employees = new LinkedList<>();

		employees.add(new Employee("João", "Desenvolvedor", 7000));

		employees.add(new Employee("Maria", "Advogada", 1260.0));

		System.out.println("Lista Incial de funcionários: ");
		employees.forEach(System.out::println);

		employees.removeIf(e -> e.name.equals("João"));
		employees.stream()
				.filter(e -> e.name.equals("Maria"))
				.forEach(e -> e.income = 3000.0);

		System.out.println("Lista Final de Funcionários: ");
		employees.forEach(System.out::println);

		boolean existsMaria = employees.stream().anyMatch(e -> e.name.equals("Maria"));
		System.out.println("Maria está presente na lista? " + (existsMaria ? "Sim" : "Não"));
	}
}
