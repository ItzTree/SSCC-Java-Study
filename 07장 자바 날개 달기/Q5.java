import java.util.*;

public class JumpToJava {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] result = Arrays.stream(numbers)
                .filter((a) -> a >= 0)
                .toArray();

        for (int x : result) {
            System.out.printf("%d ", x);
        }
    }
}
