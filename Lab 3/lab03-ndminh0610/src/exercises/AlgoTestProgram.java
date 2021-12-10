package exercises;

import modules.RModule;

import static modules.Module.indexOf;
import static modules.Module.contains;
import static modules.Module.binarySearch;
import static modules.Module.bubbleSort;
import static modules.Module.selectionSort;
import static modules.Module.mergeSort;
import static modules.Module.insertionSort;

public class AlgoTestProgram {

    public static void testLinearSearch() {
        int[] list = {2, 3, 1, 5, 8, 6};
        System.out.println("----------- indexOf -------------");
        print(list);
        System.out.println("location of 3: " + indexOf(list,3));
        System.out.println("location of 7: " + indexOf(list,7));
        System.out.println("location of 8: " + indexOf(list,8));
        System.out.println();

        System.out.println("----------- contains -------------");
        print(list);
        System.out.println("location of 3: " + contains(list,3));
        System.out.println("location of 7: " + contains(list,7));
        System.out.println("location of 8: " + contains(list,8));
        System.out.println();
    }

    public static void testBinarySearch() {
        int[] list = {2, 3, 1, 5, 8, 6};
        System.out.println("------------ binarySearch --------");
        print(list);
        System.out.println("location of 3: " + binarySearch(list,3));
        System.out.println("location of 7: " + binarySearch(list,7));
        System.out.println("location of 8: " + binarySearch(list,8));
        System.out.println();
    }

    public static void testBubbleSort() {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("------------ bubbleSort ----------");
        print(list);
        bubbleSort(list);
        print(list);
        System.out.println();
    }

    public static void testSelectionSort() {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("---------- selectionSort ----------");
        print(list);
        selectionSort(list);
        print(list);
        System.out.println();
    }

    public static void testInsertionSort() {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("---------- insertionSort ----------");
        print(list);
        insertionSort(list);
        print(list);
        System.out.println();
    }

    public static void testRecursiveBinarySearch() {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("----------RecursiveBinarySearch-----------");
        print(list);
        RModule.selectionSort(list);
        print(list);
        System.out.println("Location of 8 : " + RModule.binarySearch(list, 8));
        System.out.println();
    }

    public static void testMergeSort() {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("-----------mergeSort----------");
        print(list);
        mergeSort(list);
        print(list);
        System.out.println();
    }

    public static void print(int[] list) {

        for(int i = 0; i < list.length; i++) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

        //use a for-each loop to print out list
        for(int item : list) {
            System.out.print(" " + item + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void intro() {
        System.out.println("\nT E S T   P R O G R A M\n");
    }

    public static void main(String[] args) {
        intro();
        testLinearSearch();
        testBinarySearch();
        testRecursiveBinarySearch();
        testBubbleSort();
        testSelectionSort();
        testMergeSort();
        testInsertionSort();
    }
}
