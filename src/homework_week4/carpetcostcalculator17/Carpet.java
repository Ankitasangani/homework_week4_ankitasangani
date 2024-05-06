package homework_week4.carpetcostcalculator17;

/**
 * 2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double.
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getCost without any parameters, it needs to return the value of cost field
 *
 * → OUTPUT
 * * total= 38.5
 * * total= 36.45
 * * NOTE: All methods should be defined as public NOT public static.
 * * NOTE: In total, you have to write 4 classes.
 */

public class Carpet {

    // Instance Variable
    double cost;

    // Constructor with Params to initialize cost
    public Carpet(double cost) {
        this.cost = cost;
    }

    // Method to set cost
    public void setCost() {
        if (cost < 0) {
            cost = 0;
        }
    }

    // Instance Method to return cost
    public double getCost() {
        return cost;
    }

}
