package com.zanardo.listaencadeada.estruturadados;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada2<String> list = new ListaEncadeada2<>();
        
        inicializaList(list);

        System.out.println("Lista: ");
        System.out.println(list);

        ListaEncadeada2<String> invertList = inverteLista(list);
        list = inverteLista(invertList);

        System.out.println("Lista Invertida: ");
        System.out.println(list);
    }

    private static void inicializaList(ListaEncadeada2<String> list) {
        list.adiciona("Posição 1");
        list.adiciona("Posição 2");
        list.adiciona("Posição 3");
        list.adiciona("Posição 4");
        list.adiciona("Posição 5");
        list.adiciona("Posição 6");
        list.adiciona("Posição 7");
        list.adiciona("Posição 8");
        list.adiciona("Posição 9");
        list.adiciona("Posição 10");
    }

    private static ListaEncadeada2<String> inverteLista(ListaEncadeada2<String> list) {
        ListaEncadeada2<String> invertList = new ListaEncadeada2<>();
        while (list.getTamanho() > 0) {
            String elemento = list.removeInicio();
            invertList.adicionaInicio(elemento);
        }
        return invertList;
    }
}
