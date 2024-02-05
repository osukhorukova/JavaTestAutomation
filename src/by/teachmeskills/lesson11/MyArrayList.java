package by.teachmeskills.lesson11;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] array;
    private int size = 0;

    public MyArrayList() {
        this.array = new Object[0];
    }

    public MyArrayList(int capacity) {
        this.array = new Object[capacity];
        size = 0;
    }

    private void expandArray(int growth) {
        int newCapacity = array.length + growth;
        array = Arrays.copyOf(array, newCapacity);
    }

    public void add(T element) {
        if (size == array.length) {
            expandArray(1);
        }
        array[size] = element;
        size++;
    }

    public void delete(T element) {
        for (int i = 0; i < size; i++) {
            if (element == null || array[i] == null) {
                throw new NullPointerException();
            } else if (array[i] == element) {
                array[i] = array[i + 1];
            }
            expandArray(-1);
            size--;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        } else {
            return (T) array[index];
        }
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    public void clear() {
        size = 0;
    }
}

