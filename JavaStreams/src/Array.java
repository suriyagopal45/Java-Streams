import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int a[] = { 2, 3, 4, 5 };

        Arrays.stream(a).filter(i -> i % 2 == 0).forEach(System.out::println);
    }

}
