package org.sda.homework;

public class Rectangle extends Shape {

    private float width;
    private float height;

    public Rectangle(String name, float area, float width, float height) {
        super(name, area);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public String getName() {
        return "Wonderful Rectangle";
    }
    @Override
    public float getArea() {
        return super.getArea() / (width * height);
}

    @Override
    public float getPerimeter() {
        return (2* getHeight()) + (2* getWidth());
    }

}
