package Streams.TerminalOperations;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirst {
    static void main() {

        Optional<Integer> first = Stream.of(2, 3, 2, 1, 3, 44, 23)
                .filter(var -> var % 2 == 1)
                .findFirst();

        System.out.println(first.get());
    }
}
