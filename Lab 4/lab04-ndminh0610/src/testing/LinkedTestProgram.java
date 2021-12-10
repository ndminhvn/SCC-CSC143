package testing;

public class LinkedTestProgram {

    public static class Node<E> {
        Node<E> next;
        E       data;

        public Node(E data) {
            this(null,data);
        }

        public Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }
    }

    public static void intro() {
        System.out.println("\nT E S T   P R O G R A M\n");
    }

    public static void testNode() {
        Node<String> first        = new Node<String>("Tom");
        first.next                = new Node<String>("Ben");
        first.next.next           = new Node<String>("Sam");
        first.next.next.next      = new Node<String>("John");
        first.next.next.next.next = new Node<String>("Tim");

        System.out.println(print(first));
    }

    public static String print(Node<String> first) {
        if (first == null) {
            return "[]";
        } else {
            StringBuilder builder = new StringBuilder("[" + first.data);
            for (Node<String> node = first.next; node != null; node = node.next) {
                builder.append(", ").append(node.data);
            }
            return builder.append("]").toString();
        }
    }

    public static void main(String[] args) {
        intro();
        testNode();
    }
}
