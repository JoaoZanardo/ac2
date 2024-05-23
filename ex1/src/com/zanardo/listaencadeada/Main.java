package com.zanardo.listaencadeada;

public class Main {
	public static void main(String[] args) {
		ListaEncadeada2<Integer> list = new ListaEncadeada2<>();

		inicializeList(list);

		System.out.println("Lista Incial: ");
		System.out.println(list);

		modifyList(list);

		System.out.println("Lista Final: ");
		System.out.println(list);
	}

	private static void inicializeList(ListaEncadeada2<Integer> list) {
		list.adiciona(10);
		list.adiciona(20);
		list.adiciona(30);
		list.adiciona(40);
		list.adiciona(50);
	}

	private static void modifyList(ListaEncadeada2<Integer> list) {
		list.adiciona(1, 53);
		list.remove(4);
		list.adiciona(0, 5);
		list.removeFinal();
	}
}