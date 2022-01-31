package StructuralPatterns.proxy.after;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("이자리에 오신 것을 환영합니다.");
    }
}
