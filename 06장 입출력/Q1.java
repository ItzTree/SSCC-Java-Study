import java.util.Scanner;

public class JumpToJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int b = sc.nextInt();

        int c = a + b;
        System.out.println("두 수의 합 : " + c);
    }
}
