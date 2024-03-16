package org.example;
import org.example.Node;

import org.example.DoubleLinkedList;


public class FlattenedLinkedList {
     DoubleLinkedList listaAplanada = new DoubleLinkedList();

    public FlattenedLinkedList(DoubleLinkedList lista) {
        Node current = lista.getHead();
        while (current != null) {
            listaAplanada.add(current.data);
            if (current.SecundaryNode != null) {
                Node currentSecundary = current.SecundaryNode.getHead();
                while (currentSecundary != null) {
                    listaAplanada.add(currentSecundary.data);
                    if (currentSecundary.ThirdNode != null) {
                        Node currentThird = currentSecundary.ThirdNode.getHead();
                        while (currentThird != null) {
                            listaAplanada.add(currentThird.data);
                            currentThird = currentThird.next;
                        }
                    }
                    currentSecundary = currentSecundary.next;
                }
            }
            current = current.next;
        }
    }

    public void print() {
        listaAplanada.print();
    }


}