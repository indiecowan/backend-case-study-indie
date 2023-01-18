import Error;

public class ComLineChange {
    public static void main(String[] args) {
        // don't allow input that is greater than double max
        if (Double.parseDouble(args[0]) == Double.POSITIVE_INFINITY || Double.parseDouble(args[0]) == Double.NEGATIVE_INFINITY) {
            System.err.println("Error: input is too big/small for range of double. Please try again.");
            Error e = new Error;
            throw e;

        } else {
            Change result = ChangeFinder.calculateChange(Double.parseDouble(args[0]));
            System.out.println("Needed change:");
            result.printChange();
        }
    }
}
