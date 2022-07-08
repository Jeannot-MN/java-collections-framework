package com.jmn.collections;

public interface Collections<E> {

    void add(E e);

    void remove(int index);

    int size();

    boolean isEmpty();

    E get(int index);
}
