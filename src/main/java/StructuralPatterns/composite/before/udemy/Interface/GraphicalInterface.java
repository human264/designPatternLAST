package StructuralPatterns.composite.before.udemy.Interface;

import java.util.List;

public interface GraphicalInterface {
    List<Shape> getChildren();

    void addChildren(Shape shape);
    String getColor();
    String getName();

    default void print(StringBuffer buffer, int depth) {
        String repeat = "*";
        buffer.append(repeat.repeat(depth)).append(getColor().isEmpty()?"":getColor()).append(getName())
                .append("\n");
        for (int i=0; i < getChildren().size(); i++) {
            getChildren().get(i).print(buffer, depth + 1);
        }
    }

    default String description() {
        StringBuffer buffer = new StringBuffer();
        print(buffer, 0);
        return buffer.toString();
    }

}
