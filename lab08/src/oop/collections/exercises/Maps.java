package oop.collections.exercises;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    /*
    function return the number of key-value mapping of a map
     */
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    /*
    function to remove all mappings from a map
     */
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    /*
    function to test if a map contains a mapping for the specified key
     */
    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    /* function to test if a map contains a mapping for the specified key
    and the specified key and if its value equals the specified value
     */
    public static boolean containKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (map.containsKey(key)) {
            if (map.containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    /*
    function to return the key set of map
     */
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    /*
    function to return the values of map
     */
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    /*
    function, internally using a map, returning "black",
    "white", or "red" depending on int input value
    "black" = 0, "white" = 1, "red" = 2
     */
    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");
        return map.get(value);
    }
}
