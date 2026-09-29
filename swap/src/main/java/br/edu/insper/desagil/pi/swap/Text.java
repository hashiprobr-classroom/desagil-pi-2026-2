package br.edu.insper.desagil.pi.swap;

public class Text extends Widget {
    private String content;

    public Text(int x, int y, int width, int height, String content) {
        super(x, y, width, height);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void clear() {
        setContent("");
    }

    public void lower() {
        content = content.toLowerCase();
    }

    public void upper() {
        content = content.toUpperCase();
    }
}
