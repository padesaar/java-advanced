package org.sda.homework;

/**
 *
 *  Create a Shape class.
 *  a) Add fields, create constructor, getters and setters.
 *  b) Create classes Rectangle and Circle. Both of them should inherit class Shape. (getter and setter)
 *  c) Which fields and methods are common? (override)
 *  @author Kätlin Padesaar-Korela
 *
 */

public abstract class Shape {
        private String name;
        private float area;
        private float perimeter;

        public float getPerimeter() {
                return perimeter;
        }

        public void setPerimeter(float perimeter) {
                this.perimeter = perimeter;
        }

        public Shape(String name, float area) {
                this.name = name;
                this.area = area;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public float getArea() {
                return area;
        }

        public void setArea(float area) {
                this.area = area;
        }





}
