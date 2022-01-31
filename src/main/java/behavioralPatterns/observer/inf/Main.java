package behavioralPatterns.observer.inf;


public class Main {

    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();

        Observer observer = new DigitObserver();
        Observer observer2 = new GraphicObserver();
        Observer observer3 = number -> {
            for(int i = 0; i < number; i ++ ) {
                System.out.print("=");
            }
            System.out.println();
        };

        randomGenerator.addObserver(observer);
        randomGenerator.addObserver(observer2);
        randomGenerator.addObserver(observer3);


        randomGenerator.execute();
        randomGenerator.execute();
        randomGenerator.execute();



    }
}
