package HowToMakeObject.factoryMethod._02_after_java8;

public class BlackShipFactory extends DefaultShipFactory {


    @Override
    public void sendEmailTo(String email, Ship ship) {

    }

    @Override
    public BlackShip createShip() {
        return new BlackShip();
    }




}
