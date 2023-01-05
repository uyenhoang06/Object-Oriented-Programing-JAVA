package oop.collections.exercises;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Maps maps = new Maps();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 11);
        map.put(2, 12);
        map.put(3, 13);
        System.out.println(map);

        System.out.println(maps.count(map));
        maps.empty(map);
        System.out.println(map);

        map.put(4, 14);
        map.put(5, 15);
        map.put(6, 16);
        System.out.println(maps.contains(map, 4));
        System.out.println(maps.contains(map, 3));

        System.out.println(maps.containKeyValue(map, 4, 14));
        System.out.println(maps.containKeyValue(map, 3, 10));

        System.out.println(maps.keySet(map));
        System.out.println(maps.values(map));
        System.out.println(maps.getColor(0));
    }
}
