package com.patterns.adaptor.demoprograme;

import java.util.ArrayList;
import java.util.List;

public class TurkeySimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        Turkey duckAdapter = new DuckAdapter(duck);
        duckAdapter.gobble();
        duckAdapter.fly();

        List<Turkey> turkeys = new ArrayList<>();
        turkeys.add(turkey);
        turkeys.add(duckAdapter);
        for (Turkey tur : turkeys) {
            tur.gobble();
        }
    }
}
