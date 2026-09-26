package Streams.Problems.Intermediate;

import java.util.*;
import java.util.stream.Collectors;

record Employee(int id,int age,String name,String Dept,int salary){}
public class Example2 {

    static void main() {

        List<Employee> employees = Arrays.asList(
                new Employee(1,21,"Suriya","IT",70000),
                new Employee(2,21,"Sai","IT",60000),
                new Employee(3,34,"Raj","CEO",80000),
                new Employee(4,19,"Ram","CEO",84000),
                new Employee(5,34,"Leo","Manager",45000)
        );

        //groupBY and find max in the grouping field
//same as maxBy returns maximum value
        Map<String, Optional<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.Dept(),
                        Collectors.minBy(Comparator.comparing(employee -> employee.salary()))));

        System.out.println(collect);

        // groupby and counting

        Map<String, Long> collect1 = employees.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.Dept(), Collectors.counting()
                ));

        System.out.println(collect1);
        List<Map.Entry<String, Long>> entryList = collect1.entrySet()
                .stream()
                .filter(var -> var.getValue() == 2)
                .collect(Collectors.toList());
        //it returns list of map values but if i need only keys or values use map function


        //map to stream
        List<String> stringList = collect1.entrySet()
                .stream()
                .filter(var -> var.getValue() == 2)
                .map(var -> var.getKey())
                .collect(Collectors.toList());

        //filter the map

        System.out.println(stringList);




        //combine both streams

        List<String> stringList1 = employees.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.Dept(), Collectors.counting()
                )).entrySet().stream()
                .filter(var -> var.getValue() == 2)
                .map(var -> var.getKey())
                .toList();


        //another example

        List<Integer> arr = Arrays.asList(1,2,3,4);

        List<Integer> list = arr.stream()
                .filter(var -> var % 2 == 0)
                .map(var -> var + 23)
                .toList()  // it again create a stream combining two pipelines
                .stream()
                .filter(var -> var % 2 == 1)
                .toList();

        System.out.println(list);


        //find the department with highest average salary

        Map<String, Double> collect2 = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.Dept(), Collectors.averagingDouble(emp -> emp.salary())));


        System.out.println(collect2);

        Optional<Map.Entry<String, Double>> first = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.Dept(), Collectors.averagingDouble(emp -> emp.salary())))
                .entrySet().stream()
                .sorted(Comparator.comparingDouble((Map.Entry<String, Double> emp) ->emp.getValue()).reversed())
                .findFirst();
        System.out.println(first.get());


        //or find the max salary

        Map.Entry<String, Double> stringDoubleEntry = collect2.entrySet().stream()
                .min(Comparator.comparingDouble(emp -> emp.getValue())).orElse(Map.entry("0", 0.0));

        System.out.println(stringDoubleEntry);


    }
}
