package StructuralPatterns.composite.before.udemy;

public class App {


    public static void main(String[] args) {
        Grachic drawing = new Grachic("Circle");
        drawing.children.add(new Circle("Red"));
        drawing.children.add(new Circle("Blue"));

        Grachic drawing1 = new Grachic("Square");
        drawing1.children.add(new Circle("Red"));
        drawing1.children.add(new Circle("Blue"));

        drawing.children.add(drawing1);


        System.out.println(drawing.description());
    }
}
