package org.sda.homework;

public class Shape {
   private float radius; // it's actually 0.5 width
    final float Pii = 3.14f;
    private float width;
    private float height;


    public Shape() {

    }

    public Shape(float radius, float width, float height) {
        this.radius = radius;
        this.width = width;
        this.height = height;
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
}
