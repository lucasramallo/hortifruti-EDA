package org.example;

import java.util.Scanner;
// import org.example.Product;
import org.example.DoublyLinkedList.DoublyLinkedList;
import org.example.util.Sorter;

public class Main {
    public void init(){
        int choice = menu();

        while(choice != 5){
            choice = menu();
        }
    }
    public int menu(){
         Scanner input = new Scanner(System.in);

         System.out.println("=== Menu ===");
         System.out.println("1 - Adicionar produto");
         System.out.println("4 - Checar existência de produto");
         System.out.println("5 - Sair");

         int option = input.nextInt();
         System.out.println();

         return option;
     }
    public static void main(String[] args) {
        DoublyLinkedList dbl = new DoublyLinkedList();

        Product prod = new Product("tomate", 8);
        Product prod2 = new Product("abacate", 2);
        Product prod3 = new Product("jiló", 7);

        dbl.add(prod);
        dbl.add(prod2);
        dbl.add(prod3);

//        Sorter.sortDoublyLinkedList(dbl);
        System.out.println(dbl);
    }
}