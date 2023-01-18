import java.lang.Error;
import java.lang.Math;

public class ChangeFinder {

    public static Change calculateChange(Double dollars) 
    throws Error {
        if (dollars < 0) {
            System.err.println("Error: calculateChange does not take negative numbers.");
            Error e = new Error();
            throw e;
        }
        Double centsD = dollars*100;
        System.out.println(centsD);
        long cents = Math.round(centsD);
        Change change = new Change();
        System.out.println(cents);
        change.quarters = cents / 25;
        cents -= change.quarters * 25;
        System.out.println(cents);
        change.dimes = cents / 10;
        cents -= change.dimes * 10;
        System.out.println(cents);
        change.nickels = cents / 5;
        cents -= change.nickels * 5;
        System.out.println(cents);
        change.pennies = cents;
        System.out.println(cents);
        return change;
    }

    public static void main(String[] args) {
        System.out.println("TEST 1: sanity");
        double testNum = 2.32;
        Change output = calculateChange(testNum);
        System.out.println("test input: " + Double.toString(testNum));
        output.printChange();
        System.out.println();

        // edge/concern cases:
        // input is negative
        System.out.println("TEST 2: negative input");  // throws error
        testNum = -89.8;
        // output = calculateChange(testNum);
        // System.out.println("test input: " + Double.toString(testNum));
        // output.printChange();
        System.out.println();

        // input has more precision than allowed
        System.out.println("TEST 3: extraneous precision");
        testNum = 1.4763;
        output = calculateChange(testNum);
        System.out.println("test input: " + Double.toString(testNum));
        output.printChange();
        System.out.println();
        testNum = 34.12;
        output = calculateChange(testNum);
        System.out.println("test input: " + Double.toString(testNum));
        output.printChange();
        System.out.println();
        testNum = 0.0008;
        output = calculateChange(testNum);
        System.out.println("test input: " + Double.toString(testNum));
        output.printChange();
        System.out.println();

        // 0
        System.out.println("TEST 4: zero");
        testNum = 0;
        output = calculateChange(testNum);
        System.out.println("test input: " + Double.toString(testNum));
        output.printChange();
        System.out.println();

        // big number
        System.out.println("TEST 5: big number");
        testNum = 634674361.4763;
        output = calculateChange(testNum);
        System.out.println("test input: " + Double.toString(testNum));
        output.printChange();
        System.out.println();
        testNum = 6751.4763;
        output = calculateChange(testNum);
        System.out.println("test input: " + Double.toString(testNum));
        output.printChange();
        System.out.println();

        // all quarters, all dimes, etc.

    }
}
