package com.patterns.singleton.pseudocode;

public class ExampleApplication {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * from K66A5");
        foo.query("SELECT * from K66A5 WHERE...");

        Database bar = Database.getInstance();
        bar.query("SELECT * from K66A3");
        System.out.println(foo == bar);
    }
}
