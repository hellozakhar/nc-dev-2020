package com.mycompany.util;

public class Node<E> {
    private E element;
    private Node nextNode;

    public Node() {
    }

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public E getData() {
        return element;
    }

    public void setData(E element) {
        this.element = element;
    }

    public Node getNext() {
        return nextNode;
    }

    public void setNext(Node nextNode) {
        this.nextNode = nextNode;
    }
}
