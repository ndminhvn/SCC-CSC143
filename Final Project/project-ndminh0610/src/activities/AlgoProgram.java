package activities;

import utility.ArrayList;
import utility.List;
import static utility.Module.quickSort;

public class AlgoProgram {

    public static void intro() {
        System.out.println("\nTest Algorithm\n");
    }

    public static void testQuickSort() {
        List<String> list = new ArrayList<>(6);
        list.add("Sam");
        list.add("Cam");
        list.add("Joe");
        list.add("Bob");
        list.add("Abe");

        quickSort(list);
        System.out.println();
        System.out.println(list);

        List<Person> pList = new ArrayList<>(6);
        Person sam1 = new Person("Sam Jones",26);
        Person sam2 = new Person("Sam Long",35);
        Person mike1 = new Person("Mike Jones",42);
        Person mike2 = new Person("Mike Green",42);
        Person mike3 = new Person("Mike Brown",42);
        Person minh = new Person("Minh Jones",19);
        pList.add(mike3);
        pList.add(sam1);
        pList.add(mike2);
        pList.add(minh);
        pList.add(mike1);
        pList.add(sam2);

        quickSort(list);
        System.out.println();
        System.out.println(pList);
    }

    public static void main(String[] args) {
        intro();
        testQuickSort();
    }
}
