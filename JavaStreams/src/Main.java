import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Wordld!");

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 4, 3, 2));

        List<Integer> arr2 = Arrays.asList(3, 4, 5);

        System.out.println("Hddsssdi");

        arr2.stream().map(i -> i + 1).forEach(System.out::print);

        int a[] = { 1, 2, 3, 42, 2 };
        for (int i : a) {
            System.out.println(i);
        }

        Arrays.stream(a).map()
    }
}