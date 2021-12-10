package utility;

import java.util.NoSuchElementException;

public class MyQueue<E> {
    private Node<E> front;
    private Node<E> back;
    private int     size;

    public MyQueue() {
        front = null;
        back  = null;
        size  = 0;
    }

    public boolean add(E item) {
        int oldSize = size;
        addAfter(item);
        size++;
        return oldSize == (size + 1);
    }

    private void addAfter(E item) {
        Node<E> newNode = new Node<E>(item);
        Node<E> oldBack = back;
        back            = newNode;          // ADD TO BACK

        if (isEmpty())
            front = newNode;
        else
            oldBack.next = newNode;
    }

    /**************************************
     * returns true, if the list is empty,
     * @return boolean value
     *************************************/
    public boolean isEmpty() {
        return front == null;
    }

    public E peek() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is Empty");
        return front.data;
    }

    public E remove() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is Empty");

        E firstItem = front.data;
        front       = front.next;
        size--;
        return firstItem;
    }

    /**************************************************
     * returns the number of the elements in the list.
     * @return size of queue.
     *************************************************/
    public int size() {
        return size;
    }

    /***********************************
     * displays the contents of the list.
     * @return queue
     ***********************************/
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            StringBuilder result = new StringBuilder("[" + front.data);
            for (Node<E> node = front.next; node != null; node = node.next) {
                result.append(", ").append(node.data);
            }
            return result.append("]").toString();
        }
    }

    private static class Node<E>{
        Node<E> next;
        E       data;

        public Node(E data) {
            this(null, data);
        }

        public Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }
    }

}
