package org.example;

import java.util.Scanner;
import org.example.DoublyLinkedList.DoublyLinkedList;
import org.example.util.Sorter;

public class ListProducts {
    public static void execute(DoublyLinkedList list){
        Sorter.sortDoublyLinkedList(list);
        System.out.println(list);
    }
}