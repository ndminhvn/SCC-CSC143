package testing;

import utility.ArrayList;
import utility.List;
import utility.Iterator;

public class ArrayListTest {

    public static void intro() {
        System.out.println("\nT E S T   P R O G R A M\n");
    }

    public static void libraryVersionTest() {
        System.out.println("Library Version Test:");
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Tom");
        list.add("Ben");
        list.add("Sam");
        list.add("John");
        list.add("Tim");
        list.add(3,"Ken");
        System.out.println(list);
        System.out.println("Size: " + list.size());
        list.remove(1);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Item Removed: " + list.remove("John"));
        System.out.println("Item Removed: " + list.remove("Henry"));
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println();
    }

    public static void myVersionTest() {
        System.out.println("My Version Test:");
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Ben");
        list.add("Sam");
        list.add("John");
        list.add("Tim");
        System.out.println(list);
        list.add(3,"Ken");
        System.out.println(list);
        System.out.println("Size: " + list.size());
        list.remove(1);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Item Removed: " + list.remove("John"));
        System.out.println("Item Removed: " + list.remove("Henry"));
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println();

        System.out.println("Iterator Test:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String item = itr.next();
            if (item.equals("John"))
                itr.remove();
            System.out.println(item);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        myVersionTest();
    }
}
