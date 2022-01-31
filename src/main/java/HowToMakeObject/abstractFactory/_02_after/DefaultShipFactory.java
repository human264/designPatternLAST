package HowToMakeObject.abstractFactory._02_after;


import HowToMakeObject.factoryMethod._02_after.Ship;
import HowToMakeObject.factoryMethod._02_after.ShipFactory;

public abstract class DefaultShipFactory implements ShipFactory {

    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "다만들었습니다.");
    }


}
