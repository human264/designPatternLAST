package StructuralPatterns.composite.before.udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grachic {

    private String name = "Group";
    private String color = "";

    public List<Grachic> children = new ArrayList<>();

    protected Grachic(String color) {
        this.color = color;

    }

    public void print(StringBuffer buffer, int depth) {
        String repeat = "*";
        buffer.append(repeat.repeat(depth)).append(color.isEmpty()?"":color).append(name)
                .append("\n");
        for (int i=0; i < children.size(); i++) {
            children.get(i).print(buffer, depth + 1);
        }
    }

    public String description() {
        StringBuffer buffer = new StringBuffer();
        print(buffer, 0);
        return buffer.toString();
    }



}
