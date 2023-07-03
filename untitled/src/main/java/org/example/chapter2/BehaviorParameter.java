package org.example.chapter2;

import java.util.ArrayList;
import java.util.List;

import static org.example.chapter2.BehaviorParameter.Color.GREEN;
import static org.example.chapter2.BehaviorParameter.Color.RED;

public class BehaviorParameter {


    public enum Color {RED,GREEN}

    public static List<Apple> filterColorApples(List<Apple> inventory,Color color){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(color.equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }


}
