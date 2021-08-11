package lesson2;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private Node first;
    private Node last;
    private int size = 0;

    public void add(T value) {
        insertLast(value);
    }

    public void insertLast(T value) {
        Node node = new Node(value, null);
        if (size == 0) {
            first = node;
        } else {
            last.setNext(node);
        }
        last = node;
        size++;
    }

    public void insertFirst(T value) {
        Node node = new Node(value, first);
        if (size == 0) {
            last = node;
        }
        first = node;
        size++;
    }

    public T removeFirst() {
        return removeByIndex(0);
    }

    public T removeLast() {
        return removeByIndex(size - 1);
    }

    public T removeByIndex(int index) {
        if (isEmpty() || index < 0) {
            return null;
        }
        Node prev = first;
        int internalCount = 1;
        if (index == 0) {
            first = first.getNext();
            return prev.getCurrent();
        }
        while (prev.hasNext() && internalCount <= index) {
            if (index == internalCount) {
                Node temp = prev.getNext();
                prev.setNext(temp.getNext());
                return temp.getCurrent();
            }
            prev = prev.getNext();
            internalCount++;
        }
        return null;
    }

    public T getFirst(){
        return first.getCurrent();
    }

    public T getLast(){
        return last.getCurrent();
    }

    public T getByIndex(int index) {
        if (isEmpty() || index < 0) {
            return null;
        }
        Node prev = first;
        int internalCount = 0;
        while (prev.hasNext() && internalCount <= index) {
            if (index == internalCount) {
                return prev.getCurrent();
            }
            prev = prev.getNext();
            internalCount++;
        }
        return null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iter(first);
    }

    private class Iter implements Iterator<T> {

        Node current;

        public Iter(Node first) {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current.hasNext();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                return null;
            }
            Node temp = current.getNext();
            current = current.getNext();
            return temp.getCurrent();
        }
    }

    private class Node {

        private T current;
        private Node next;

        public Node(T current, Node next) {
            this.current = current;
            this.next = next;
        }

        public T getCurrent() {
            return current;
        }

        public void setCurrent(T current) {
            this.current = current;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }
    }
}
