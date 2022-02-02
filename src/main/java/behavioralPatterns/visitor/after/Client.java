package behavioralPatterns.visitor.after;


public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();

        Shape triangle = new Triangle();
        Device device1 = new Pad();
        triangle.accept(device);

    }
}
