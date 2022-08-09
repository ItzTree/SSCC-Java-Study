public class Problem2 {
    int getTotalPage(int m, int n) {
        if (m % n == 0) {
            return m / n;
        }
        return m / n + 1;
    }

    public static void main(String[] args) {
        Problem2 p = new Problem2();

        System.out.println(p.getTotalPage(5, 10));
        System.out.println(p.getTotalPage(15, 10));
        System.out.println(p.getTotalPage(25, 10));
        System.out.println(p.getTotalPage(30, 10));
    }
}
