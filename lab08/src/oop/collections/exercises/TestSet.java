package oop.collections.exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Sets sets = new Sets();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i <= 5; i++) {
            set2.add(i);
        }

        Set<Integer> intersection = sets.intersection(set1, set2);
        Set<Integer> intersectionManual = sets.intersectionManual(set2, set1);
        System.out.println(intersection);
        System.out.println(intersectionManual);

        Set<Integer> unionManual = sets.unionManual(set1, set2);
        Set<Integer> union = sets.union(set1, set2);
        System.out.println(union);
        System.out.println(unionManual);

        List<Integer> list = sets.toList(set1);
        System.out.println(list);

        list.add(1);
        list.add(2);
        System.out.println(list);
        List<Integer> list1 = sets.removeDuplicates(list);
        System.out.println(list1);

        System.out.println(list);
        List<Integer> list2 = sets.removeDuplicatesManual(list);
        System.out.println(list2);

        System.out.println(sets.firstRecurringCharacter("abcda"));
        System.out.println(sets.allRecurringChars("abcdac"));

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        System.out.println(sets.getFirst(treeSet));
        System.out.println(sets.getLast(treeSet));
        System.out.println(sets.getGreater(treeSet, 1));
    }
}
