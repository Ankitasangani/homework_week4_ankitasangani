package homework_week4.carpetcostcalculator17;

/**
 * 3. Write a class with the name Calculator. The class needs two fields (instance variables) with name
 * floor of type Floor and carpet of type Carpet.
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
 * and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * ● Method named getTotalCost without any parameters, it needs to return the calculated total
 * cost to cover the floor with a carpet.
 *
 * → OUTPUT
 * * total= 38.5
 * * total= 36.45
 * * NOTE: All methods should be defined as public NOT public static.
 * * NOTE: In total, you have to write 4 classes.
 */

public class Calculator {

    // Instance Variable
    Floor floor;
    Carpet carpet;

    // Constructor with Params to initialize floor and carpet
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Instance method to get total cost to cover the floor with carpet
    public double getTotalCost() {
        double calculatedTotalCost = floor.getArea() * carpet.getCost();
        return calculatedTotalCost;
    }
}























