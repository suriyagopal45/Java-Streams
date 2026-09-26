package Streams.TerminalOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMax {
    static void main() {

        List<Integer> arr = Arrays.asList(1,222,3,4,2,1);

        Optional<Integer> min = arr.stream()
                .max(Comparator.naturalOrder());

        System.out.println(min.get());


        Optional<Integer> max = Stream.of(1,2,3)
                .max(Comparator.naturalOrder());

        System.out.println(max.get());

    }
}
