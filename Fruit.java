package com.company;

public class Fruit extends Article {
    private String salesUnit;

    public Fruit(String name, double price, String salesUnit) {
        super(name, price);
        this.salesUnit = salesUnit;
    }

    @Override
    public String toString() {
        return  "Nombre: " + this.getName() + " /// " +
                "Precio: " + this.getPrice() + " /// " +
                "Unidad de venta: " + this.salesUnit;
    }
}
