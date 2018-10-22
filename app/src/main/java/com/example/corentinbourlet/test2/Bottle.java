package com.example.corentinbourlet.test2;

public class Bottle {
    String name;
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    Bottle(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
