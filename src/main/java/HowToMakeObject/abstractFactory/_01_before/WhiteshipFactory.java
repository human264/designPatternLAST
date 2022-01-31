package HowToMakeObject.abstractFactory._01_before;

import HowToMakeObject.abstractFactory._02_after.DefaultShipFactory;
import HowToMakeObject.abstractFactory._02_after.Whiteship;
import HowToMakeObject.factoryMethod._02_after.Ship;


public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
