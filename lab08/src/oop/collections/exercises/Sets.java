package oop.collections.exercises;

import java.util.*;

public class Sets {
    /*
    function returning the intersection of two given sets
    (without using library functions)
     */
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (int i : first) {
            if (second.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    /*
    function returning the union of two given sets
    (without using library functions)
     */
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (int i : first) {
            result.add(i);
        }
        for (int i : second) {
            result.add(i);
        }
        return result;
    }

    /*
    Function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    /*
    Function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    /*
    function to transform a set into a list without duplicates
    note well: collections can be created form another collection!
     */
    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    /*
    function to remove duplicates from a list
    note well: collections can be created from another collection!
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    /*
    function to remove duplicates from a list
    without using the constructors trick seen above
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    /*
    function accepting a string s
    returning the first recurring character
    for example firstRecurring("abaco") -> a
     */
    public static String firstRecurringCharacter(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i) + "";
            }
            set.add(s.charAt(i));
        }
        return null;
    }

    /*
    function accepting a string s
    returning a set comprising all recurring characters
    For example allRecurringChars("mamma") - > [m, a]
     */
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                result.add(ch);
            } else {
                set.add(ch);
            }
        }
        return result;
    }

    /*
    function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        return (Integer[]) source.toArray();
    }

    /*
    function to return the first item from a TreeSet
    Note well: use TreeSet specific methods
     */
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    /*
    function to return the last item from a TreeSet
    Note well: use TreeSet specific methods
     */
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    /*
    function to get an element from a TreeSet
    which is strictly greater than a given element
    Note well: use TreeSet specific methods
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
