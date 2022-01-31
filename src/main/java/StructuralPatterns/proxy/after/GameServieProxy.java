package StructuralPatterns.proxy.after;

public class GameServieProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        if (gameService == null){
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);

    }
}
