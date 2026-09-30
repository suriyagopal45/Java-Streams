package Streams.Problems.Hard;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example1 {
    static void main() {


        //find the most common first letter amoung string

        List<String> names = Arrays.asList("Suriya","Sur","Ram","Raj","Sai");

        Map<Character, Long> collect = names.stream()
                .map(var -> var.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        {R=2, S=2}

        names.stream()
                .map(var -> var.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Comparator.comparingInt((Map.Entry<Character,Long>var)->var.getKey()).reversed())
                .findFirst();


        Map.Entry<Character, Long> characterLongEntry = names.stream()
                .map(var -> var.charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(var -> var.getValue())).orElse(Map.entry('0', 0L));




        System.out.println(characterLongEntry);

//        R=2
    }
}
