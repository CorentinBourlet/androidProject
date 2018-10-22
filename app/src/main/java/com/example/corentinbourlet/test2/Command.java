package com.example.corentinbourlet.test2;

import java.util.ArrayList;
import java.util.List;

public class Command {

    public List<Bottle> listBottle;
    int numberOfBottle;

    void addBottle(String name, int price) {
        listBottle.add(new Bottle(name, price));
        numberOfBottle += 1;
    }

    Command() {
        numberOfBottle = 0;
        listBottle=new ArrayList<Bottle>();
    }

    Bottle getBottle(String name) {
        int i =0;
        while (name != listBottle.get(i).getName()&&i< numberOfBottle)
        {
            i+=1;
        }
        if (i!=numberOfBottle ){
            return listBottle.get(i);
        }
        else{
            return null;
        }
    }

    float totalCost() {
        int price = 0;
        for (int i = 0; i < numberOfBottle; i++) {
            price = price + listBottle.get(i).getPrice();
        }
        return price;
    }
}
