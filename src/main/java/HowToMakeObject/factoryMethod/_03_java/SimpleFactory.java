package HowToMakeObject.factoryMethod._03_java;

import HowToMakeObject.factoryMethod._02_after.JHYShip;
import HowToMakeObject.factoryMethod._02_after_java8.BlackShip;

public class SimpleFactory {


    public Object createProduct(String name) {
        if (name.equals("JHYship")) {
            return new JHYShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
