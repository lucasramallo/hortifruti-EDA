package org.example.DoublyLinkedList;

import org.example.Product;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean add(int index, Product value) {
        if(index <= this.size && index >= 0) {
            Node node = new Node(value, null);

            if(index == 0) {
                if(this.size > 0) {
                    node.setNext(this.head);
                    this.head.setPrevious(node);
                    this.head = node;
                } else {
                    this.head = node;
                    this.tail = node;
                }
                this.size++;
                return true;
            } 

            if(index == this.size) {
                node.setPrevious(this.tail);
                this.tail.setNext(node);
                this.tail = node;
                this.size++;
                return true;
            }

            Node previousNode = getNode(index - 1);
            Node nextNode = getNode(index);

            node.setNext(nextNode);
            node.setPrevious(previousNode);
            previousNode.setNext(node);
            if (nextNode != null) {
                nextNode.setPrevious(node);
            }

            this.size++;
            return true;
        }
        return false;
    }

    public void add(Product value) {
        Node node = new Node(value, null);
        if(this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            Node previous = this.tail;
            this.tail = node;
            node.setPrevious(previous);
            previous.setNext(this.tail);
        }
        this.size++;
    }

    public boolean remove(int index) {
        if(index == 0){
            if(this.size > 1) {
                Node nextNode = getNode(1);
                nextNode.setPrevious(null);
                this.head = nextNode;
                this.size--;
                return true;
            } else {
                this.head = null;
                this.tail = null;
                this.size--;
                return true;
            }
        } else if(index == this.size - 1){
            Node previousNode = this.tail.getPrevious(); 
            previousNode.setNext(null);
            this.tail = previousNode;
            this.size--;
            return true;
        }

        Node previousNode = getNode(index - 1);
        Node nodeToRemove = getNode(index);
        Node nextNode = getNode(index + 1);

        previousNode.setNext(nextNode);
        if(nextNode != null) {
            nextNode.setPrevious(previousNode);
        }

        this.size--;
        return true;
    }

    public Node getNode(int index) {
        Node node = this.head;
        for(int i = 0; i < index; i++) {
            if (node.getNext() == null) {
                return null;
            }
            node = node.getNext();
        }

        return node;
    }

    public Product get(int index) {
        Node node = this.head;
        for(int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node.getValue();
    }

    private void setHead(Node node) {
        this.head = node;
    }

    private Node getHead() {
        return head;
    }

    private int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString(){
        Node nod = this.head;
        String str = "";

        System.out.println();
        while(nod != null){
            // System.out.println(nod); // Mostra nodos previous e next
            str += nod.getValue().getName() + ": " + nod.getValue().getAmount() + "\n";
            nod = nod.getNext();
        }

        return str;
    }
}
