import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Wordld!");

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 4, 3, 2));

        List<Integer> arr2 = Arrays.asList(3, 4, 5);

        System.out.println("Hi");

        arr2.stream().map(i -> i + 1).forEach(System.out::print);
        System.out.println();

        arr2.stream().map(i -> i + 10).forEach(System.out::println);

    }
}