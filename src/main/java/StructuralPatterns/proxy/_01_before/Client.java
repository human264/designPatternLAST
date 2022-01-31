package StructuralPatterns.proxy._01_before;

import StructuralPatterns.proxy.after.DefaultGameService;
import StructuralPatterns.proxy.after.GameService;
import StructuralPatterns.proxy.after.GameServieProxy;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServieProxy();
        gameService.startGame();
    }
}
