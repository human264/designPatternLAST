package StructuralPatterns.composite.before.udemy.Interface;

public class App {

    public static void main(String[] args) {
        GraphicalInterface drawing = new Grachic();
        drawing.addChildren(new Circle("Red"));
        drawing.addChildren(new Circle("Blue"));
        drawing.addChildren(new Square("무슨색"));


        System.out.println(drawing.description());

    }
}
