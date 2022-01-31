package HowToMakeObject.abstractFactory._02_after;

import HowToMakeObject.factoryMethod._02_after.Ship;
import HowToMakeObject.factoryMethod._02_after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {

        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());

        Ship ship = shipFactory.createShip();
        shipFactory.orderShip("hi", "sdf@sf");
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
