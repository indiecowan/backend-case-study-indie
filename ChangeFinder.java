public class ChangeFinder {

    public Change calculateChange(double dollars) {
        int cents = (int)dollars*100;  // TODO: test this
        Change change = new Change();
        change.quarters = cents % 25;
        cents -= change.quarters * 25;
        change.dimes = cents % 10;
        cents -= change.dimes * 10;
        change.nickels = cents % 5;
        cents -= change.nickels * 5;
        change.pennies = cents;
        return change;
    }

    public static void main(String[] args) {
        
    }
}
