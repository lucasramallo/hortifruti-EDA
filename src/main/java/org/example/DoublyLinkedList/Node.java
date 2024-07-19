package org.example.DoublyLinkedList;

import org.example.Product;

public class Node {
    private Product value;
    private Node next;
    private Node previous;

    public Node(Product object, Node next) {
        this.value = object;
        this.next = next;
    }

    public Product getValue() {
        return value;
    }

    public void setValue(Product value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String nextNodeStr = (this.next != null) ? "Next value: " + this.next.getValue().getName() : "Next value: " + null;
        String previousNodeStr = (this.previous != null) ? "previous: " + this.previous.getValue().getName() : "previous: " + null;
        return "Node{" + previousNodeStr +
                ",  " + "value: " + value.getName() +
                ",  " + nextNodeStr +
                '}';
    }

}
