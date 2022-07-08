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
        Node nextNode;
        Node prevNode;
        if (index == 0) {
            nextNode = findByIndex(index + 1);
            head = nextNode;
        } else if (index == size - 1) {
            prevNode = findByIndex(index - 1);
            tail = prevNode;
        } else {
            prevNode = findByIndex(index - 1);
            nextNode = findByIndex(index + 1);

            prevNode.next = nextNode;
        }
        size--;
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
        return findByIndex(index).value;
    }

    private Node findByIndex(int index) {
        Node target = head;
        for (int i = 1; i <= index; i++) {
            target = target.next;
        }

        return target;
    }

    private class Node {
        E value;
        Node next;
    }
}
