package org.example;
import org.example.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList lista = new DoubleLinkedList();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.linkNode(2, 7);
        lista.linkNode(2, 8);
        lista.linkNode(2, 9);
        lista.linkNode(2, 10);
        lista.linkNode2(2,1, 11);
        lista.linkNode2(2,1, 12);


        FlattenedLinkedList listaAplanada = new FlattenedLinkedList(lista);
        listaAplanada.print();

    }
}