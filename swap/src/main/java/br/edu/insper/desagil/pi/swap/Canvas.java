package br.edu.insper.desagil.pi.swap;

import java.util.ArrayList;
import java.util.List;

public class Canvas extends Widget {
    private List<Widget> children;

    public Canvas(int x, int y, int width, int height) {
        super(x, y, width, height);
        children = new ArrayList<>();
    }

    public List<Widget> getChildren() {
        return children;
    }

    public void addChild(Widget widget) {
        children.add(widget);
    }
}
