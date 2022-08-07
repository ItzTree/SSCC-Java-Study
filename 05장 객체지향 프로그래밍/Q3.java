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

    boolean isOdd(int num) {
        return num % 2 == 1;
    }
}

public class JumpToJava {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.isOdd(5));
        System.out.println(cal.isOdd(8));
    }
}

