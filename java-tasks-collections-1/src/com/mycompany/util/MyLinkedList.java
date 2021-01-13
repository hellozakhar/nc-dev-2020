package com.mycompany.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
    }

    private void checkOutOfBounds(int index) {
        if (size == 0 || index < 0 || index >= size)
            throw new IndexOutOfBoundsException("SIZE == 0 OR INDEX < 0 OR INDEX >= SIZE: " + index + " " + size);
    }

    @Override
    public void add(E element) {
        if (size == 0) {
            first = new Node<E>(element);
            last = first;
            size = 1;
            return;
        }
        Node<E> node = new Node<E>(element);
        last.setNext(node);
        last = node;
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("INDEX > SIZE: " + index + ">" + size);
        }
        if ((index == 0 && size == 0) || index == size) {
            add(element);
            return;
        }
        if (index == 0 && size > 0) {
            first = new Node<E>(element, first);
            size++;
            return;
        }
        Node<E> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.getNext();
        }
        Node<E> elem = new Node<E>(element, cursor.getNext());
        cursor.setNext(elem);
        size++;
    }

    @Override
    public void clear() {
        if (size == 0)
            return;

        if (size == 1) {
            first = null;
            last = null;
            size = 0;
            return;
        }

        // correct ?
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public E get(int index) {

        checkOutOfBounds(index);
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getData();
    }

    @Override
    public int indexOf(E element) {

        Node<E> current = first;

        for (int i = 0; i < size; i++) {
            if (current.getData().equals(element))
                return i;
            current = current.getNext();
        }

        return -1;
    }

    @Override
    public E remove(int index) {

        checkOutOfBounds(index);
        E elem = first.getData();

        if (size == 1) {
            //elem = last.getData();
            first.setNext(null);
            first = null;
            last = null;
            size = 0;
            return elem;
        }

        if (index == 0) {
            //elem = first.getData();
            first = first.getNext();
            size--;
            return elem;
        }

        Node<E> prev = first;
        Node<E> current = first;

        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.getNext();
        }

        if (index == size - 1) {
            prev.setNext(null);
            current.setNext(null);
            elem = current.getData();
            current = null;
            last = prev;
            size--;
            return elem;
        }

        prev.setNext(current.getNext());
        current.setNext(null);
        current = null;
        size--;
        return elem;
    }

    /*@Override
    public E remove(int index) {
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }*/

    @Override
    public E set(int index, E element) {

        checkOutOfBounds(index);
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setData(element);

        return current.getData();
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public E[] toArray() {

        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = first;

        while (current != null) {
            result.append(current.getData());

            if (current.getNext() != null)
                result.append(", ");

            current = current.getNext();
        }
        result.append(']');

        return result.toString();
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentIndex = 0;
            private Node<E> current = first;

            /**
             * Returns {@code true} if the iteration has more elements.
             * (In other words, returns {@code true} if {@link #next} would
             * return an element rather than throwing an exception.)
             *
             * @return {@code true} if the iteration has more elements
             */
            @Override
            public boolean hasNext() {
                return currentIndex < size && current.getNext() != null;
            }

            /**
             * Returns the next element in the iteration.
             *
             * @return the next element in the iteration
             * @throws NoSuchElementException if the iteration has no more elements
             */
            @Override
            public E next() {
                if (!hasNext())
                    throw new NoSuchElementException();

                if (currentIndex > 0)
                    current = current.getNext();

                currentIndex++;
                return current.getData();
            }
        };
    }
}
