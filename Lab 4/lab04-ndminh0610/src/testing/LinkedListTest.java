package testing;

import utility.Iterator;
import utility.LinkedList;
import utility.List;

public class LinkedListTest {
    public static void intro() {
        System.out.println("\nT E S T   P R O G R A M\n");
    }

    public static void myVersionTest() {
        System.out.println("My Version Test:");
        List<String> list = new LinkedList<>();
        list.add("Tom");
        list.add("Ben");
        list.add("Sam");
        list.add("John");
        list.add("Tim");
        System.out.println(list);
        list.set(3, "Will");
        System.out.println(list);
        System.out.println("Item at Index 3: " + list.get(3));
        System.out.println("Is Ben in the list? " + list.contains("Ben"));
        if (list.contains("Ben"))
            System.out.println("What is the Index? " + list.indexOf("Ben"));
        System.out.println();
        System.out.println(list);
        System.out.println("Remove Will? " + list.remove(3));
        System.out.println();
        System.out.println(list);
        System.out.println("Remove Front? " + list.remove(0));
        System.out.println();
        System.out.println(list);
        System.out.println("Remove Back? " + list.remove(2));
        System.out.println(list);

        list.add("Tom");
        list.add("Tim");
        list.add("John");
        System.out.println(list);
        System.out.println("Remove Middle? " + list.remove("Tom"));
        System.out.println(list);

        System.out.println(list);
        System.out.println();
        System.out.println("Add to Front ");
        list.add(0,"Angus");
        System.out.println(list);
        System.out.println();
        System.out.println("Add to Back ");
        list.add(list.size(), "Zeus");
        System.out.println();
        System.out.println(list);
        System.out.println();
        System.out.println("Add to Middle ");
        list.add(list.size() / 2,"Doug");
        System.out.println();
        System.out.println(list);

        System.out.println("Iterator: ");
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
        myVersionTest();
    }
}
