package Streams.Problems;

import java.util.*;
import java.util.stream.Stream;

public class Intt {
    static void main() {


        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,34,5));
        boolean b = arr.stream()
                .allMatch(var -> var >= 0);

        System.out.println(b);
        //returns true if all positive
        /*
        allMatch means all the values
        anyMatch means any one
         */

        //second largest element

        Optional<Integer> secondLargest = arr.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();






    }
}
