package org.sda.homework;

/***
 * Just tried out how Shape inheritence works in Main class.
 *
 * @author Kätlin Padesaar-Korela
 */

public class MainShapeHomework {
    public static void main(String[] args) {

        Circle circle = new Circle("Amazing Circle", 90f, 5f);
        System.out.println("Shape name:" + circle.getName() + " .Shape area:" + circle.getArea());

        Rectangle rectangle = new Rectangle("Wonderful Rectangle", 15.6f, 3f, 7.8f);
        System.out.println("Rectangle area:" + rectangle.getArea());
        System.out.println("Shape name:" + rectangle.getName());

        Circle circle1 = new Circle("New Circle", 90f, 5f);
        circle1.setRadius(79f);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getName());
        System.out.println(circle1.toString());
    }
}
