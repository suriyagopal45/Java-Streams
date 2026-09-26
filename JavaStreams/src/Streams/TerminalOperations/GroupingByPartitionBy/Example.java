package Streams.TerminalOperations.GroupingByPartitionBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
1) GroupingBy
2)PartitionBY
 */
class Student
{
    int rollno;
    String name;
    String standard;


    public Student(int rollno, String name, String standard) {
        this.rollno = rollno;
        this.name = name;
        this.standard = standard;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getStandard() {
        return standard;
    }
}
public class Example {
    static void main() {

        List<Student> students = Arrays.asList(
                new Student(1, "Suriya", "X"),
                new Student(2, "Sai", "X"),
                new Student(3, "Raj", "XII")

        );

        Map<String,List<Student>> stringListMap = students.stream()
                .collect(Collectors.groupingBy(Student::getStandard));


        for(String temp : stringListMap.keySet())
        {
            System.out.println(temp+" ");
            for(Student student:stringListMap.get(temp))
            {
                System.out.println(student.getName()+ " ");
            }
            System.out.println();
        }

        //PartitionBy

        Map<Boolean,List<Student>> booleanListMap = students.stream()
                .collect(Collectors.partitioningBy(var->var.getRollno()>=2));


        System.out.println("Students greater than 2");
        booleanListMap.get(true).forEach(var-> System.out.print(var.getName()+" "));

        System.out.println();
        System.out.println("Students lesser than 2");
        booleanListMap.get(false).forEach(var-> System.out.print(var.getName()+" "));


    }
}
