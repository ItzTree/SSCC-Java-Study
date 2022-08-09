import java.util.*;

public class JumpToJava {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(numbers)
                .filter((a) -> a % 2 == 1)
                .map((a) -> a * 2)
                .toArray();

        for (int x : result) {
            System.out.printf("%d ", x);
        }
    }
}
