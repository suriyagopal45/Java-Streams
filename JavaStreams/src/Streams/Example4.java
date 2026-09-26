package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

1) Map
2) FlatMap
3) Reduce  sum min reduce to one element (initialValue,(a,b)->where a is accumulated value b is current value
4) Skip
5)Limit opposite to skip   limit means from start limit 5 only 5 elements
 */

public class Example4 {
    static void main() {
        String temp = "AererfSfdSA";



        List<String> fruits = Arrays.asList("Apple","Banana","Guava","Mango");


        fruits.stream()
                .map(fruit->fruit.toLowerCase())
                .forEach(fruit-> System.out.print(fruit+" "));

        System.out.println();

        List<Integer> arr = Arrays.asList(1,2,3,2,1,2,4,7);

        int value = arr.stream()
                .filter(var->var%2==1)
                .reduce(0,(a,b)->a+b);
        /*
        used to find max min perform some operations
        0 is initial value
        a is accumulated value
        b is current value
         */

        System.out.println(value);


        //flatMap

        /*

        List of List
         */

        List<List<String>> lists = Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("c","d"),
                Arrays.asList("e","f")
        );

        lists.stream().flatMap(list-> list.stream())  //flatten the list to single
                .map(var->var.toUpperCase())
                .forEach(var-> System.out.print(var+" "));

        System.out.println();
        //to print the 2d array
        for(List<String> i:lists)
        {
            for(String j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //or

        for (int i = 0; i < lists.size(); i++) {

            for (int j = 0; j < lists.get(i).size(); j++) {

                System.out.println(lists.get(i).get(j));

            }
        }

        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(3,4,2,1),
                Arrays.asList(6,3,2,5)
        );

        numbers.stream()
                .flatMap(array->array.stream())
                .filter(var->var%2==0)
                .map(var->var+400)
                .forEach(var-> System.out.print(var+" "));

        //reduce
        Integer maxValue = Stream.of(2,3,4,5,2,55,43,2,45)
                .reduce(0,(a,b)->
                {
                    return Math.max(a,b);
                });

        Integer sum = Stream.of(2,3,4,5,2,55,43,2,45)
                .reduce(0,(a,b)->
                {
                    return a+b;
                });



        System.out.println(maxValue);
        //skip n elements from the data

        List<Integer> oddNumbers = List.of(1,3,1,5,55,11);

        List<Integer> evenNumbers = Arrays.asList(2,4,6,8,9,10,12);

        // cannot add



//        evenNumbers.add(32);
//        oddNumbers.add(3); throws Exception

//        oddNumbers.set(0,4); throws exception

        evenNumbers.set(0,44); //works fine but fixed size not thread safe

        System.out.println();

        for (Integer oddNumber : oddNumbers) {
            System.out.print(oddNumber+" ");

        }

        //skip the n elements
        System.out.println();
        oddNumbers.stream()
                .skip(3)
                .forEach(var-> System.out.print(var+" "));



        //Limit
        System.out.println();

       List<Integer> result = evenNumbers.stream()
                .skip(1)
                .limit(3)
                .toList();
        System.out.println("Limit");
       result.forEach(var-> System.out.print(var+" "));
    }
}
