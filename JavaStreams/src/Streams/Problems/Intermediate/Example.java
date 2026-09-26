package Streams.Problems.Intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class Example {

    static void main() {

        List<User> users = Arrays.asList(
                new User(23,45,"Suriya"),
                new User(21,12,"Sai"),
                new User(34,54,"Ram"),
                new User(29,22,"Raj")

        );

        List<User> list = users.stream()
                .sorted(Comparator.comparingInt(user -> user.age))
                .toList();

        //oher way

        List<User> list1 = users.stream()
                .sorted(Comparator.comparing(User::getId).reversed()
                        .thenComparing(User::getAge).reversed())
                .toList();


        System.out.println(list);

        //calculate average or perform additional operation

        OptionalDouble average = users.stream()
                .mapToInt(var -> var.getAge())
                .average();


        //filter

        Optional<User> user23 = users.stream()
                .filter(user -> user.getAge() == 23)
                .findFirst();

        System.out.println(user23);

        //partition in even and odd
        Map<Boolean, List<User>> booleanListMap = users.stream()
                .collect(Collectors.partitioningBy(user -> user.getAge() % 2 == 0));

        System.out.println("true");
        booleanListMap.get(true).forEach(System.out::println );

        System.out.println("false");

        booleanListMap.get(false)
                .forEach(System.out::println);

        System.out.println();


        //grouping by and average

        //like departmenent and salary
        Map<Integer, Double> integerDoubleMap = users.stream()
                .collect(
                        Collectors.groupingBy(
                                user -> user.getAge()
                                , Collectors.averagingDouble(user -> user.getId())
                        )
                );

        //sum of grouping the feild

        Map<Integer, Integer> collected = users.stream()
                .collect(
                        Collectors.groupingBy(
                                user -> user.getAge(), Collectors.summingInt(user -> user.getId())
                        )
                );

        System.out.println(collected);

        System.out.println(integerDoubleMap);





    }
}
