package com.company;

public class Shampoo extends Article {
    private int amount;

    public Shampoo(String name, double price, int amount) {
        super(name, price);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  "Nombre: " + this.getName() + " /// " +
                "Contenido: " + this. amount + "ml /// " +
                "Precio: " + this.getPrice();
    }
}
