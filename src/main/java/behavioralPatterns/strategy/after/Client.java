package behavioralPatterns.strategy.after;

public class Client {


    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight(new Normal());
        game.blueLight();
        game.redLight();

        BlueLightRedLight game1 = new BlueLightRedLight(new Faster());
        game1.blueLight();
        game1.redLight();

        BlueLightRedLight game2 = new BlueLightRedLight(new Fastest());
        game2.blueLight();
        game2.redLight();


    }
}
