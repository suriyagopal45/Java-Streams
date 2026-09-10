package Streams;

import java.util.Arrays;
import java.util.List;

/*

1) Map
2) FlatMap
3) Reduce
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







    }
}
