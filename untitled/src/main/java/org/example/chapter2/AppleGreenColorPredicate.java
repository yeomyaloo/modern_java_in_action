package org.example.chapter2;

import static org.example.chapter2.BehaviorParameter.*;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
