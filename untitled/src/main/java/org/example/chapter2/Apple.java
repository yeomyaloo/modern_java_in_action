package org.example.chapter2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static org.example.chapter2.BehaviorParameter.*;

@Getter
@AllArgsConstructor
public class Apple {
    private Color color;
    private int weight;

}
