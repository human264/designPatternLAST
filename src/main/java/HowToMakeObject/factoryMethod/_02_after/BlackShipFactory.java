package HowToMakeObject.factoryMethod._02_after;

public class BlackShipFactory implements ShipFactory {


    @Override
    public Ship orderShip(String name, String email) {
        return ShipFactory.super.orderShip(name, email);
    }



    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
