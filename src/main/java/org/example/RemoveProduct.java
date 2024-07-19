package org.example;

import org.example.DoublyLinkedList.DoublyLinkedList;

import java.util.Scanner;

public class RemoveProduct {
    public static void execute(DoublyLinkedList list){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String prodName = input.nextLine().trim().toUpperCase();
        System.out.print("Quantidade: ") ;
        int prodAmount = input.nextInt();

        Product product = list.getByName(prodName);

        product.withdraw(prodAmount);

        if(product.getAmount() == 0) {
            System.out.println(product.getAmount() + "dento");
            int productToRemoveIndex = list.getIndexNodeByName(prodName);
            list.remove(productToRemoveIndex);
        }
        System.out.println("Produto retirado!");
    }
}
