package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Article> stock = new ArrayList<>();
        stock.add(new Drink("Coca-Cola", 18, 1.5));
        stock.add(new Drink("Coca-Cola Zero", 20, 1.5));
        stock.add(new Shampoo("Shampoo Sedal", 19, 500));
        stock.add(new Fruit("Frutillas", 64, "kilo"));

        for(int i = 0; i < stock.size(); i++){
            System.out.println(stock.get(i).toString());
        }

        System.out.println("=============================");
        Collections.sort(stock);
        System.out.println("Producto más caro: " + stock.get(0).getName());

        Collections.sort(stock, Collections.reverseOrder());
        System.out.println("Producto más barato: " + stock.get(0).getName());
    }
}
