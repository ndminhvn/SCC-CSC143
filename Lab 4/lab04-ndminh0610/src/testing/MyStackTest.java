package testing;

import java.util.Stack;
import utility.MyStack;

public class MyStackTest {
    public static void intro() {
        System.out.println("\nT E S T   P R O G R A M\n");
    }

    public static void libraryVersionTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Red");
        stack.push("Orange");
        stack.push("Yellow");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Indigo");
        stack.push("Violet");

        System.out.println(stack);
        System.out.println("Pop value: " + stack.pop());
        System.out.println(stack);
        System.out.println("Pop value: " + stack.pop());
        System.out.println(stack);
        System.out.println("Pop value: " + stack.pop());
        System.out.println(stack);
        System.out.println("Peek value: " + stack.peek());
        System.out.println(stack);

        System.out.println();
    }

    public static void myVersionTest() {
        System.out.println("My Version Test:");
        System.out.println("------------ M Y   S T A C K -----------");
        MyStack<String> stack = new MyStack<String>();
        stack.push("Red");
        stack.push("Orange");
        stack.push("Yellow");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Indigo");
        stack.push("Violet");

        System.out.println(stack);
        System.out.println("Pop value: " + stack.pop());
        System.out.println(stack);
        System.out.println("Pop value: " + stack.pop());
        System.out.println(stack);
        System.out.println("Pop value: " + stack.pop());
        System.out.println(stack);
        System.out.println("Peek value: " + stack.peek());
        System.out.println(stack);
    }

    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        myVersionTest();
    }
}
