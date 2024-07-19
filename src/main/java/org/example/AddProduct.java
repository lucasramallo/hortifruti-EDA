package org.example;

import java.util.Scanner;
import org.example.DoublyLinkedList.DoublyLinkedList;

public class AddProduct {
    public static void execute(DoublyLinkedList list){
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String prodName = input.nextLine().trim().toUpperCase();   
        System.out.print("Quantidade: ") ;
        int prodAmount = input.nextInt();

        try {
            Product existingProduct = list.getByName(prodName);
            existingProduct.setAmount(existingProduct.getAmount() + prodAmount);

            System.out.println("Produto adicionado com sucesso!");
        } catch (RuntimeException e) {
            list.add(new Product(prodName, prodAmount));
            System.out.println("Produto adicionado com sucesso!");
        }
    }
}