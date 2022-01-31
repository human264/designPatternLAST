package HowToMakeObject.factoryMethod._02_after_java8;

public abstract class DefaultShipFactory implements ShipFactory {



    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + "다만들었습니다.");
    }
}
