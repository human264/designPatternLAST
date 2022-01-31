package StructuralPatterns.composite.before.udemy.Interface;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape implements GraphicalInterface {

    public List<Shape> children = new ArrayList<>();
    protected String name = "";
    protected String color = "";


    @Override
    public List<Shape> getChildren() {
        return children;
    }

    @Override
    public void addChildren(Shape shape) {

    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getName() {
        return this.name;
    }


}
