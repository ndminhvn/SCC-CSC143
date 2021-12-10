package utility;

public class Module {

    public static <T extends Comparable<T>> void quickSort(List<T> list) {
        quickSort(list,0, list.size() - 1);
    }

    private static <T extends Comparable<T>> void quickSort(List<T> list, int low, int high) {
        int mid;
        if (low >= high) {
            return;
        }
        mid = partition(list, low, high);
        quickSort(list, low, mid);
        quickSort(list, mid + 1, high);
    }

    private static <T extends Comparable<T>> int partition(List<T> list, int low, int high) {
        int midpoint = (low + high) / 2;
        T pivot      = list.get(midpoint);
        boolean done = false;

        while (!done) {
            while (list.get(low).compareTo(pivot) < 0) {
                ++low;
            }
            while (pivot.compareTo(list.get(high)) < 0) {
                --high;
            }
            if (low >= high) {
                done = true;
            } else {
                swap(list, low, high);
                ++low;
                --high;
            }
        }

        return high;
    }

    public static <T> void swap(List<T> list, int a, int b) {
        T temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
