package org.example;

import java.util.Scanner;

import org.example.DoublyLinkedList.DoublyLinkedList;
import org.example.util.Sorter;

public class Main {
    public static void init(DoublyLinkedList list){
        int choice = menu();

        while(choice != 5){
            switch(choice){
                case 1:
                    AddProduct.execute(list);
                    break;
                case 2:
                    ListProducts.execute(list);
                    break;
                case 3:
                    RemoveProduct.execute(list);
                    break;
                case 4:
                    VerifyIfExist.execute(list);
                    break;
                default:
                    System.out.println("[ERRO]: Opção inválida!");
                    break;
            }
            choice = menu();
        }
    }

    public static int menu(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n=== Menu ===");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Retirar produto");
        System.out.println("4 - Checar existência de produto");
        System.out.println("5 - Sair");

        System.out.print("\nOpção: ");
        int option = input.nextInt();
        System.out.println();

        return option;
    }

    public static void main(String[] args) {
        DoublyLinkedList dbl = new DoublyLinkedList();
        Product prod = new Product("TOMATE", 8);
        Product prod2 = new Product("ABACATE", 2);
        Product prod3 = new Product("JILÓ", 7);
        Product prod4 = new Product("ABOBRINHA", 3);
        Product prod5 = new Product("KIWI", 5);

        dbl.add(prod);
        dbl.add(prod2);
        dbl.add(prod3);
        dbl.add(prod4);
        dbl.add(prod5);
        // Sorter.sortDoublyLinkedList(dbl);
        System.out.println(dbl);

        init(dbl);
    }
}