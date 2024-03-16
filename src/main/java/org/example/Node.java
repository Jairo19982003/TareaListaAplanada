package org.example;

public  class Node {
    int data;
    Node prev;
    Node next;
    DoubleLinkedList SecundaryNode;

    DoubleLinkedList ThirdNode;

    Node(int d) {
        this.data = d;
        this.next = null;
        this.prev = null;
        this.SecundaryNode = null;
        this.ThirdNode = null;
    }
}
