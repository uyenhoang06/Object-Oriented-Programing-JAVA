package oop.collections.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        /* TODO */
        if (list == null) {
            return;
        }
        list.add(0, value);
    }

    /**
     * Function to insert an element into a list at the end
     */
    public static void insertLast(ArrayList<Integer> list, int value) {
        /* TODO */
        if (list == null) {
            return;
        }
        list.add(value);
    }

    /**
     * Function to replace the 3rd element of a list with a given value
     */
    public static void replace(ArrayList<Integer> list, int value) {
        /* TODO */
        if (list == null || list.size() < 3) {
            return;
        }
        list.set(2, value);
    }

    /**
     * Function to remove the 3rd element from a list
     */
    public static void removeThird(ArrayList<Integer> list) {
        /* TODO */
        if (list == null || list.size() < 3) {
            return;
        }
        list.remove(2);
    }

    /**
     * Function to remove the element "666" from a list
     */
    public static void removeEvil(ArrayList<Integer> list) {
        /* TODO */
        if (list == null) {
            return;
        }
        list.removeAll(List.of(666));
    }

    /**
     * Function returning a ArrayList<Integer> containing
     * the first 10 square numbers (i.e., 1, 4, 9, 16, ...)
     */
    public static ArrayList<Integer> generateSquare() {
        /* TODO */
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i * i);
        }
        return list;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        /* TODO */
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        /* TODO */
        target.clear();
        for (int i : source) {
            target.add(i);
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        /* TODO */
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int tmp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, tmp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

}
