package Streams.Problems.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Strings {
    static void main() {

        List<String> fruits = Arrays.asList("apple","banana","apple","goa");


        Map<String, Long> collect = fruits.stream()

                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );

        System.out.println(collect);
    }
}
