package Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class CountAndSum {
    static void main() {


        List<Integer> arr = Arrays.asList(1,2,3,4,5);

        long count = arr.stream()
                .filter(var -> var % 2 == 0)
                .count();

        System.out.println(count);
        //returns the total count of the stream pipeline


        int sum = arr.stream().mapToInt(Integer::intValue)
                .sum();

        //firstConvert to integer to perform sum
        //only applies on intStream
        System.out.println(sum);


        int[] array = {2,3,4,5};

        //no need to convert to intStream if its aldready in array 
        int sumArray = Arrays.stream(array)
                .sum();

        System.out.println(sumArray);
    }
}
