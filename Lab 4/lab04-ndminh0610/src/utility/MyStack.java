package utility;

import java.util.NoSuchElementException;

public class MyStack<E> {

    private Node<E> top;      // TOP OF STACK     (LAST)
    private Node<E> bottom;   // BOTTOM OF STACK  (FIRST)
    private int     size;

    public MyStack() {
        top = null;
        bottom  = null;
        size  = 0;
    }

    public E peek() {
        if (isEmpty())
            throw new NoSuchElementException("Stack is Empty");
        return top.data;
    }

    public E pop() {
        if (isEmpty())
            throw new NoSuchElementException("Stack is Empty");
        E lastItem = top.data;
        top      = top.next;
        size--;
        return lastItem;
    }

    public E push(E item) {
        Node<E> newNode = new Node<E>(top, item);
        top             = newNode;        // TOP OF STACK (LAST ITEM)

        if (isEmpty())
            bottom = newNode;

        size++;
        return top.data;
    }

    /**************************************
     * returns true, if the list is empty,
     * @return boolean value
     *************************************/
    public boolean isEmpty() {
        return top == null;
    }

    /**************************************************
     * returns the number of the elements in the list.
     * @return size of stack.
     *************************************************/
    public int size() {
        return size;
    }

    /***********************************
     * displays the contents of the list.
     * @return stack
     ***********************************/
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            ArrayList<E> list = new ArrayList<E>(size);
            for (Node<E> node = top; node != null; node = node.next) {
                list.add(node.data);
            }
            int lastIndex = size - 1;
            StringBuilder result = new StringBuilder("[" + list.get(lastIndex));
            for (int i = lastIndex - 1; i >= 0; i--) {
                result.append(", ").append(list.get(i));
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
