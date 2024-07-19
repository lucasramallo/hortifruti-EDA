package org.example;

import org.example.DoublyLinkedList.DoublyLinkedList;
import org.example.util.Sorter;

import java.util.Scanner;

public class VerifyIfExist {
    public static void execute(DoublyLinkedList list){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String prodName = input.nextLine().trim().toUpperCase();

        try {
            Product product = list.getByName(prodName);

            System.out.println("\nProduto Existente!");

            System.out.println("Nome: " + product.getName());
            System.out.println("Quantidade: " + product.getAmount());
        } catch (RuntimeException e) {
            System.out.println("\nProduto não encontrado!");
        }
    }
}
