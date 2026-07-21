import java.util.stream.Stream;

//No Collection and Arrays
public class StreamOf {
    public static void main(String[] args) {

        Stream<Integer> s = Stream.of(1, 2, 3, 4, 4);

        s.map(i -> i + 3).forEach(System.out::println);
        s.close();

        s.forEach(System.out::println);

    }

}
