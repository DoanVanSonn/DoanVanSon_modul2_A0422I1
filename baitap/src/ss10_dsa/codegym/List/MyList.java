package ss10_dsa.codegym.List;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }


    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapa();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    E remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E res = elements[index];
        if (size > 1) {
            E[] tmp = (E[]) new Object[size - 1];
            for (int i = 0, j = 0; i < size; i++) {
                if (i != index) {
                    tmp[j++] = elements[i];
                }
            }
            elements = tmp;
            size--;
        } else {
            //qq cannot init arr with size 0
            clear();
        }
        return res;

    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    void clear() {
        size = 0;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    int size() {
        return size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //ktra xem trong list co chua e hay k
    boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    boolean add(E e) {
        add(size, e);
        return true;
    }

}
