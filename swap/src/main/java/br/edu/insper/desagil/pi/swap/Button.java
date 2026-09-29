package br.edu.insper.desagil.pi.swap;

public class Button extends Widget {
    private Text text;
    private int margin;

    public Button(int x, int y, Text text, int margin) {
        super(x, y, text.getX() + text.getWidth() + margin, text.getY() + text.getHeight() + margin);
        this.text = text;
        this.margin = margin;
    }

    public Text getLabel() {
        return text;
    }

    @Override
    public void setWidth(int width) {
        text.setWidth(width - horizontalSpace());
    }

    @Override
    public void setHeight(int height) {
        text.setHeight(height - verticalSpace());
    }

    private int horizontalSpace() {
        return text.getX() + margin;
    }

    private int verticalSpace() {
        return text.getY() + margin;
    }
}
