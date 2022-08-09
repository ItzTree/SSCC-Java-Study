import java.util.ArrayList;

class HeavyWork extends Thread {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    public void run() {
        work();
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);  // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }
}

public class JumpToJava {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            Thread t = new Thread(new HeavyWork("w" + i));
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (Exception e) {

            }
        }

        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}
