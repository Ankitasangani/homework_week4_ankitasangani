package homework_week4.carpetcostcalculator17;

/**
 * Carpet Cost Calculator
 * The Carpet Company has asked you to write an application that calculates the price of carpeting for
 * rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by
 * the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10
 * meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter
 * would cost $960.
 *
 * 1. Write a class with the name Floor. The class needs two fields (instance variables) with name width
 * and length of type double.
 * The class needs to have one constructor with parameters width and length of type double and it
 * needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length
 * parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (width * length).

 * → OUTPUT
 * total= 38.5
 * total= 36.45
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 4 classes.
 */
public class Floor {

    // Instance variable
    double width;
    double length;

    // Constructor to initialize width and length
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Method to set width
    public void setWidth() {
        if (width < 0) {
            width = 0; // If width is < 0, set it to 0
        }
    }

    // Method to set length
    public void setLength() {
        if (length < 0) {
            length = 0; //If length is < 0, set it to 0
        }
    }

    // Method to calculate and return the Calculated Area
    public double getArea() {
        double calculatedArea = (width * length);
        return calculatedArea;
    }
}






























