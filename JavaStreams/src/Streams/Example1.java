package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*

1) Convert array into Streams
2) Map and ForEach
3) Convert wrapper array to stream
4) Convert collections into stream
5) Filter Collect and Peek
 */
public class Example1 {
    static void main() {
        int[] arr = {1, 2, 3, 2, 1};
        IntStream stream = Arrays.stream(arr);

        stream.map((i -> i + 33)).forEach((var) -> {
            System.out.print(var + " ");
        });

        System.out.println(arr.length);

        Arrays.stream(arr).map((i) -> i + 34).forEach((var) -> {
            System.out.print(var + " ");

        });

        Integer[] array = {4, 3, 2, 4};

        Stream<Integer> array1 = Stream.of(array);

        System.out.println();


        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 2, 1));

        Stream<Integer> stream1 = list.stream();


        System.out.println("Filter");

        stream1.filter((var) -> var != 2)
                .map(var-> var+1)
                .forEach(System.out::println);

        //Once created cannot use other

        list.stream().map(var->var+1)
                .peek(var->{
                    System.out.print(var+" ");
                })
                .filter(var->var!=2)
                .peek(var->{
                    System.out.print(var+" ");
                })
                .map(var->var+1)
                .forEach((var)->{
                    System.out.print(var+" ");
                });

        // we can use same intermediate function in a same stream

        System.out.println();
        System.out.println("Map and Collect");
       List<Integer> sq =  list.stream().map(var->var*var).collect(Collectors.toList());

       //collect terminal operation
        /*

        Collectors.toSet
        toList()

        */

       sq.forEach(System.out::println);









    }








}
