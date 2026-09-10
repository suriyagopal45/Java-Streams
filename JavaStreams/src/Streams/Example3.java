package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Box converts int to Integer
1) Sort in descending order
2) Comparator
3) Skip
 */

class Student
{
    int age;
    int rollno;

    public Student(int age, int rollno) {
        this.age = age;
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public int getRollno() {
        return rollno;
    }
}
public class Example3 {
    static void main() {

        int[] arr = {2,3,1,55,2,3};

        //reverse order
        //if its Wrapper class no need boxed
        Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(var-> System.out.print(var+" "));
        System.out.println();

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(23,4));
        studentList.add(new Student(24,1));
        studentList.add(new Student(22,5));
        studentList.add(new Student(31,21));
        studentList.add(new Student(33,6));


        studentList.stream().sorted(Comparator.comparingInt((Student var)->var.getAge()).reversed())
                .forEach(var-> System.out.println(var.age+" "+var.rollno));

        System.out.println();

        List<String> fruits = Arrays.asList("Apple","Banana","Guava");

        fruits.stream().sorted(Comparator.comparingInt(String::length))
                .forEach(var-> System.out.print(var+" "));

        //Skip





    }
}
