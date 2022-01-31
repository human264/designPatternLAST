package StructuralPatterns.composite.before.udemy.Interface;

import java.util.ArrayList;
import java.util.List;

public class Grachic implements GraphicalInterface {

    private List<Shape> shapes = new ArrayList<>();

    private String name = "Group";
    private String color = "";

    public Grachic() {

    }

    @Override
    public List<Shape> getChildren() {
        return this.shapes;
    }

    @Override
    public void addChildren(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }



}
