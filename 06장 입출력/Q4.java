import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class JumpToJava {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("sample.txt", true));
        Scanner sc = new Scanner(System.in);

        System.out.print("추가할 문장 : ");
        String str = sc.nextLine();
        pw.println(str);

        pw.close();
    }
}
