package Streams.TerminalOperations;

import java.util.stream.Stream;

public class Collect {
    static void main() {

      Stream.of(1,2,3,4).filter(var->var%2==0).map(var->var+20)
                .forEach(
                        var-> System.out.print(var+" "));









    }





    }

