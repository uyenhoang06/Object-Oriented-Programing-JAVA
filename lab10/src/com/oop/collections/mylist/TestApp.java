package com.oop.collections.mylist;

public class TestApp {
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        list.add("a", 0);
        list.add("b");
        list.add("c", 0);
        list.add("c", 3);
        list.remove(3);
        System.out.println(list.size());
        System.out.println(list);

        MyList list1 = new MyLinkedList();
        list1.add("a", 0);
        list1.add("b");
        list1.add("c", 0);
        list1.add("c", 3);
        list1.remove(3);
        System.out.println(list1.size());
        System.out.println(list1);
    }
}
