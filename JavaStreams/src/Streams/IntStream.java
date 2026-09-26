package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class IntStream {
    static void main() {

        List<Integer> arr = Arrays.asList(1,2,3,4,5);

        OptionalDouble average = arr.stream()
                .mapToInt(Integer::intValue)
                .average();




        arr.stream()
                .mapToInt(Integer::intValue)
                .skip(2)
                .forEach(var-> System.out.print(var+" "));
        System.out.println();
      if(average.isPresent())
      {
          System.out.println(average.getAsDouble());
      }

      double value = arr.stream()
              .mapToInt(Integer::intValue)
              .average()
              .orElse(0.0);

      //without optional double directly handle the cases


    }
}
