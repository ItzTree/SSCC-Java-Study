class TV {
    String tvMaker;
    int tvYear;
    int tvInch;

    TV(String maker, int year, int inch) {
        tvMaker = maker;
        tvYear = year;
        tvInch = inch;
    }

    void show() {
        System.out.println(tvMaker + "에서 만든 " + tvYear + "년형 " + tvInch + "인치 TV");
    }
}

public class JumpToJava {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
