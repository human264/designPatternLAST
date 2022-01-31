package HowToMakeObject.factoryMethod._02_after;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.print(new JHYShipFactory(), "JHYSHip", "human264@gmail.com");
        client.print(new BlackShipFactory(), "bloackSHIp", "adkf@akdf.net");

//        Ship jhyShip = new JHYShipFactory().orderShip("JHYship", "human264@gmail.com");
//        System.out.println(jhyShip);
//        Ship blackShip = new BlackShipFactory().orderShip("Blackship", "human264@gmail.com");
//        System.out.println(blackShip);
    }

    //Interface 로 client 도 최소화 되도록 수
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
