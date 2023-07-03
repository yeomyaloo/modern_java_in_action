package org.example.chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.chapter2.BehaviorParameter.Color.GREEN;
import static org.example.chapter2.BehaviorParameter.Color.RED;
import static org.junit.jupiter.api.Assertions.*;

class BehaviorParameter2Test {

    @DisplayName("조건에 따른 사과 필터링 메소드 테스트")
    @Test
    void filterApples() {
        List<Apple> inventory = List.of(new Apple(GREEN, 180)
                ,new Apple(RED, 180)
                ,new Apple(GREEN, 120)
                , new Apple(GREEN, 300));

        List<Apple> apples = BehaviorParameter2.filterApples(inventory, new AppleGreenColorAndHeavyWeightPredicate());

        assertNotNull(apples);
        assertEquals(apples.size(), 2);
    }
}