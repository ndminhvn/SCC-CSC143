package testing;

import utility.MyQueue;

import java.util.Queue;
import java.util.LinkedList;

public class MyQueueTest {

    public static void intro() {
        System.out.println("\nT E S T   P R O G R A M\n");
    }

    public static void libraryVersionTest() {
        System.out.println("Library Version Test:");
        Queue<String> queue = new LinkedList<>();
        queue.add("Red");
        queue.add("Orange");
        queue.add("Yellow");
        queue.add("Green");
        queue.add("Blue");
        queue.add("Indigo");
        queue.add("Violet");
        System.out.println(queue);

        System.out.println("Remove value: " + queue.remove());
        System.out.println(queue);
        System.out.println("Remove value: " + queue.remove());
        System.out.println(queue);
        System.out.println("Remove value: " + queue.remove());
        System.out.println(queue);
        System.out.println("Remove value: " + queue.remove());
        System.out.println(queue);
        System.out.println();
    }

    public static void myVersionTest() {
        System.out.println("My Version Test:");
        System.out.println("------------ M Y   Q U E U E -----------");
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Red");
        queue.add("Orange");
        queue.add("Yellow");
        queue.add("Green");
        queue.add("Blue");
        queue.add("Indigo");
        queue.add("Violet");

        System.out.println(queue);

        System.out.println("Remove value: " + queue.remove());
        System.out.println(queue);
        System.out.println("Remove value: " + queue.remove());
        System.out.println(queue);
        System.out.println("Remove value: " + queue.remove());
        System.out.println(queue);
        System.out.println("Remove value: " + queue.remove());
        System.out.println(queue);
    }

    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        myVersionTest();
    }
}
