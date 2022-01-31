package HowToMakeObject.abstractFactory._02_after;

import HowToMakeObject.abstractFactory._01_before.WhiteAnchor;
import HowToMakeObject.abstractFactory._01_before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return (Anchor) new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return (Wheel) new WhiteWheel();
    }
}
