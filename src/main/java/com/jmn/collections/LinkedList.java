package com.jmn.collections;

public class LinkedList<E> implements List<E> {

    private Node head;

    private Node tail;

    private int size = 0;

    @Override
    public void add(E e) {
        Node node = new Node();
        node.value = e;

        if (size == 0) {
            head = node;
        } else {
            Node oldTail = tail;
            oldTail.next = node;
        }
        tail = node;
        size++;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    private class Node {
        int index;
        E value;
        Node next;
    }
}
