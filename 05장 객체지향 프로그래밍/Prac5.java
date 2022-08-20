class Point {
    int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    String color;

    ColorPoint(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return this.color + "색의 (" + this.x + "," + this.y + ")의 점";
    }
}

public class JumpToJava {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");

        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}
