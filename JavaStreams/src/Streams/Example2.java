package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/*
1) Distinct
2) Sort
3) Peek

 */
public class Example2 {
    static void main() {


        List<Integer> arrr = new ArrayList<>(List.of(3,4,1,4,5,3,5,4,2,3,1));

        arrr.stream().distinct().peek(var->{
            System.out.print(var+" ");
        }).forEach(var->{
            System.out.println(var+" it prints one by one not peak complete and forEach performs ");
        });

        System.out.println();
        arrr.stream().distinct().forEach(var->{
            System.out.print(var+" ");
        });
        /*
        "C:\Program Files\Java\jdk-25.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.1\lib\idea_rt.jar=64188" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\Java\Streams\Java-Streams\JavaStreams\out\production\JavaStreams Streams.Example2
3 3 it prints one by one not peak complete and forEach performs
4 4 it prints one by one not peak complete and forEach performs
1 1 it prints one by one not peak complete and forEach performs
5 5 it prints one by one not peak complete and forEach performs

Process finished with exit code 0

         */


        //filter and distinct
        System.out.println();

        int [] arr = {1,11,21,7,2,2,3,3,5,2,1,6};

        Arrays.stream(arr).filter(var->var%2==1).forEach(var-> System.out.print(var+" "));

        System.out.println();
        Arrays.stream(arr).filter(var->var%2==1).distinct().forEach(var-> System.out.print(var+" "));

        System.out.println();
        //Sort intermediate function to sort the array

        Arrays.stream(arr).filter(var->var%2==1).distinct().sorted()
                .forEach(var-> System.out.print(var+" "));



    }
}
