class SharpPencil { // 샤프펜슬
    protected int width;  // 펜의 굵기
    protected int amount; // 남은 양

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class BallPen extends SharpPencil { // 볼펜
    protected String color;   // 볼펜의 색

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class FountainPen extends BallPen { // 만년필
    public void refill(int n) {
        this.amount = n;
    }
}

public class JumpToJava {
    public static void main(String[] args) {
        FountainPen fountainPen = new FountainPen();

        fountainPen.setAmount(10);
        System.out.println("남은 양은 " + fountainPen.getAmount());
        fountainPen.setColor("Blue");
        System.out.println("만년필의 색은 " + fountainPen.getColor());
        fountainPen.refill(20);
        System.out.println("남은 양은 " + fountainPen.getAmount());
    }
}
