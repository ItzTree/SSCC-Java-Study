import java.util.ArrayList;
import java.util.Arrays;

public class JumpToJava {
    public static void main(String[] args) {
        int result = 0;
        try {
            int[] a = {1, 2, 3};
            int b = a[3];   // 배열 a는 a[2]까지만 존재하므로 a[3]을 얻기 위해 접근하면
                            // ArrayIndexOutOfBoundsException 이 발생함
            ArrayList c = new ArrayList(Arrays.asList("3"));
            int d = (int) c.get(0);     // 리스트 c에서 "3"이라는 문자열을 정수로 바꾸려고 해서
                                        // ClassCastException 이 발생함
            int e = 4 / 0;  // 0으로 나눌 수 없으므로 ArithmeticException 이 발생함
        } catch (ClassCastException e) {
            result += 1;
        } catch (ArithmeticException e) {
            result += 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            result += 3;
        } finally {
            result += 4;
        }
        System.out.println(result); // result 의 값은 무엇일까?
        // ArrayIndexOutOfBoundsException 이 먼저 발생해서 result += 3 이 실행되고
        // finally 이 실행되어 result += 4 라는 문장으로 인해
        // result = 7 이 되었다
    }
}
