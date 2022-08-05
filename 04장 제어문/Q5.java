public class JumpToJava {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        int avg;

        for (int score : marks) {
            sum += score;
        }

        avg = sum / marks.length;
        System.out.println(avg);
    }
}
