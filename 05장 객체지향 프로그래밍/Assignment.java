class Game {
    String gameName;
    int gameUsers;

    Game(String name, int users) {
        gameName = name;
        gameUsers = users;
    }

    void printGameInfo() {
        System.out.println(gameName + " 게임의 유저 수는 " + gameUsers + "명 입니다.");
    }
}

public class JumpToJava {
    public static void main(String[] args) {
        Game kartRider = new Game("카트라이더", 150);
        Game mapleStory = new Game("메이플스토리", 200);

        kartRider.printGameInfo();
        mapleStory.printGameInfo();
    }
}

