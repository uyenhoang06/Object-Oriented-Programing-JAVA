package com.oop.collections.mylist;

public class MyArrayList extends MyAbstractList {
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    public void add(Object o, int index) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        try {
            checkBoundaries(index, size);
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = 0;
            size++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't add" + o + " at index " + index);
        }
    }

    public void remove(int index) {
        try {
            checkBoundaries(index, size - 1);
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't remove object at index " + index);
        }
    }

    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
        //elements = Arrays.copyOf(elements, elements.length * 2);
    }
}
