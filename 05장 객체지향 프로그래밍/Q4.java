import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    int avg(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum / nums.length;
    }

    int avg(ArrayList<Integer> nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum / nums.size();
    }
}

public class JumpToJava {
    public static void main(String[] args) {
        int[] data1 = {1, 3, 5, 7, 9};
        Calculator cal1 = new Calculator();
        int result1 = cal1.avg(data1);
        System.out.println(result1);

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator cal2 = new Calculator();
        int result2 = cal2.avg(data2);
        System.out.println(result2);
    }
}

