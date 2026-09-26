package Streams.TerminalOperations;

import java.util.stream.Stream;

public class AnyMatch {
    static void main() {


        String s = "  Suriya  ";

        String strip = s.strip();
        System.out.println(s);
        System.out.println(strip);


        //remove whitespace

        StringBuffer string = new StringBuffer("Raj");

       final boolean b = Stream.of(1, 2, 3, 2, 1, 2, 3, 4)
                .anyMatch(var -> var == 222);


        System.out.println(b);

    }
}
