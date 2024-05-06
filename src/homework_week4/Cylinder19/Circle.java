package homework_week4.Cylinder19;

/**
 * Cylinder
 * 1. Write a class with the name Circle. The class needs one field (instance variable) with name radius
 * of type double.
 * The class needs to have one constructor with parameter radius of type double and it needs to initialize
 * the fields.
 * In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getRadius without any parameters, it needs to return the value of the radius
 * field.
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (radius * radius * PI). For PI use Math.PI constant.
 */

public class Circle {

    //Instance variable
    double radius;

    // Constructor with params and initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Set the radius value
    public void setRadiusValue() {
        if (radius < 0) {
            radius = 0;
        }
    }

    //Instance methods
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = (radius * radius * Math.PI);
        return area;
    }

}

























