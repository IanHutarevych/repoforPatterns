package creational.Singleton;

public class GameEngine {
    private static GameEngine instance;

    private GameEngine() {}

    public static synchronized GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    public void start() {
        System.out.println("Game engine started");
    }
}
