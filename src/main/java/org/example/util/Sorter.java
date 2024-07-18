package org.example.util;

import org.example.DoublyLinkedList.DoublyLinkedList;
import org.example.Product;

public class Sorter {
    public static void sortDoublyLinkedList(DoublyLinkedList lista){
        for(int i = 0; i < lista.size(); i++) {
            for(int j = lista.size() - 1; j > i; j--) {

                if(lista.get(j).compareTo(lista.get(j - 1)) < 0) {
                    Product value1 = lista.get(j);
                    Product value2 = lista.get(j - 1);
                    lista.remove(j);
                    lista.remove(j - 1);

                    lista.add(j - 1, value1);
                    lista.add(j, value2);

                }
            }
        }
    }
}