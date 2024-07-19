package org.example;

public class Product implements Comparable<Product> {
    private String name;
    private int amount;

    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void withdraw(int amount) {
        if(amount > getAmount()) {
            int currentAmount = getAmount();
            setAmount(0);
            System.out.println("Não há a quantidade solicitada, foram retirados apenas " + currentAmount);
        } else {
            setAmount(getAmount() - amount);
        }
    }


    @Override
    public int compareTo(Product o) {
        return this.getName().compareTo(o.getName());
    }
}
