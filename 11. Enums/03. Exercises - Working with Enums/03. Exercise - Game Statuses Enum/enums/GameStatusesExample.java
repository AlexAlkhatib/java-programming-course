package enums;

public class GameStatusesExample {
    public static void main(String[] args) {
        for (GameStatus status : GameStatus.values()) {
            System.out.println("Game Status: " + status);
        }

        GameStatus currenStatus = GameStatus.PAUSED;
        System.out.println("Current Game Status: " + currenStatus);
    }
}