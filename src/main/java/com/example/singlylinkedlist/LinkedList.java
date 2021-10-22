package com.example.singlylinkedlist;

public interface LinkedList<E> {

    void addFirst(E e);
    void addLast(E e);

    E pollFirst();
    E pollLast();

    E peekFirst();
    E peekLast();

    void clear();

    boolean contains(E element);
}
