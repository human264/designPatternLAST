package behavioralPatterns.visitor.after;

public class Phone implements Device {

    @Override
    public void print(Rectangle circle) {
        System.out.println("print Rectangle to Phone");

    }

    @Override
    public void print(Circle circle) {
        System.out.println("print Circle to Phone");

    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to Phone");

    }

}
