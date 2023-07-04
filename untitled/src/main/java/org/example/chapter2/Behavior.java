package org.example.chapter2;


import java.util.ArrayList;
import java.util.List;

interface Predicate<T>{
    boolean test(T t);
}
public class Behavior {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();

        for (T e : list) {
            if (predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}

List<Apple> redApples = filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));