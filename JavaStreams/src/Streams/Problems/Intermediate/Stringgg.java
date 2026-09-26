package Streams.Problems.Intermediate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stringgg {
    static void main() {

        String input = "banana";

        input.chars()
                .mapToObj(var->(char) var)
                .filter(var->!var.equals((char)'n'))
                .forEach(System.out::print);

//        baaa


        List<String> arr = new ArrayList<>(Arrays.asList("apple","banana","guava","apple","lemon","banana"));


        Map<String, Long> collect = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        Map<String, Long> collected = collect.entrySet()
                .stream().filter(var -> var.getValue() == 1).collect(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)
                );
//{lemon=1, guava=1}
        System.out.println();
        System.out.println(collected);


        //Count the frequeny of the word with an insertion order

        Map<Character, Long> collect1 = input.chars()
                .mapToObj(var -> (char) var)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(var -> var.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(collect1);
        //{a=3, n=2}


    }
}
