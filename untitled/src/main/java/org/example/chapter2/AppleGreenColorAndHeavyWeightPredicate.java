package org.example.chapter2;

import static org.example.chapter2.BehaviorParameter.Color;

public class AppleGreenColorAndHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN) && apple.getWeight() > 150;
    }
}

