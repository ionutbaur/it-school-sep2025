package com.itschool.session13.course;

public class Window {

    // uses the Encapsulation principle - al instance fields are private
    private int length; // by default 0
    private int width; // be default 0
    private String color; // by default null
    private boolean hasSeeView; // by default false
    private boolean hasMountainView; // by default false

    public int getLength() {
        return length;
    }

    // control over properties
    public void setLength(int length) {
        if (length < 0) {
            System.out.println("Length cannot be negative!");
        } else {
            this.length = length;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isHasSeeView() {
        return hasSeeView;
    }

    public void setHasSeeView(boolean hasSeeView) {
        this.hasSeeView = hasSeeView;
    }

    public boolean isHasMountainView() {
        return hasMountainView;
    }

    public void setHasMountainView(boolean hasMountainView) {
        this.hasMountainView = hasMountainView;
    }

    @Override
    public String toString() {
        return "Window{" +
                "hasSeeView=" + hasSeeView +
                ", length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", hasMountainView=" + hasMountainView +
                '}';
    }
}
