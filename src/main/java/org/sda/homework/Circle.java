package org.sda.homework;

public class Circle extends Shape {

    private float radius;
    final float Pii = 3.14f;

    public Circle(String name, float area, float radius) {
        super(name, area);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPii() {
        return Pii;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Pii=" + Pii +
                '}';
    }
    @Override
    public String getName() {
        return "Amazing Circle";
    }

    @Override
    public float getArea() {
        return super.getArea() / (radius*radius) / getPii();
    }

    @Override
    public float getPerimeter() {
        return 2* getPii() * getRadius();
    }
}

