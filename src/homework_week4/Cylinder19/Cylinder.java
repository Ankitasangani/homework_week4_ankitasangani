package homework_week4.Cylinder19;

/**
 * 2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance
 * variable) with name height of type double.
 * The class needs to have one constructor with two parameters radius and height both of type double.
 * It needs to call the parent constructor and initialize a height field.
 * In case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getHeight without any parameters, it needs to return the value of height
 * field.
 * <p>
 * ● Method named getVolume without any parameters, it needs to return the calculated volume.
 * To calculate volume, multiply the area with height.
 */

public class Cylinder extends Circle {

    // Instance variable
    double height;

    // Constructor with params
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;

    }

    // Set the value for height
    public void setHeight() {
        if (height < 0) {
            height = 0;
        }
    }

    //Instance methods
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double area = getArea();
        double volume = area * height;
        return volume;
    }
}
