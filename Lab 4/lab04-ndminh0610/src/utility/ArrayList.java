package utility;

import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {

    public static final int DEFAULT_CAPACITY = 10;
    private E[] data;
    private int size;

    /****************************
     * creates array list object
     ***************************/
    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /****************************************************
     * creates array list object for a specific capacity
     * @param capacity of the maximum list.
     ****************************************************/
    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        String message = "capacity cannot be negative";
        if (capacity < 0)
            throw new IllegalArgumentException(message);

        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**************************************************
     * returns the number of the elements in the list.
     * @return size of the list.
     *************************************************/
    public int size() {
        return size;
    }

    /****************************************************
     * appends the item specified to the end of the list.
     * @param item in the list
     * @return boolean value if successful.
     ****************************************************/
    public boolean add(E item) {
        int oldSize = size;
        ensureCapacity(size + 1);
        data[size++]  = item;
        return size == (oldSize + 1);
    }

    /**********************************************
     * inserts the item at the given index in the list.
     * @param index given in the list.
     * @param item in the list.
     **********************************************/
    public void add(int index, E item) {
        String message = "index " + index + ", size" + size;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(message);
        }
        ensureCapacity(size + 1);
        shiftRight(index);
        data[index] = item;
        size++;
    }

    private void checkIndex(int index) {
        String message = "index " + index + ", size" + size;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(message);
        }
    }

    /********************************************************
     * clears list of all elements, return size back to zero.
     ********************************************************/
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    private void shiftRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
    }

    private void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
    }

    /*********************************************************
     * returns the item at the specified position in the list.
     * @param index of item in list.
     * @return item at index.
     *********************************************************/
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    /**************************************************
     * removes the item at the given index in the list.
     * @param index of item in list.
     * @return old value in list.
     **************************************************/
    public E remove(int index) {
        checkIndex(index);
        E oldItem = data[index];
        shiftLeft(index);
        data[size--] = null;
        return oldItem;
    }

    /*****************************************************
     * removes the first occurrence of the specified item
     * from the list, if present.
     * @param item to remove from list.
     * @return boolean value.
     *****************************************************/
    public boolean remove(E item) {
        return contains(item) && item.equals(remove(indexOf(item)));
    }

    /******************************************************************
     * replaces the item at the specified position with the one passed.
     * @param index to replace list item.
     * @param item that replaces one in list.
     * @return old item.
     ******************************************************************/
    public E set(int index, E item) {
        checkIndex(index);
        E oldItem = data[index];
        data[index] = item;
        return oldItem;
    }

    /*********************************************************************
     * searches for an item and returns the first occurrence in the array,
     * otherwise returns -1, if NOT found.
     * @param item to search for in list.
     * @return location of item, if found.
     *********************************************************************/
    public int indexOf(E item) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item))
                return i;
        }
        return -1;
    }

    /**************************************
     * returns true, if the list is empty,
     * @return boolean value
     *************************************/
    public boolean isEmpty() {
        return size == 0;
    }

    /**********************************************************
     * returns an object used to traverse the elements in list
     * @return iterator for list
     **********************************************************/
    public Iterator<E> iterator() {
        return new ArrayIterator();
    }

    /********************************************************
     * searches for an item and returns true if in the array,
     * @param item to search for in list.
     * @return boolean value.
     ********************************************************/
    public boolean contains(E item) {
        return indexOf(item) != -1;
    }

    /**********************************************************************
     * doubles the capacity of the underlying array, to ensure that it
     * can hold the number of elements specified by the capacity requested.
     * @param capacity
     **********************************************************************/
    @SuppressWarnings("unchecked")
    public void ensureCapacity(int capacity) {
        if (capacity > data.length) {
            int newLength = Math.max(capacity, 2 * data.length + 1);
            E[] newArray = (E[]) new Object[newLength];

            for (int i = 0; i < size; i++)
                newArray[i] = data[i];

            data = newArray;
        }
    }

    /***********************************
     * displays the contents of the list.
     * @return list
     ***********************************/
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            StringBuilder result = new StringBuilder("[" + data[0]);
            for (int i = 1; i < size; i++) {
                result.append(", ").append(data[i]);
            }
            return result.append("]").toString();
        }
    }

    private class ArrayIterator implements Iterator<E> {
        int position;
        boolean isRemovable;

        public ArrayIterator() {
            position = 0;
            isRemovable = false;
        }

        /************************************************************
         * returns true, if there are more elements left in the list.
         * @return boolean value
         ***********************************************************/
        @Override
        public boolean hasNext() {
            return (position < size);
        }

        /************************************************
         * returns the item at the last iterator position
         * and advances the position by one
         * If there is no element left in the list,
         * should throw a NoSuchElementException.
         * @return item at the last position
         *************************************************/
        @Override
        public E next() {
            String message = "no such element left";
            if (!hasNext())
                throw new NoSuchElementException(message);

            E currentItem = data[position];
            position++;
            isRemovable = true;
            return currentItem;
        }

        /******************************************************************
         * removes the item returned by the last call to next().
         * Uses remove method from its enclosing class to do the operation.
         * If remove() has been called without a call on next(),
         * throws an IllegalStateException .
         ******************************************************************/
        @Override
        public void remove() {
            String message = "unable to remove";
            if (!isRemovable)
                throw new IllegalStateException(message);

            ArrayList.this.remove(--position);
            isRemovable = false;
        }
    }
}
