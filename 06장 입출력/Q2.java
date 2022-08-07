import java.util.Scanner;

public class JumpToJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(">> ");
            String str = sc.nextLine();

            if (str.equals("END")) break;

            System.out.println(str.toUpperCase());
        }
    }
}
