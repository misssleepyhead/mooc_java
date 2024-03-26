
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));
        String[] s = {"b", "a"};
        sort(s);
        System.out.println(Arrays.toString(s));

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(1);
        ints.add(10);
        sortIntegers(ints);
        System.out.println(ints);

        ArrayList<String> strs = new ArrayList<>();
        strs.add("c");
        strs.add("o");
        strs.add("a");
        sortStrings(strs);
        System.out.println(strs);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);

    }

    public static void sort(String[] array) {
        Arrays.sort(array);

    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
