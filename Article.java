package com.company;

public abstract class Article implements Comparable<Article> {
    private String name;
    private double price;

    public Article(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Article o) {
        return this.price > o.getPrice() ? 1 : -1;
    }
}
