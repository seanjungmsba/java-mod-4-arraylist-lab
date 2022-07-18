import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(-5, 4, 13, -23, -65, 5, -2));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(7, 3, -3, -6, 5, 10, 8));

        ArrayList<Integer> res = mergeTwoArrayLists(l1, l2); // [4, 13, 5, 7, 3, 5, 10, 8]
        System.out.println(res);
    }

    public static ArrayList<Integer> mergeTwoArrayLists(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        // your code here
        ArrayList<Integer> combinedList = (ArrayList<Integer>)Stream.of(l1, l2)
                                                                    .flatMap(x -> x.stream())
                                                                    .filter(i -> i >= 0)
                                                                    .collect(Collectors.toList());
        return combinedList; // [4, 13, 5, 7, 3, 5, 10, 8]
    }
}
