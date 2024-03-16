package org.example;

public class DoubleLinkedList {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void linkNode(int index, int Data) {
        Node current = head;
        int count = 0;
        while (current != null && count < index) {
            count++;
            current = current.next;
        }

        if (current != null) {
            if (current.SecundaryNode == null) {
                current.SecundaryNode = new DoubleLinkedList(); // Aquí inicializamos el nodo secundario si es nulo
                current.SecundaryNode.add(Data); // Agregamos el nuevo nodo secundario
            } else {
                current.SecundaryNode.add(Data); // Agregamos el nuevo nodo secundario
            }
        }
    }
    public void linkNode2(int index, int newIndex, int Data) {
        Node listaP = head;
        int count = 0;
        while (listaP != null && count < index) {
            count++;
            listaP = listaP.next;
        }

        Node current = listaP.SecundaryNode.head;
        int newCount = 0;
        while (current != null && newCount < newIndex) {
            newCount++;
            current = current.next;
        }

        if (current != null) {
            if (current.ThirdNode == null) {
                current.ThirdNode = new DoubleLinkedList(); // Aquí inicializamos el nodo secundario si es nulo
                current.ThirdNode.add(Data); // Agregamos el nuevo nodo secundario
            } else {
                current.ThirdNode.add(Data); // Agregamos el nuevo nodo secundario
            }
        }
    }




    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            if (current.SecundaryNode != null) {
                System.out.printf("[");
                while(current.SecundaryNode.head != null){
                    System.out.println(current.SecundaryNode.head.data);
                    if(current.SecundaryNode.head.ThirdNode != null){
                        System.out.println("[");
                        current.SecundaryNode.head.ThirdNode.print();
                        System.out.println("]");
                    }
                    current.SecundaryNode.head = current.SecundaryNode.head.next;
                }
                System.out.println("]");
            }
            current = current.next;
        }
    }

    public void printReverse() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            if (current.SecundaryNode != null) {
                System.out.printf("[");
                while(current.SecundaryNode.tail != null){
                    System.out.println(current.SecundaryNode.tail.data);
                    if(current.SecundaryNode.tail.ThirdNode != null){
                        System.out.println("[");
                        current.SecundaryNode.tail.ThirdNode.print();
                        System.out.println("]");
                    }
                    current.SecundaryNode.tail = current.SecundaryNode.tail.next;
                }
                System.out.println("]");
            }
            current = current.prev;
        }
    }
}
