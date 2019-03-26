package com.company;

public class Drink extends Article {
    private double size;

    public Drink(String name, double price, double size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return  "Nombre: " + this.getName() + " /// " +
                "Litros: " + this.size + " ///" +
                "Precio: $" + this.getPrice();
    }
}
