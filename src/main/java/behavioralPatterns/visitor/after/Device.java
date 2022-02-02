package behavioralPatterns.visitor.after;

public interface Device {

    void print(Rectangle circle);

    void print(Circle circle);

    void print(Triangle triangle);
}
