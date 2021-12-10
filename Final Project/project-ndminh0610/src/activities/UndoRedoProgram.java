package activities;

import utility.MyStack;
import java.util.Scanner;

public class UndoRedoProgram {
    public static Scanner sc = new Scanner(System.in);

    public static void UndoRedo() {
        MyStack<Character> undo = new MyStack<>();
        MyStack<Character> redo = new MyStack<>();

        System.out.print("Input: ");

        while ((undo.isEmpty() && redo.isEmpty())) {
            String input = sc.nextLine();
            for (int i = 0; i < input.length(); i++) {
                undo.push(input.charAt(i));
                char curr;
                if (input.charAt(i) == 'u' || input.charAt(i) == 'U') {
                    undo.pop();
                    curr = undo.pop();
                    redo.push(curr);
                    System.out.println(undo);
                } else if (input.charAt(i) == 'r' || input.charAt(i) == 'R') {
                    curr = redo.pop();
                    undo.pop();
                    undo.push(curr);
                    System.out.println(undo);
                }
            }
            UndoRedo();
        }

    }

    public static void main(String[] args) {
        UndoRedo();
    }
}
