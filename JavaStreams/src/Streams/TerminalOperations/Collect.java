package Streams.TerminalOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {
    static void main() {

     List<Integer> integerList= Stream.of(1,2,3,4)
             .filter(var->var%2==0)
             .map(var->var+20)
             .collect(Collectors.toList());

     for(Integer i:integerList)
     {
         System.out.print(i+" ");
     }








    }





    }

