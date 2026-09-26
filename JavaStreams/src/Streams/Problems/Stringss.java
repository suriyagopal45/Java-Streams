package Streams.Problems;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stringss {
    static void main() {

        List<String> arr = Arrays.asList("APple","Aaa","Baa");

        List<String> stringList = arr.stream()
                .filter(
                        var -> var.startsWith("A")
                )
                .toList();

        stringList.forEach(var-> System.out.print(var+" "));
        //2
        System.out.println();

        //to join all the streings to one

        String collect = arr.stream()
                .collect(Collectors.joining(","));

        //APple,Aaa,Baa
        System.out.println(collect);

        //add prefix and suffix


        String s = arr.stream()
                .collect(Collectors.joining(",", "[", "]"));

        //[APple,Aaa,Baa]
        System.out.println(s);


        int sum = Stream.of(1, 2, 3, 4)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);


        //by their length

        List<String> stringList1 = arr.stream()
                .sorted(Comparator.comparing(var -> var.length()))
                .toList();

        System.out.println(stringList1);


        //grouping by

        Map<Integer, List<String>> listMap = arr.stream()
                .collect(
                        Collectors.groupingBy(var -> var.length())
                );

        System.out.println(listMap);


    }
}
