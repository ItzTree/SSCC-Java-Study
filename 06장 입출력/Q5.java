import java.io.*;
import java.util.ArrayList;

public class JumpToJava {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        ArrayList<String> arr = new ArrayList<>();

        while (true) {
            String str = br.readLine();

            if (str == null) break;

            str = str.replaceAll("python", "java");
            arr.add(str);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter("sample.txt"));
        for (String str : arr) {
            pw.println(str);
        }
        pw.close();
    }
}
