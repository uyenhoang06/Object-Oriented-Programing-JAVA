package oop.collections.exercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Lists lists = new Lists();
        lists.insertFirst(list, 666);
        lists.insertLast(list, 666);
        lists.replace(list, 4);
        System.out.println(list);
        System.out.println();

        lists.removeThird(list);
        lists.removeEvil(list);
        System.out.println(list);
        System.out.println();

        ArrayList<Integer> generateSquareList = lists.generateSquare();
        System.out.println(generateSquareList);
        System.out.println();

        System.out.println(lists.contains(list, 666));

        ArrayList<Integer> targetList = new ArrayList<>();
        targetList.add(1);
        targetList.add(2);
        Lists.copy(list, targetList);
        System.out.println(targetList);
        System.out.println();

        lists.reverse(targetList);
        System.out.println(targetList);
        System.out.println();

        lists.reverseManual(targetList);
        System.out.println(targetList);
        System.out.println();

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        lists.insertBeginningEnd(list1, 10);
        System.out.println(list1);
    }
}
